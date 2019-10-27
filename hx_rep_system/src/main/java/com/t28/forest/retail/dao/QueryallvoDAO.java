package com.t28.forest.retail.dao;

import com.t28.forest.retail.entity.Queryallvo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 功能描述:QueryallVO接口
 *
 * @since: 1.0.0
 * @Author: Zsy
 * @Date: 2019/10/21$
 */
@Repository
public interface QueryallvoDAO {
    /**
     * 功能描述: 查询全部信息，页面显示数据
     * @since: 1.0.0
     * @author: Zsy
     * @rate: 2019/10/21
     * @return :List
     */
    public List<Queryallvo> queryAll();


}
