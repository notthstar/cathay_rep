package com.t28.forest.sales.dao;

import com.t28.forest.shared.entity.DepotDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author XiangYuFeng
 * @description 仓库表DAO层接口
 * @create 2019/10/25
 * @since 1.0.0
 */
@Repository
public interface SalesDepotDao {

    /**
     * 查询所有仓库信息
     * @return List<DepotDTO>
     */
    public List<DepotDTO> findDepots();

}
