/**
 * @description
 * @author lcy
 * @create 2019/10/16
 * @since 1.0.0
 */
package com.t28.forest.warehouse.dao;

import com.t28.forest.warehouse.entity.vo.WareBillVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface WarehouseDao {

     /**
      * 功能描述: 仓库总SQL
      * @param: No such property: code for class: Script1
      * @return:
      * @since: 1.0.0
      * @Author: lcy
      * @Date: 2019/10/21 17:15
      */
      List<WareBillVO> selectAll(@Param("type")String type, @Param("subType") String subType);
      
      /**
       * 功能描述: 根据条件查询
       * @param: No such property: code for class: Script1
       * @return: 
       * @since: 1.0.0
       * @Author: lcy
       * @Date: 2019/10/23 15:25
       */
      List<WareBillVO> selectByCond(@Param("type")String type, @Param("subType") String subType,
                                    @Param("number") String number,@Param("mate") String mate,
                                    @Param("startTime") String startTime,@Param("endTime") String endTime);
}
