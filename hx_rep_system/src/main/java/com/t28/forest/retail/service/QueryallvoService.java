package com.t28.forest.retail.service;

import com.t28.forest.retail.entity.Queryallvo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能描述:QueryallvoService业务逻辑
 *
 * @since: 1.0.0
 * @Author: Zsy
 * @Date: 2019/10/21$
 */
public interface QueryallvoService {
    /**
     * 功能描述: 查询全部信息，页面显示数据
     * @since: 1.0.0
     * @author: Zsy
     * @rate: 2019/10/21
     * @return :List
     */
    public List<Queryallvo> getqueryAll();


}
