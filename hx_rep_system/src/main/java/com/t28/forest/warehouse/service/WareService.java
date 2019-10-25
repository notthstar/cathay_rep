/**
 * @description
 * @author lcy
 * @create 2019/10/22
 * @since 1.0.0
 */
package com.t28.forest.warehouse.service;

import com.t28.forest.shared.entity.DepotDTO;
import com.t28.forest.shared.entity.MaterialDTO;
import com.t28.forest.shared.entity.SupplierDTO;
import com.t28.forest.warehouse.entity.vo.WareBillVO;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface WareService {

    List<WareBillVO> getWareBill( String type,String subType);

    List<WareBillVO> getWareByCond(String type, String subType,
                                   String number, String mate,
                                   Date startTime, Date endTime);

    void moveById(int id);

    List<DepotDTO> getDept();

    List<SupplierDTO> getSupp();

    void insertWare(@Param("number") String number,@Param("supp")int supp,
                    @Param("price")int price,@Param("OperTime")Date OperTime);

    void insertWareInfo(@Param("id") int id,@Param("name")int name,@Param("dept")int dept,@Param("price")int price);

    int getId();
    List<WareBillVO> getMId();
}
