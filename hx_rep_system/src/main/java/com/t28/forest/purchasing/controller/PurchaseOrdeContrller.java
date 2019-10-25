/**
 * @description 控制类
 * @author HF
 * @create 2019/10/23
 * @since 1.0.0
 */
package com.t28.forest.purchasing.controller;

import com.t28.forest.purchasing.extract.ExtractPurchaseOrderDTO;
import com.t28.forest.purchasing.service.PurchaseOrderService;
import com.t28.forest.sales.vo.PageVO;
import com.t28.forest.shared.cond.Condition;
import com.t28.forest.shared.entity.SupplierDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PurchaseOrdeContrller {

    @Autowired
    private PurchaseOrderService purchaseOrderService;

    @RequestMapping("/showDepothadInfo")
    public String show(Model model, PageVO pageVO, Condition condition) {
        List<ExtractPurchaseOrderDTO> allDepothead = purchaseOrderService.getAllDepothead(pageVO, condition);
        // 查询数据总条数，计算总页数
        int count = purchaseOrderService.getBillCount(condition);
        int totalPage = count % pageVO.getPageSize() == 0 ? count / pageVO.getPageSize() : count / pageVO.getPageSize() + 1;
        pageVO.setTotal(totalPage);

        List<SupplierDTO> allName = purchaseOrderService.getAllName();
        model.addAttribute("allname", allName);
        model.addAttribute("pageVO", pageVO);
        model.addAttribute("showall", allDepothead);
        return "purchasing/purchaseorder";
    }

    @RequestMapping("/add")
    public String addsupplier(SupplierDTO supplierDTO) {
        boolean b = purchaseOrderService.addSupplierInfo(supplierDTO);
        if (b) {
            return "redirect:/showDepothadInfo";
        }
        return "purchasing/purchaseorder";
    }

    @RequestMapping("/deleteByIdInfo")
    public String DeleteById(Integer[] cElt){
        for (int i = 0; i < cElt.length; i++) {
            purchaseOrderService.deleteDepoTheadById(cElt[i]);
        }
        return "redirect:/showDepothadInfo?current=1&pageSize=4";
    }
}
