/**
 * 类名称:DepotheadDao
 *
 * @description 接口
 * @Author:HF
 * @Date: 2019/10/16$ 15:28$
 * @since: 1.0.0
 */
package com.t28.forest.purchasing.dao;

import com.t28.forest.purchasing.extract.ExtractPurchaseOrderDTO;
import com.t28.forest.shared.cond.Condition;
import com.t28.forest.shared.entity.DepoTheadDTO;
import com.t28.forest.shared.entity.SupplierDTO;
import org.apache.ibatis.annotations.Param;
import com.t28.forest.sales.vo.PageVO;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DepotheadDao {
    /**
     * 功能描述: 采购订单查询方法
     *
     * @param:
     * @return: list
     * @since: 1.0.0
     * @Author:
     * @Date:
     */
    public List<ExtractPurchaseOrderDTO> getAllDepothead(@Param("pageVO") PageVO pageVO, @Param("condition") Condition condition);

    /**
     * 功能描述: 查询所以供应商
     *
     * @param:
     * @return:
     * @since: 1.0.0
     * @Author:
     * @Date:
     */
    public List<SupplierDTO> getAllName();

    /**
     * 功能描述:添加供应商信息
     *
     * @param: dto
     * @return: int
     * @since: 1.0.0
     * @Author:
     * @Date:
     */
    public Integer addSupplierInfo(@Param("dto") SupplierDTO dto);

    /**
     * 功能描述: 根据id查询信息
     *
     * @param: id
     * @return: ExtractPurchaseOrderDTO
     * @since: 1.0.0
     * @Author:
     * @Date:
     */
    public ExtractPurchaseOrderDTO selectById(@Param("id") Integer id);

    /**
     * 查询总条数
     *
     * @param condition
     * @return
     */
    public Integer getCountInfo(@Param("condition") Condition condition);

    /**
     * 根据id删除
     *
     * @param id
     * @return
     */
    public Integer updateById(@Param("id") Integer id);

    /**
     * 根据ID修改单据主表信息
     *
     * @param depoTheadDTO
     * @return Integer
     */
    public Integer updateDepoTheadById(DepoTheadDTO depoTheadDTO);
}

