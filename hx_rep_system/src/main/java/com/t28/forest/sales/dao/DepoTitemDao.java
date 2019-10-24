package com.t28.forest.sales.dao;

import com.t28.forest.shared.entity.DepoTitemDTO;
import org.springframework.stereotype.Repository;

/**
 * @author XiangYuFeng
 * @description 单据主表DAO层接口
 * @create 2019/10/24
 * @since 1.0.0
 */
@Repository
public interface DepoTitemDao {

    /**
     * 根据ID修改单据子表信息
     * @param depoTitemDTO
     * @return Integer
     */
    public Integer updateDepoTitem(DepoTitemDTO depoTitemDTO);

    /**
     * 添加单据子表信息
     * @param depoTitemDTO
     * @return Integer
     */
    public Integer insertDepoTitem(DepoTitemDTO depoTitemDTO);

}
