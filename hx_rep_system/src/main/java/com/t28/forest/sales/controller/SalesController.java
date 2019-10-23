package com.t28.forest.sales.controller;

import com.t28.forest.sales.service.DepoTheadService;
import com.t28.forest.sales.vo.PageVO;
import com.t28.forest.shared.cond.Condition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String showSales(PageVO pageVO, Condition condition) {
        depoTheadService.getBillByPage(pageVO, condition);
        return "";
    }

}