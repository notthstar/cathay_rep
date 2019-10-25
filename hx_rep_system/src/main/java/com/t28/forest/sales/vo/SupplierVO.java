package com.t28.forest.sales.vo;

import java.util.Date;

/**
 * @author XiangYuFeng
 * @description 商品信息页面展示对象
 * @create 2019/10/25
 * @since 1.0.0
 */
public class SupplierVO {
    /**
     * 商品名称
     */
    private String productName;
    /**
     * 库存
     */
    private Integer stock;
    /**
     * 单位
     */
    private String unit;
    /**
     * 数量
     */
    private Integer num;
    /**
     * 单价
     */
    private Double retailPrice;
    /**
     * 金额
     */
    private Double money;
    /**
     * 备注
     */
    private String remark;
    /**
     * 客户ID
     */
    private Integer supplierId;
    /**
     * 单据日期
     */
    private Date billDate;
    /**
     * 单据编号
     */
    private String billNum;
    /**
     * 仓库ID
     */
    private Integer deptoId;
    /**
     * 商品ID
     */
    private Integer materialId;
    /**
     * 操作员名称
     */
    private String operPersonName;
    /**
     * 租户ID
     */
    private Integer tenantId;

    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    public String getOperPersonName() {
        return operPersonName;
    }

    public void setOperPersonName(String operPersonName) {
        this.operPersonName = operPersonName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getStock() {
        return stock;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(Double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public String getBillNum() {
        return billNum;
    }

    public void setBillNum(String billNum) {
        this.billNum = billNum;
    }

    public Integer getDeptoId() {
        return deptoId;
    }

    public void setDeptoId(Integer deptoId) {
        this.deptoId = deptoId;
    }

    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    @Override
    public String toString() {
        return "SupplierVO{" +
                "productName='" + productName + '\'' +
                ", stock=" + stock +
                ", unit='" + unit + '\'' +
                ", num=" + num +
                ", retailPrice=" + retailPrice +
                ", money=" + money +
                ", remark='" + remark + '\'' +
                ", supplierId=" + supplierId +
                ", billDate=" + billDate +
                ", billNum='" + billNum + '\'' +
                ", deptoId=" + deptoId +
                ", materialId=" + materialId +
                '}';
    }
}