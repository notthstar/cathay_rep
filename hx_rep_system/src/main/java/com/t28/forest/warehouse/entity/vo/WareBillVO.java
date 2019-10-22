/**
 * @description
 * @author lcy
 * @create 2019/10/22
 * @since 1.0.0
 */
package com.t28.forest.warehouse.entity.vo;


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
        mate = mate;
    }

    public Date getOpertime() {
        return opertime;
    }

    public void setOpertime(Date opertime) {
        opertime = opertime;
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
                "supplier='" + supplier + '\'' +
                ", number='" + number + '\'' +
                ", Mate='" + mate + '\'' +
                ", Opertime=" + opertime +
                ", operPersonName='" + operPersonName + '\'' +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
