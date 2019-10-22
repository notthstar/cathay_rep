package com.t28.forest.sales.dao;

import com.t28.forest.sales.entity.vo.PageVO;
import com.t28.forest.sales.entity.vo.SalesBillVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author XiangYuFeng
 * @description 财务主表DAO层接口
 * @create 2019/10/16
 * @since 1.0.0
 */
public interface AccounTheadDao {

    /**
     * 分页查询单据信息
     * @param pageVO
     * @return List<SalesBillVO>
     */
    public List<SalesBillVO> findAccountByPage(@Param("pageVO") PageVO pageVO);

}
