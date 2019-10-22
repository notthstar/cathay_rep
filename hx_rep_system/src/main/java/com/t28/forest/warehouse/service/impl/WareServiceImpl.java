/**
 * @description
 * @author lcy
 * @create 2019/10/22
 * @since 1.0.0
 */
package com.t28.forest.warehouse.service.impl;

import com.t28.forest.warehouse.dao.WarehouseDao;
import com.t28.forest.warehouse.entity.vo.WareBillVO;
import com.t28.forest.warehouse.service.WareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WareServiceImpl implements WareService {
    @Autowired
    WarehouseDao warehouseDao;
    @Override
    public String getMate(int id) {
        return warehouseDao.selectMaterial(id);
    }

    @Override
    public List<WareBillVO> getWareBill(String type, String subType) {
        return warehouseDao.selectAll(type,subType);
    }
}
