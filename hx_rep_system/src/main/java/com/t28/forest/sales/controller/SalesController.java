package com.t28.forest.sales.controller;

import com.t28.forest.sales.service.DepoTheadService;
import com.t28.forest.sales.vo.PageVO;
import com.t28.forest.sales.vo.SalesBillVO;
import com.t28.forest.sales.vo.SupplierVO;
import com.t28.forest.shared.cond.Condition;
import com.t28.forest.shared.entity.*;
import com.t28.forest.shared.utils.SimpleUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * @author XiangYuFeng
 * @description 单据主表控制类
 * @create 2019/10/23
 * @since 1.0.0
 */
@Controller
public class SalesController {

    @Autowired
    DepoTheadService depoTheadService;

    @RequestMapping("/showSales")
    public String showSales(PageVO pageVO, Condition condition, HttpSession session) {
        // 页面显示的销售单据信息
        List<SalesBillVO> bills = depoTheadService.getBillByPage(pageVO, condition);
        // 查询数据总条数，计算总页数
        int count = depoTheadService.getBillCount(condition);
        int totalPage = count % pageVO.getPageSize() == 0 ? count / pageVO.getPageSize() : count / pageVO.getPageSize() + 1;
        pageVO.setTotal(totalPage);
        // 查询所有仓库信息
        List<DepotDTO> depots = depoTheadService.getDepots();
        // 查询所有客户信息
        List<SupplierDTO> suppliers = depoTheadService.getSuppliers();
        // 数据添加到session中
        session.setAttribute("bills", bills);
        session.setAttribute("pageVO", pageVO);
        session.setAttribute("condition", condition);
        session.setAttribute("deptos", depots);
        session.setAttribute("suppliers", suppliers);
        return "sales/sell";
    }

    /**
     * 联动获取商品信息的方法
     * @param depotId
     */
    @RequestMapping("/materialLink")
    @ResponseBody
    public List<MaterialDTO> materialLinkage(Integer depotId, HttpSession session) {
        // 将仓库ID放入session中
        session.setAttribute("depotId", depotId);
        List<MaterialDTO> materials = depoTheadService.getMaterialsByDepotId(depotId);
        return materials;
    }


    @RequestMapping("/supplierLink")
    @ResponseBody
    public SupplierVO supplierLinkage(Integer supplierId, HttpSession session) {
        // 从session中获取到仓库ID
        Integer depotId = (Integer) session.getAttribute("depotId");
        return depoTheadService.getSupplierById(supplierId, depotId);
    }

    /**
     * 生成一个唯一订单号并返回到页面上
     * @return String
     */
    @RequestMapping("/createBill")
    @ResponseBody
    public String[] createBillNum() {
        String[] strs = new String[2];
        strs[0] = SimpleUtils.generateBillNum("XSDD");
        strs[1] = SimpleUtils.dateToStr(new Date());
        return strs;
    }

    @RequestMapping("/delSales")
    public String delSales(Integer[] cElt) {
        for (int i = 0; i < cElt.length; i++) {
            depoTheadService.deleteDepoTheadById(cElt[i]);
        }
        return "redirect:/showSales?current=1&pageSize=4";
    }

    @RequestMapping("/approveSales")
    public String approveOrdeApproveSales(Integer[] cElt, String sign) {
        if (APPROVE_SIGN.equals(sign)) {
            for (int i = 0; i < cElt.length; i++) {
                depoTheadService.approveOrDeApproveDepoTheadById(cElt[i], "1");
            }
        } else if (DEAPPROVE_SIGN.equals(sign)) {
            for (int i = 0; i < cElt.length; i++) {
                depoTheadService.approveOrDeApproveDepoTheadById(cElt[i], "0");
            }
        }
        return "redirect:/showSales?current=1&pageSize=4";
    }

    @RequestMapping("/addSales")
    public String addSales(SupplierVO supplierVO) {
        // 单据主表插入信息
        DepoTheadDTO theadDTO = new DepoTheadDTO();
        theadDTO.setType("出库");
        theadDTO.setSubType("销售");
        theadDTO.setDefaultNumber(supplierVO.getBillNum());
        theadDTO.setNumber(supplierVO.getBillNum());
        theadDTO.setOpenPersonName(supplierVO.getOperPersonName());
        theadDTO.setCreateTime(supplierVO.getBillDate());
        theadDTO.setOperTime(supplierVO.getBillDate());
        theadDTO.setOrganId(supplierVO.getSupplierId());
        theadDTO.setTotalPrice(supplierVO.getMoney());
        theadDTO.setTenantId(supplierVO.getTenantId());
        // 单据子表插入信息
        DepoTitemDTO titemDTO = new DepoTitemDTO();
        titemDTO.setMaterialId(supplierVO.getMaterialId());
        titemDTO.setmUnit(supplierVO.getUnit());
        titemDTO.setOperNumber((double)(int)supplierVO.getNum());
        titemDTO.setUnitPrice(supplierVO.getRetailPrice());
        titemDTO.setTaxUnitPrice(supplierVO.getRetailPrice());
        titemDTO.setAllPrice(supplierVO.getMoney());
        titemDTO.setDepotId(supplierVO.getDeptoId());
        depoTheadService.addSalesBill(theadDTO, titemDTO);
        return "redirect:/showSales?current=1&pageSize=4";
    }


    /**
     * 反审核标识
     */
    private static final String DEAPPROVE_SIGN = "deApprove";
    /**
     * 审核标识
     */
    private static final String APPROVE_SIGN = "approve";

}