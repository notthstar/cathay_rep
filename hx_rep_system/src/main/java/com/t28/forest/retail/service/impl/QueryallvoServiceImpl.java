package com.t28.forest.retail.service.impl;

import com.t28.forest.retail.dao.QueryallvoDAO;
import com.t28.forest.retail.entity.Queryallvo;
import com.t28.forest.retail.service.QueryallvoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能描述:QueryallvoService业务逻辑实现类
 *
 * @since: 1.0.0
 * @Author: Zsy
 * @Date: 2019/10/21$
 */
@Service
public class QueryallvoServiceImpl implements QueryallvoService {

    @Autowired
    private QueryallvoDAO queryallvoDAO;

    @Override
    public List<Queryallvo> getqueryAll() {
        return queryallvoDAO.queryAll();
    }
}
