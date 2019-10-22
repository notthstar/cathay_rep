/**
 * @description
 * @author lcy
 * @create 2019/10/16
 * @since 1.0.0
 */
package com.t28.forest.warehouse.dao;

import com.t28.forest.warehouse.entity.vo.WareBillVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface WarehouseDao {

    /**
     * 功能描述: 
     * @param: id通过selectAll获取
     * @return: 查询商品信息
     * @since: 1.0.0
     * @Author: lcy
     * @Date: 2019/10/21 16:01
     */
    String selectMaterial(@Param("id")int id);

     /**
      * 功能描述: 
      * @param: No such property: code for class: Script1
      * @return: 仓库总sql
      * @since: 1.0.0
      * @Author: lcy
      * @Date: 2019/10/21 17:15
      */
      List<WareBillVO> selectAll(@Param("type") String type, @Param("subType") String subType);

}
