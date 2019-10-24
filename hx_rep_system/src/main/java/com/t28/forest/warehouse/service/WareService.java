/**
 * @description
 * @author lcy
 * @create 2019/10/22
 * @since 1.0.0
 */
package com.t28.forest.warehouse.service;

import com.t28.forest.warehouse.entity.vo.WareBillVO;

import java.util.List;

public interface WareService {

    List<WareBillVO> getWareBill( String type,String subType);

}
