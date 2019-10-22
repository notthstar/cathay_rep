package com.t28.forest.retail.entity;

/**
 * 功能描述:Depotitem数据传输对象
 *
 * @since: 1.0.0
 * @Author: Zsy
 * @Date: 2019/10/16$
 */
public class DepotitemDTO {
    private Integer id;
    /**
     * 主键
     */
    private Integer headerId;
    /**
     * 表头Id
     */
    private Integer materialId;
    /**
     * 材料Id
     */
    private String munit;
    /**
     * 商品计量单位
     */
    private Double operNumber;
    /**
     * 数量
     */
    private Double basicNumber;
    /**
     * 基础数量，如kg、瓶
     */
    private Double unitPrice;
    /**
     * 单价
     */
    private Double taxUnitPrice;
    /**
     * 含税单价
     */
    private Double allPrice;
    /**
     * 金额
     */
    private String remark;
    /**
     * 描述
     */
    private String img;
    /**
     * 图片
     */
    private Double incidentals;
    /**
     * 运杂费
     */
    private Integer depotId;
    /**
     * 仓库ID（库存是统计出来的）
     */
    private Integer anotherDepotId;
    /**
     * 调拨时，对方仓库Id
     */
    private Double taxRate;
    /**
     * 税率
     */
    private Double taxMoney;
    /**
     * 税额
     */
    private Double taxLastMoney;
    /**
     * 价税合计
     */
    private String otherField1;
    /**
     * 自定义字段1-品名
     */
    private String otherField2;
    /**
     * 自定义字段2-型号
     */
    private String otherField3;
    /**
     * 自定义字段3-制造商
     */
    private String otherField4;
    /**
     * 自定义字段4
     */
    private String otherField5;
    /**
     * 自定义字段5
     */
    private String mType;
    /**
     * 商品类型
     */
    private String tenantid;
    /**
     * 租户id
     */
    private String deleteFlag;
    /**
     * 删除标记，0未删除，1删除
     */

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

    public String getMunit() {
        return munit;
    }

    public void setMunit(String munit) {
        this.munit = munit;
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

    public String getTenantid() {
        return tenantid;
    }

    public void setTenantid(String tenantid) {
        this.tenantid = tenantid;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    @Override
    public String toString() {
        return "DepotitemDTO{" +
                "id=" + id +
                ", headerId=" + headerId +
                ", materialId=" + materialId +
                ", munit='" + munit + '\'' +
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
                ", tenantid='" + tenantid + '\'' +
                ", deleteFlag='" + deleteFlag + '\'' +
                '}';
    }
}
