/**
 * @description 销售管理单元测试
 * @author XiangYuFeng
 * @create 2019/10/13
 * @since 1.0.0
 */
package com.t28.forest.sales;

import com.t28.forest.sales.dao.DepoTheadDao;
import com.t28.forest.sales.vo.PageVO;
import com.t28.forest.sales.vo.SalesBillVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SalesJunitTest {

    @Autowired
    DepoTheadDao depoTheadDao;

    @Test
    public void findPageTest() {
        List<SalesBillVO> bills = depoTheadDao.findBillByPage(new PageVO(0, 4), null);
        for (SalesBillVO bill : bills) {
            System.out.println(bill);
        }
    }

}