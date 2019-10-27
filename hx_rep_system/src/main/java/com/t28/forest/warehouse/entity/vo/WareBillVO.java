/**
 * @description
 * @author lcy
 * @create 2019/10/22
 * @since 1.0.0
 */
package com.t28.forest.warehouse.entity.vo;


import com.t28.forest.shared.entity.AccounTheadDTO;

import java.util.Date;

/**
 * 功能描述: 
 * @param: No such property: code for class: Script1
 * @return: 仓库页面展示
 * @since: 1.0.0
 * @Author: lcy
 * @Date: 2019/10/22 9:15
 */
public class WareBillVO {

    private  int id;
    /**
     *供应商名称
     */
    private String supplier;
    /**
     *单据编号
     */
    private String number;
    /**
     *商品信息
     */
     private String mate;
    /**
     *单据日期
     */
    private Date opertime;
    /**
     *操作员名字
     */
    private String operPersonName;
    /**
     *金额合计
     */
    private int totalPrice;

    /**
     *单据主表
     */
    private AccounTheadDTO dto;

    public AccounTheadDTO getDto() {
        return dto;
    }

    public void setDto(AccounTheadDTO dto) {
        this.dto = dto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMate() {
        return mate;
    }

    public void setMate(String mate) {
        this.mate = mate;
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {

        this.opertime = opertime;
    }


    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getOperPersonName() {
        return operPersonName;
    }

    public void setOperPersonName(String operPersonName) {
        this.operPersonName = operPersonName;
    }

    @Override
    public String toString() {
        return "WareBillVO{" +
                "id=" + id +
                ", supplier='" + supplier + '\'' +
                ", number='" + number + '\'' +
                ", mate='" + mate + '\'' +
                ", opertime=" + opertime +
                ", operPersonName='" + operPersonName + '\'' +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
