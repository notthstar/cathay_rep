/**
 * @description
 * @author lcy
 * @create 2019/10/22
 * @since 1.0.0
 */
package com.t28.forest.warehouse.controller;

import com.t28.forest.warehouse.entity.vo.WareBillVO;
import com.t28.forest.warehouse.service.WareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
public class WareAllController {

    @Autowired
    WareService wareService;

    List<WareBillVO> wareBillVOList = null;

    /**
     *其它入库
     */
    @RequestMapping("/inWarehouseVO")
    public String warehouseBillVO(Model model){
        wareBillVOList = wareService.getWareBill("入库","其它");
        model.addAttribute("inWareBillVOList",wareBillVOList);
        return "storemanagement/Otherwarehouse";
    }
    /**
     *其它出库
     */
    @RequestMapping("/outWareBillVO")
    public String outWareBillVO(Model model){
        wareBillVOList = wareService.getWareBill("出库","其它");
        model.addAttribute("outWareBillVOList",wareBillVOList);
        return "storemanagement/Otheroutbound";
    }

    /**
     *调拨出库
     */
    @RequestMapping("/allocateBillVO")
    public String allocateBillVO(Model model){
        wareBillVOList = wareService.getWareBill("出库","调拨");
        model.addAttribute("allocateBillVOList",wareBillVOList);
        return "storemanagement/Allocatingoutbound";
    }

    /**
     *组装单
     */
    @RequestMapping("/assembleBillVO")
    public String assembleBillVO(Model model){
        wareBillVOList = wareService.getWareBill("其它","组装单");
        model.addAttribute("assembleBillVOList",wareBillVOList);
        return "storemanagement/Assemblythesingle";
    }
    /**
     *拆卸单
     */
    @RequestMapping("/disAssembleBillVO")
    public String disAssembleBillVO(Model model){
        wareBillVOList = wareService.getWareBill("其它","拆卸单");
        model.addAttribute("disAssembleBillVOList",wareBillVOList);
        return "storemanagement/Removethesingle";
    }

}
