/**
 * @description
 * @author lcy
 * @create 2019/10/26
 * @since 1.0.0
 */
package com.t28.forest.warehouse.controller;

import com.t28.forest.shared.entity.DepotDTO;
import com.t28.forest.shared.entity.SupplierDTO;
import com.t28.forest.warehouse.entity.vo.WareBillVO;
import com.t28.forest.warehouse.service.WareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.sql.Date;

import java.util.List;

@Controller
public class InsertWareController {
    @Autowired
    WareService wareService;


    List<WareBillVO> wareBillVOList = null;
    /**
     *插入
     */
    @RequestMapping("/addWare")
    public ModelAndView addWare(Model model, HttpServletRequest request){
        String number =request.getParameter("number");
        int supp = Integer.getInteger(request.getParameter("supp"));
        int price = Integer.getInteger(request.getParameter("price"));
        Date OperTime = Date.valueOf(request.getParameter("OperTime"));
        wareService.insertWare(number,supp,price,OperTime);
        int id = wareService.getId();
        int name = Integer.getInteger(request.getParameter("name"));
        int dept = Integer.getInteger(request.getParameter("dept"));
        wareService.insertWareInfo(id,name,dept,price);
        return new ModelAndView("redirect:/inWarehouseVO");
    }
}
