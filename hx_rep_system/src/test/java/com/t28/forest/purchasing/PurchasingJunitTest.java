/**
 * @description 采购管理单元测试
 * @author XiangYuFeng
 * @create 2019/10/13
 * @since 1.0.0
 */
package com.t28.forest.purchasing;

import com.t28.forest.purchasing.extract.ExtractPurchaseOrderDTO;
import com.t28.forest.purchasing.service.PurchaseOrderService;
import com.t28.forest.sales.vo.PageVO;
import com.t28.forest.shared.cond.Condition;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PurchasingJunitTest {

    @Autowired
    PurchaseOrderService purchaseOrderService;
    @Test
    public void getAll(){
        PageVO pageVO = new PageVO();
        pageVO.setCurrent(1);
        pageVO.setPageSize(5);
        List<ExtractPurchaseOrderDTO> allDepothead = purchaseOrderService.getAllDepothead(pageVO, new Condition());
        for (ExtractPurchaseOrderDTO extractPurchaseOrderDTO : allDepothead) {
            System.out.println(extractPurchaseOrderDTO);
        }
    }
}