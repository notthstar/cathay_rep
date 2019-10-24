package com.t28.forest.sales.service.impl;

import com.t28.forest.sales.dao.DepoTheadDao;
import com.t28.forest.sales.service.DepoTheadService;
import com.t28.forest.sales.vo.PageVO;
import com.t28.forest.sales.vo.SalesBillVO;
import com.t28.forest.shared.cond.Condition;
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

    @Override
    public List<SalesBillVO> getBillByPage(PageVO pageVO, Condition condition) {
        return depoTheadDao.findBillByPage(pageVO, condition);
    }

    @Override
    public Integer getBillCount(Condition condition) {
        return depoTheadDao.findBillCount(condition);
    }
}