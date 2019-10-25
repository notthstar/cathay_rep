/**
 * @description
 * @author lcy
 * @create 2019/10/23
 * @since 1.0.0
 */
package com.t28.forest.warehouse.controller;

import com.t28.forest.warehouse.entity.vo.WareBillVO;
import com.t28.forest.warehouse.service.WareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class WareCondController {
    @Autowired
    WareService wareService;

    List<WareBillVO> wareList = null;

    String number = null;
    String mate = null;
    Date startTime = null;
    Date endTime = null;
    /**
     *其它入库根据条件查询
     */
    @RequestMapping("/inWareByCond")
    public String  inWare(Model model, HttpServletRequest request, HttpServletResponse response){
        if(request.getParameter("number")!=null){
            number =  request.getParameter("number");
        }
        if(request.getParameter("mate")!=null){
            mate =  request.getParameter("mate");
        }
        if(request.getParameter("startTime")!=null){
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String str=request.getParameter("startTime");
            ParsePosition pos = new ParsePosition(0);
            startTime =  format.parse(str,pos);
        }
        if(request.getParameter("endTime")!=null){
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String str=request.getParameter("endTime");
            ParsePosition pos = new ParsePosition(0);
            endTime =  format.parse(str,pos);
        }
        wareList=wareService.getWareByCond("入库","其它",number,mate,startTime,endTime);
        model.addAttribute("inWareBillVOList",wareList);
        return "storemanagement/Otherwarehouse";
    }


}
