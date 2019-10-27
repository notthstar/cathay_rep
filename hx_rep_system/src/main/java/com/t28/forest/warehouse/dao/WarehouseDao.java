/**
 * @description
 * @author lcy
 * @create 2019/10/16
 * @since 1.0.0
 */
package com.t28.forest.warehouse.dao;

import com.t28.forest.shared.entity.DepotDTO;
import com.t28.forest.shared.entity.MaterialDTO;
import com.t28.forest.shared.entity.SupplierDTO;
import com.t28.forest.warehouse.entity.vo.WareBillVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.Date;
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
                                    @Param("number") String number, @Param("mate") String mate,
                                    @Param("startTime") Date startTime, @Param("endTime") Date endTime);

      /**
       * 功能描述: 根据id查询详细信息
       * @param: No such property: code for class: Script1
       * @return:
       * @since: 1.0.0
       * @Author: lcy
       * @Date: 2019/10/25 15:43
       */
      WareBillVO selectById(@Param("id") int id);
      
      /**
       * 功能描述: 根据id删除行，修改delete_Flag
       * @param: No such property: code for class: Script1
       * @return: 
       * @since: 1.0.0
       * @Author: lcy
       * @Date: 2019/10/25 19:26
       */
      void deleteById(@Param("id") int id);

      /**
       * 功能描述: 查询仓库名称
       * @param: No such property: code for class: Script1
       * @return: 
       * @since: 1.0.0
       * @Author: lcy
       * @Date: 2019/10/25 23:30
       */
      List<DepotDTO> selectDept();
      
      /**
       * 功能描述: 查询供应商名称
       * @param: No such property: code for class: Script1
       * @return: 
       * @since: 1.0.0
       * @Author: lcy
       * @Date: 2019/10/25 23:32
       */
      List<SupplierDTO> selectSupp();

      /**
       * 功能描述: 添加单据主表数据
       * @param: No such property: code for class: Script1
       * @return: 
       * @since: 1.0.0
       * @Author: lcy
       * @Date: 2019/10/26 1:02
       */
      void  addWare( @Param("number") String number,@Param("supp")int supp,@Param("price")int price,@Param("OperTime")Date OperTime);
      /**
       * 功能描述: 添加单据子表数据
       * @param: No such property: code for class: Script1
       * @return:
       * @since: 1.0.0
       * @Author: lcy
       * @Date: 2019/10/26 1:02
       */
      void  addWareInfo(@Param("id") int id,@Param("name")int name,@Param("dept")int dept,@Param("price")int price);
      /**
       * 功能描述: 查询单据子表最新添加的数据id
       * @param: No such property: code for class: Script1
       * @return: 
       * @since: 1.0.0
       * @Author: lcy
       * @Date: 2019/10/26 2:26
       */
      int selectId();
      /**
       * 功能描述: 查询商品信息，为添加拿到id
       * @param: No such property: code for class: Script1
       * @return: 
       * @since: 1.0.0
       * @Author: lcy
       * @Date: 2019/10/26 3:12
       */
      List<WareBillVO> selectMate();
}
