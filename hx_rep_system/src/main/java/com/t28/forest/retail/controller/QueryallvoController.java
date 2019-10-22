package com.t28.forest.retail.controller;

import com.t28.forest.retail.entity.Queryallvo;
import com.t28.forest.retail.service.impl.QueryallvoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 功能描述:数据显示控制层
 *
 * @since: 1.0.0
 * @Author: Zsy
 * @Date: 2019/10/21$
 */
@Controller
public class QueryallvoController {

    @Autowired
    private QueryallvoServiceImpl queryallvoService;

    public ModelAndView getAllQueryallvo(){
        List<Queryallvo> list = queryallvoService.queryAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("queryall",list);
        return modelAndView;
    }
}
