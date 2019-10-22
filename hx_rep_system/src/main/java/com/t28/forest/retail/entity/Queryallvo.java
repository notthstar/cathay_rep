package com.t28.forest.retail.entity;

import java.util.Date;

/**
 * 功能描述:页面显示数据传输对象
 *
 * @since: 1.0.0
 * @Author: Zsy
 * @Date: 2019/10/21$
 */
public class Queryallvo {
    private String supplier;
    /**
     * 会员卡号
     */
    private String number;
    /**
     * 单据编号
     */
    private String name;
    private String model;
    /**
     * 商品信息
     */
    private Date createTime;
    /**
     * 单据日期
     */
    private String operPersonName;
    /**
     * 操作员
     */
    private Double totalPrice;
    /**
     * 金额合计
     */
    private Double allPrice;
    /**
     * 收款
     */

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getOperPersonName() {
        return operPersonName;
    }

    public void setOperPersonName(String operPersonName) {
        this.operPersonName = operPersonName;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Double getAllPrice() {
        return allPrice;
    }

    public void setAllPrice(Double allPrice) {
        this.allPrice = allPrice;
    }

    @Override
    public String toString() {
        return "Queryallvo{" +
                "supplier='" + supplier + '\'' +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", createTime=" + createTime +
                ", operPersonName='" + operPersonName + '\'' +
                ", totalPrice=" + totalPrice +
                ", allPrice=" + allPrice +
                '}';
    }
}
