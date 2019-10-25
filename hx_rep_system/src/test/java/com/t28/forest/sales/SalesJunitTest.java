/**
 * @description 销售管理单元测试
 * @author XiangYuFeng
 * @create 2019/10/13
 * @since 1.0.0
 */
package com.t28.forest.sales;

import com.t28.forest.sales.dao.DepoTheadDao;
import com.t28.forest.sales.dao.SalesDepotDao;
import com.t28.forest.sales.dao.SalesMaterialDao;
import com.t28.forest.sales.dao.SalesSupplierDao;
import com.t28.forest.sales.vo.PageVO;
import com.t28.forest.sales.vo.SalesBillVO;
import com.t28.forest.sales.vo.SupplierVO;
import com.t28.forest.shared.cond.Condition;
import com.t28.forest.shared.entity.DepotDTO;
import com.t28.forest.shared.entity.MaterialDTO;
import com.t28.forest.shared.entity.SupplierDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SalesJunitTest {

    @Autowired
    DepoTheadDao depoTheadDao;

    @Test
    public void findPageTest() throws ParseException {
        List<SalesBillVO> bills = depoTheadDao.findBillByPage(new PageVO(0, 4), new Condition("SCK", "纯棉",null,new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2017-10-10 24:00:00")));
        for (SalesBillVO bill : bills) {
            System.out.println(bill);
        }
    }

    @Test
    public void deleteDepoTheadTest() {
        Integer result = depoTheadDao.deleteDepoTheadById(8);
        System.out.println(result);
    }

    @Autowired
    SalesDepotDao salesDepotDao;

    @Test
    public void findDepotsTest() {
        List<DepotDTO> depots = salesDepotDao.findDepots();
        for (int i = 0; i < depots.size(); i++) {
            System.out.println(depots.get(i));
        }
    }

    @Autowired
    SalesMaterialDao materialDao;

    @Test
    public void findMaterialTest() {
        List<MaterialDTO> materials = materialDao.findMaterialsByDepotId(3);
        for (int i = 0; i < materials.size(); i++) {
            System.out.println(materials.get(i));
        }
    }

    @Autowired
    SalesSupplierDao supplierDao;

    @Test
    public void findSuppliersTest() {
//        List<SupplierDTO> suppliers = supplierDao.findSuppliers();
//        for (int i = 0; i < suppliers.size(); i++) {
//            System.out.println(suppliers.get(i));
//        }

        SupplierVO supplier = supplierDao.findSupplierById(485, 3);
        System.out.println(supplier);
    }

}