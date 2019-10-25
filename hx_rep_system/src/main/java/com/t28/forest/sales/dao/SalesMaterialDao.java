package com.t28.forest.sales.dao;

import com.t28.forest.shared.entity.MaterialDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author XiangYuFeng
 * @description 商品表DAO层接口
 * @create 2019/10/25
 * @since 1.0.0
 */
@Repository
public interface SalesMaterialDao {

    /**
     * 通过仓库ID查询该仓库所有的商品信息
     * @param depotId
     * @return List<MaterialDTO>
     */
    public List<MaterialDTO> findMaterialsByDepotId(Integer depotId);

}
