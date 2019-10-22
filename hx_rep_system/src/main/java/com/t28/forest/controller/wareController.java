/**
 * @description
 * @author lcy
 * @create 2019/10/22
 * @since 1.0.0
 */
package com.t28.forest.controller;

import com.t28.forest.warehouse.entity.vo.WareBillVO;
import com.t28.forest.warehouse.service.WareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/wareController")
public class wareController {

    @Autowired
    WareService wareService;

    List<WareBillVO> wareBillVOList = null;

    @RequestMapping("/getwareBillVO")
    @ResponseBody
    public List<WareBillVO> getwareBillVO(HttpServletRequest request, HttpServletResponse response){
        String type = request.getParameter("type");
        String subType = request.getParameter("subType");
        wareBillVOList = wareService.getWareBill(type,subType);
        request.getSession().setAttribute("wareBillVOList",wareBillVOList);
        return wareBillVOList;
    }

    public void Mate(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        String merch = wareService.getMate(id);
        request.getSession().setAttribute("merch",merch);
    }
}
