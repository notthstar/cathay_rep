package com.t28.forest.retail.controller;

import com.t28.forest.retail.entity.Queryallvo;
import com.t28.forest.retail.service.QueryallvoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 功能描述:控制层
 *
 * @since: 1.0.0
 * @Author: Zsy
 * @Date: 2019/10/23$
 */
@Controller
public class QueryallController {

    @Autowired
    private QueryallvoService queryallvoService;

    /**
     * 功能描述: 零售出库首页数据显示
     * @since: 1.0.0
     * @Author: Zsy
     * @Date: 2019/10/23
     * @return String
     */

    @RequestMapping("/storage")
    public String getStorageQueryAll(Model model){
        List<Queryallvo> list = queryallvoService.getqueryAll();
        model.addAttribute("queryStorageList",list);
        return "retail/storage";
    }

    /**
     * 功能描述: 零售退货首页数据显示
     * @since: 1.0.0
     * @Author: Zsy
     * @Date: 2019/10/23
     * @return String
     */

    @RequestMapping("/returned")
    public String getReturnedQueryAll(Model model){
        List<Queryallvo> list = queryallvoService.getqueryAll();
        model.addAttribute("queryReturnedList",list);
        return "retail/returned";
    }
}
