/**
 * @description
 * @author HF
 * @create 2019/10/23
 * @since 1.0.0
 */
package com.t28.forest.purchasing.service.impl;

import com.t28.forest.purchasing.dao.DepotheadDao;
import com.t28.forest.purchasing.extract.ExtractPurchaseOrderDTO;
import com.t28.forest.purchasing.service.PurchaseOrderService;
import com.t28.forest.sales.vo.PageVO;
import com.t28.forest.shared.cond.Condition;
import com.t28.forest.shared.entity.SupplierDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class PurchaseOrderServiceImpl implements PurchaseOrderService {
    @Autowired
    DepotheadDao depotheadDao;

    @Override
    public List<ExtractPurchaseOrderDTO> getAllDepothead(PageVO pageVO, Condition condition) {
        List<ExtractPurchaseOrderDTO> allDepothead = depotheadDao.getAllDepothead(pageVO,condition);
        return allDepothead;
    }

    @Override
    public Integer getBillCount(Condition condition) {
        return depotheadDao.getCountInfo(condition);
    }

    @Override
    public List<SupplierDTO> getAllName() {
        List<SupplierDTO> allName = depotheadDao.getAllName();
        return allName;
    }

    @Override
    public boolean addSupplierInfo(SupplierDTO dto) {
        if(dto!=null){
            depotheadDao.addSupplierInfo(dto);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public ExtractPurchaseOrderDTO selectById(ExtractPurchaseOrderDTO extractDepothadDTO) {
        return depotheadDao.selectById(extractDepothadDTO.getId());
    }

    @Override
    public Integer deleteDepoTheadById(Integer id) {
        return depotheadDao.updateById(id);
    }
}
