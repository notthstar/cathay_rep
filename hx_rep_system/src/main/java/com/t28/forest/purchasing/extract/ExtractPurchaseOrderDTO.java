/**
 * @description 提取字段的实体类
 * @author HF
 * @create 2019/10/22
 * @since 1.0.0
 */
package com.t28.forest.purchasing.extract;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtractPurchaseOrderDTO {
    /**
     * 单据主表id
     */
    private Integer id;
    /**
     * 供应商信息
     */
    private String supplier;
    /**
     * 单据编号
     */
    private String number;
    /**
     * 商品信息
     */
    private String name;
    /**
     * 单据日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    private Date createTime;
    /**
     * 操作员
     */
    private String operPersonName;
    /**
     * 金额合计
     */
    private Double TotalPrice;
    /**
     * 状态
     */
    private String Status;
    /**
     * 含税合计
     */
    private Double taxIncludedAmount;
    /**
     * 优惠后金额
     */
    private Double discountLastMoney;
    /**
     * 变动金额(收付款)
     */
    private  Double changeAmount;
    /**
     * 时间格式转换
     */
    SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd HH:ss:mm");

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) throws ParseException {
        this.createTime =sdf.parse(createTime);
    }

    public String getOperPersonName() {
        return operPersonName;
    }

    public void setOperPersonName(String operPersonName) {
        this.operPersonName = operPersonName;
    }

    public Double getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        TotalPrice = totalPrice;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public Double getDiscountLastMoney() {
        return discountLastMoney;
    }

    public void setDiscountLastMoney(Double discountLastMoney) {
        this.discountLastMoney = discountLastMoney;
    }

    public Double getTaxIncludedAmount() {
        return taxIncludedAmount;
    }

    public void setTaxIncludedAmount(Double taxIncludedAmount) {
        this.taxIncludedAmount = taxIncludedAmount;
    }

    public Double getChangeAmount() {
        return changeAmount;
    }

    public void setChangeAmount(Double changeAmount) {
        this.changeAmount = changeAmount;
    }

    @Override
    public String toString() {
        return "ExtractPurchaseOrderDTO{" +
                "id=" + id +
                ", supplier='" + supplier + '\'' +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", createTime=" + createTime +
                ", operPersonName='" + operPersonName + '\'' +
                ", TotalPrice=" + TotalPrice +
                ", Status='" + Status + '\'' +
                ", taxIncludedAmount=" + taxIncludedAmount +
                ", discountLastMoney=" + discountLastMoney +
                ", changeAmount=" + changeAmount +
                '}';
    }
}
