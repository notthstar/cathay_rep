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
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class WareServiceImpl implements WareService {
    @Autowired
    WarehouseDao warehouseDao;

    @Override
    public List<WareBillVO> getWareBill(String type, String subType) {
        return warehouseDao.selectAll(type,subType);
    }

    @Override
    public List<WareBillVO> getWareByCond(String type, String subType, @Param("number") String number,@Param("mate") String mate,@Param("startTime") Date startTime,@Param("endTime") Date endTime) {
        return warehouseDao.selectByCond(type, subType, number, mate, startTime, endTime);
    }
}
