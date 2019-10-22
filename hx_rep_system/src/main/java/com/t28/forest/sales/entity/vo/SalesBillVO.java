package com.t28.forest.sales.entity.vo;

import java.util.Date;

/**
 * @author XiangYuFeng
 * @description 销售订单页面展示对象
 * @create 2019/10/21
 * @since 1.0.0
 */
public class SalesBillVO {
    /**
     * 客户名称
     */
    private String customerName;
    /**
     * 单据号
     */
    private String billNum;
    /**
     * 商品名称
     */
    private String productName;
    /**
     * 单据创建日期
     */
    private Date billCreateTime;
    /**
     * 操作员
     */
    private String operator;
    /**
     * 合计金额
     */
    private Double totalPrice;
    /**
     * 单据状态
     */
    private String billStatus;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getBillNum() {
        return billNum;
    }

    public void setBillNum(String billNum) {
        this.billNum = billNum;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Date getBillCreateTime() {
        return billCreateTime;
    }

    public void setBillCreateTime(Date billCreateTime) {
        this.billCreateTime = billCreateTime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus;
    }

    @Override
    public String toString() {
        return "SalesBillVO{" +
                "customerName='" + customerName + '\'' +
                ", billNum='" + billNum + '\'' +
                ", productName='" + productName + '\'' +
                ", billCreateTime=" + billCreateTime +
                ", operator='" + operator + '\'' +
                ", totalPrice=" + totalPrice +
                ", billStatus='" + billStatus + '\'' +
                '}';
    }
}