/**
 * @description
 * @author lcy
 * @create 2019/10/16
 * @since 1.0.0
 */
package com.t28.forest.warehouse.dao;

import com.t28.forest.warehouse.entity.DepoTheadDTO;

import java.util.List;

public interface warehouseDao {

    /**
     * 功能描述: 
     * @param: No such property: code for class: Script1
     * @return: 查询商品信息
     * @since: 1.0.0
     * @Author: lcy
     * @Date: 2019/10/21 16:01
     */
    Object selectmaterial();

     /**
      * 功能描述: 
      * @param: No such property: code for class: Script1
      * @return: 仓库总sql
      * @since: 1.0.0
      * @Author: lcy
      * @Date: 2019/10/21 17:15
      */
      List<DepoTheadDTO> selectAll();

}
