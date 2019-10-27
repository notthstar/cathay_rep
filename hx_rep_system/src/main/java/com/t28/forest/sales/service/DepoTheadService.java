package com.t28.forest.sales.service;

import com.t28.forest.sales.dao.SalesMaterialDao;
import com.t28.forest.sales.vo.PageVO;
import com.t28.forest.sales.vo.SalesBillVO;
import com.t28.forest.sales.vo.SupplierVO;
import com.t28.forest.shared.cond.Condition;
import com.t28.forest.shared.entity.*;

import java.util.List;

/**
 * @author XiangYuFeng
 * @description 单据主表service层接口
 * @create 2019/10/23
 * @since 1.0.0
 */
public interface DepoTheadService {

    /**
     * 根据条件进行分页查询销售订单信息
     * @param pageVO
     * @param condition
     * @return List<SalesBillVO>
     */
    public List<SalesBillVO> getBillByPage(PageVO pageVO, Condition condition);

    /**
     * 根据条件查询数据条数
     * @param condition 条件
     * @return Integer
     */
    public Integer getBillCount(Condition condition);

    /**
     * 根据ID逻辑删除单据信息
     * @param id
     * @return Integer
     */
    public Integer deleteDepoTheadById(Integer id);

    /**
     * 通过ID进行单据审核或反审核
     * @param id
     * @param status
     * @return Integer
     */
    public Integer approveOrDeApproveDepoTheadById(Integer id, String status);

    /**
     * 获取所有仓库信息
     * @return List<DepotDTO>
     */
    public List<DepotDTO> getDepots();

    /**
     * 根据仓库ID获取该仓库的商品信息
     * @param depotId
     * @return List<MaterialDTO>
     */
    public List<MaterialDTO> getMaterialsByDepotId(Integer depotId);

    /**
     * 获取所有客户信息
     * @return List<SupplierDTO>
     */
    public List<SupplierDTO> getSuppliers();

    /**
     * 根据ID查询商品信息
     * @param supplierId
     * @param depotId
     * @return SupplierVO
     */
    public SupplierVO getSupplierById(Integer supplierId, Integer depotId);

    /**
     * 添加单据信息
     * @param depoTheadDTO 单据主表
     * @param depoTitemDTO 单据子表
     * @return Boolean
     */
    public Boolean addSalesBill(DepoTheadDTO depoTheadDTO, DepoTitemDTO depoTitemDTO);

}