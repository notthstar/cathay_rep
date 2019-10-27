package com.t28.forest.sales.dao;

import com.t28.forest.sales.vo.PageVO;
import com.t28.forest.sales.vo.SalesBillVO;
import com.t28.forest.shared.cond.Condition;
import com.t28.forest.shared.entity.DepoTheadDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author XiangYuFeng
 * @description 单据主表DAO层接口
 * @create 2019/10/16
 * @since 1.0.0
 */
@Repository
public interface DepoTheadDao {

    /**
     * 分页查询单据信息
     * @param pageVO
     * @param condition
     * @return List<SalesBillVO>
     */
    public List<SalesBillVO> findBillByPage(@Param("pageVO") PageVO pageVO, @Param("condition")Condition condition);

    /**
     * 根据条件查询数据总条数
     * @param condition
     * @return Integer
     */
    public Integer findBillCount(@Param("condition")Condition condition);

    /**
     * 根据单据ID逻辑删除单据信息
     * @param id
     * @return Integer
     */
    public Integer deleteDepoTheadById(Integer id);

    /**
     * 添加单据主表信息
     * @param depoTheadDTO
     * @return Integer
     */
    public Integer insertDepoThead(DepoTheadDTO depoTheadDTO);

    /**
     * 根据ID修改单据主表信息
     * @param depoTheadDTO
     * @return Integer
     */
    public Integer updateDepoTheadById(DepoTheadDTO depoTheadDTO);

}
