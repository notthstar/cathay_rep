package com.t28.forest.sales.dao;

import com.t28.forest.sales.vo.SupplierVO;
import com.t28.forest.shared.entity.SupplierDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author XiangYuFeng
 * @description 供应商/客户信息关系表DAO层接口
 * @create 2019/10/25
 * @since 1.0.0
 */
@Repository
public interface SalesSupplierDao {

    /**
     * 查询所有客户信息
     * @return List<SupplierDTO>
     */
    public List<SupplierDTO> findSuppliers();

    /**
     * 根据仓库和产品ID查询产品信息
     * @param supplierId
     * @param depotId
     * @return SupplierVO
     */
    public SupplierVO findSupplierById(@Param("supplierId") Integer supplierId, @Param("depotId") Integer depotId);

}
