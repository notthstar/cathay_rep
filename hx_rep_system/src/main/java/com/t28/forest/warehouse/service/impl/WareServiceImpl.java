/**
 * @description
 * @author lcy
 * @create 2019/10/22
 * @since 1.0.0
 */
package com.t28.forest.warehouse.service.impl;

import com.t28.forest.shared.entity.DepotDTO;
import com.t28.forest.shared.entity.MaterialDTO;
import com.t28.forest.shared.entity.SupplierDTO;
import com.t28.forest.warehouse.dao.WarehouseDao;
import com.t28.forest.warehouse.entity.vo.WareBillVO;
import com.t28.forest.warehouse.service.WareService;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Override
    @Transactional
    public void moveById(int id) {
         warehouseDao.deleteById(id);
    }

    @Override
    public List<DepotDTO> getDept() {
        return warehouseDao.selectDept();
    }

    @Override
    public List<SupplierDTO> getSupp() {
        return warehouseDao.selectSupp();
    }

    @Override
    public void insertWare(String number, int supp, int price, Date OperTime) {
         warehouseDao.addWare(number, supp, price, OperTime);
    }

    @Override
    public void insertWareInfo(int id, int name, int dept, int price) {
         warehouseDao.addWareInfo(id, name, dept, price);
    }

    @Override
    public int getId() {
        return warehouseDao.selectId();
    }

    @Override
    public List<WareBillVO> getMId() {
        return warehouseDao.selectMate();
    }
}
