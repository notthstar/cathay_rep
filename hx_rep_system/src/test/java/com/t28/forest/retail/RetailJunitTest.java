/**
 * @description 零售管理单元测试
 * @author XiangYuFeng
 * @create 2019/10/13
 * @since 1.0.0
 */
package com.t28.forest.retail;

import com.t28.forest.retail.entity.Queryallvo;
import com.t28.forest.retail.service.impl.QueryallvoServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RetailJunitTest {

    @Autowired
    QueryallvoServiceImpl queryallvoService;

    @Test
    public void retailTest(){
        List<Queryallvo> list = queryallvoService.getqueryAll();
        for (Queryallvo queryallvo : list){
            System.out.println(queryallvo);
        }
    }

}