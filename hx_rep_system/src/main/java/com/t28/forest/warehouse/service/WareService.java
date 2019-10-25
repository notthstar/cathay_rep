/**
 * @description
 * @author lcy
 * @create 2019/10/22
 * @since 1.0.0
 */
package com.t28.forest.warehouse.service;

import com.t28.forest.warehouse.entity.vo.WareBillVO;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface WareService {

    List<WareBillVO> getWareBill( String type,String subType);

    List<WareBillVO> getWareByCond(String type, String subType,
                                   String number, String mate,
                                   Date startTime, Date endTime);

}
