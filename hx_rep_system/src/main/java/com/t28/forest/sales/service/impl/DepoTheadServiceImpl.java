package com.t28.forest.sales.service.impl;

import com.t28.forest.sales.dao.*;
import com.t28.forest.sales.service.DepoTheadService;
import com.t28.forest.sales.vo.PageVO;
import com.t28.forest.sales.vo.SalesBillVO;
import com.t28.forest.sales.vo.SupplierVO;
import com.t28.forest.shared.cond.Condition;
import com.t28.forest.shared.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author XiangYuFeng
 * @description 单据主表service层实现类
 * @create 2019/10/23
 * @since 1.0.0
 */
@Service
public class DepoTheadServiceImpl implements DepoTheadService {

    @Autowired
    DepoTheadDao depoTheadDao;
    @Autowired
    SalesDepotDao depotDao;
    @Autowired
    SalesMaterialDao materialDao;
    @Autowired
    SalesSupplierDao supplierDao;
    @Autowired
    DepoTitemDao titemDao;

    @Override
    public List<SalesBillVO> getBillByPage(PageVO pageVO, Condition condition) {
        return depoTheadDao.findBillByPage(pageVO, condition);
    }

    @Override
    public Integer getBillCount(Condition condition) {
        return depoTheadDao.findBillCount(condition);
    }

    @Override
    public Integer deleteDepoTheadById(Integer id) {
        return depoTheadDao.deleteDepoTheadById(id);
    }

    @Override
    public Integer approveOrDeApproveDepoTheadById(Integer id, String status) {
        return depoTheadDao.updateDepoTheadById(new DepoTheadDTO(id, status));
    }

    @Override
    public List<DepotDTO> getDepots() {
        return depotDao.findDepots();
    }

    @Override
    public List<MaterialDTO> getMaterialsByDepotId(Integer depotId) {
        return materialDao.findMaterialsByDepotId(depotId);
    }

    @Override
    public List<SupplierDTO> getSuppliers() {
        return supplierDao.findSuppliers();
    }

    @Override
    public SupplierVO getSupplierById(Integer supplierId, Integer depotId) {
        return supplierDao.findSupplierById(supplierId, depotId);
    }

    @Override
    public Boolean addSalesBill(DepoTheadDTO depoTheadDTO, DepoTitemDTO depoTitemDTO) {
        // 添加主表信息
        int result = depoTheadDao.insertDepoThead(depoTheadDTO);
        if (result > 0) {
            // 添加子表信息
            depoTitemDTO.setHeaderId(depoTheadDTO.getId());
            result = titemDao.insertDepoTitem(depoTitemDTO);
        }
        if (result > 1) {
            return true;
        }
        return false;
    }
}