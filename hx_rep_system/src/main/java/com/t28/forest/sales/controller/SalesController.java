package com.t28.forest.sales.controller;

import com.t28.forest.sales.service.DepoTheadService;
import com.t28.forest.sales.vo.PageVO;
import com.t28.forest.sales.vo.SalesBillVO;
import com.t28.forest.shared.cond.Condition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Arrays;
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
        // 数据添加到session中
        session.setAttribute("bills", bills);
        session.setAttribute("pageVO", pageVO);
        session.setAttribute("condition", condition);
        return "sales/sell";
    }

    @RequestMapping("/delSales")
    public String delSales(Integer[] cElt) {
        for (int i = 0; i < cElt.length; i++) {
            depoTheadService.deleteDepoTheadById(cElt[i]);
        }
        return "redirect:/showSales?current=1&pageSize=4";
    }

    @RequestMapping("/exaSales")
    public String examSales(Integer[] cElt) {
        return null;
    }

    @RequestMapping("/addSales")
    public String addSales() {
        return null;
    }

}