/**
 * 类名称:PurchaseOrderService
 *
 * @description 业务层
 * @Author:HF
 * @Date: 2019/10/23$ 15:12$
 * @since: 1.0.0
 */
package com.t28.forest.purchasing.service;

import com.t28.forest.purchasing.extract.ExtractPurchaseOrderDTO;
import com.t28.forest.sales.vo.PageVO;
import com.t28.forest.shared.cond.Condition;
import com.t28.forest.shared.entity.SupplierDTO;

import java.util.List;

public interface PurchaseOrderService {

    /**
     * 功能描述: 采购订单查询方法
     *
     * @param:
     * @return: list
     * @since: 1.0.0
     * @Author:
     * @Date:
     */
    public List<ExtractPurchaseOrderDTO> getAllDepothead(PageVO pageVO, Condition condition);

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
     * 根据条件查询数据条数
     *
     * @param condition 条件
     * @return Integer
     */
    public Integer getBillCount(Condition condition);

    /**
     * 功能描述:添加供应商信息
     *
     * @param: dto
     * @return: int
     * @since: 1.0.0
     * @Author:
     * @Date:
     */
    public boolean addSupplierInfo(SupplierDTO dto);

    /**
     * 功能描述: 根据id查询信息
     *
     * @param: id
     * @return: ExtractPurchaseOrderDTO
     * @since: 1.0.0
     * @Author:
     * @Date:
     */
    public ExtractPurchaseOrderDTO selectById(ExtractPurchaseOrderDTO extractDepothadDTO);

    /**
     * 根据ID逻辑删除单据信息
     * @param id
     * @return Integer
     */
    public Integer deleteDepoTheadById(Integer id);
}

