package com.t28.forest.shared.entity;

/**
 * @author XiangYuFeng
 * @description 单据子表数据传输对象
 * @create 2019/10/16
 * @since 1.0.0
 */
public class DepoTitemDTO {
    /**
     * 主键ID、自增长
     */
    private Integer id;
    /**
     * 表头ID
     */
    private Integer headerId;
    /**
     * 材料ID
     */
    private Integer materialId;
    /**
     * 商品计量单位
     */
    private String mUnit;
    /**
     * 数量
     */
    private Double operNumber;
    /**
     * 基础数量（KG/瓶）
     */
    private Double basicNumber;
    /**
     * 单价
     */
    private Double unitPrice;
    /**
     * 合税单价
     */
    private Double taxUnitPrice;
    /**
     * 金额
     */
    private Double allPrice;
    /**
     * 描述
     */
    private String remark;
    /**
     * 图片
     */
    private String img;
    /**
     * 运杂费
     */
    private Double incidentals;
    /**
     * 仓库ID（库存是统计出来的）
     */
    private Integer depotId;
    /**
     * 调拨时、对方仓库ID
     */
    private Integer anotherDepotId;
    /**
     * 税率
     */
    private Double taxRate;
    /**
     * 税额
     */
    private Double taxMoney;
    /**
     * 价税合计
     */
    private Double taxLastMoney;
    /**
     * 自定义字段1-品名
     */
    private String otherField1;
    /**
     * 自定义字段2-型号
     */
    private String otherField2;
    /**
     * 自定义字段3-制造商
     */
    private String otherField3;
    /**
     * 自定义字段4
     */
    private String otherField4;
    /**
     * 自定义字段5
     */
    private String otherField5;
    /**
     * 商品类型
     */
    private String mType;
    /**
     * 租户ID
     */
    private Integer tenantId;
    /**
     * 删除标记，0未删除、1已删除
     */
    private Integer deleteFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHeaderId() {
        return headerId;
    }

    public void setHeaderId(Integer headerId) {
        this.headerId = headerId;
    }

    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    public String getmUnit() {
        return mUnit;
    }

    public void setmUnit(String mUnit) {
        this.mUnit = mUnit;
    }

    public Double getOperNumber() {
        return operNumber;
    }

    public void setOperNumber(Double operNumber) {
        this.operNumber = operNumber;
    }

    public Double getBasicNumber() {
        return basicNumber;
    }

    public void setBasicNumber(Double basicNumber) {
        this.basicNumber = basicNumber;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getTaxUnitPrice() {
        return taxUnitPrice;
    }

    public void setTaxUnitPrice(Double taxUnitPrice) {
        this.taxUnitPrice = taxUnitPrice;
    }

    public Double getAllPrice() {
        return allPrice;
    }

    public void setAllPrice(Double allPrice) {
        this.allPrice = allPrice;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Double getIncidentals() {
        return incidentals;
    }

    public void setIncidentals(Double incidentals) {
        this.incidentals = incidentals;
    }

    public Integer getDepotId() {
        return depotId;
    }

    public void setDepotId(Integer depotId) {
        this.depotId = depotId;
    }

    public Integer getAnotherDepotId() {
        return anotherDepotId;
    }

    public void setAnotherDepotId(Integer anotherDepotId) {
        this.anotherDepotId = anotherDepotId;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public Double getTaxMoney() {
        return taxMoney;
    }

    public void setTaxMoney(Double taxMoney) {
        this.taxMoney = taxMoney;
    }

    public Double getTaxLastMoney() {
        return taxLastMoney;
    }

    public void setTaxLastMoney(Double taxLastMoney) {
        this.taxLastMoney = taxLastMoney;
    }

    public String getOtherField1() {
        return otherField1;
    }

    public void setOtherField1(String otherField1) {
        this.otherField1 = otherField1;
    }

    public String getOtherField2() {
        return otherField2;
    }

    public void setOtherField2(String otherField2) {
        this.otherField2 = otherField2;
    }

    public String getOtherField3() {
        return otherField3;
    }

    public void setOtherField3(String otherField3) {
        this.otherField3 = otherField3;
    }

    public String getOtherField4() {
        return otherField4;
    }

    public void setOtherField4(String otherField4) {
        this.otherField4 = otherField4;
    }

    public String getOtherField5() {
        return otherField5;
    }

    public void setOtherField5(String otherField5) {
        this.otherField5 = otherField5;
    }

    public String getmType() {
        return mType;
    }

    public void setmType(String mType) {
        this.mType = mType;
    }

    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    @Override
    public String toString() {
        return "DepoTitemDTO{" +
                "id=" + id +
                ", headerId=" + headerId +
                ", materialId=" + materialId +
                ", mUnit='" + mUnit + '\'' +
                ", operNumber=" + operNumber +
                ", basicNumber=" + basicNumber +
                ", unitPrice=" + unitPrice +
                ", taxUnitPrice=" + taxUnitPrice +
                ", allPrice=" + allPrice +
                ", remark='" + remark + '\'' +
                ", img='" + img + '\'' +
                ", incidentals=" + incidentals +
                ", depotId=" + depotId +
                ", anotherDepotId=" + anotherDepotId +
                ", taxRate=" + taxRate +
                ", taxMoney=" + taxMoney +
                ", taxLastMoney=" + taxLastMoney +
                ", otherField1='" + otherField1 + '\'' +
                ", otherField2='" + otherField2 + '\'' +
                ", otherField3='" + otherField3 + '\'' +
                ", otherField4='" + otherField4 + '\'' +
                ", otherField5='" + otherField5 + '\'' +
                ", mType='" + mType + '\'' +
                ", tenantId=" + tenantId +
                ", deleteFlag=" + deleteFlag +
                '}';
    }
}