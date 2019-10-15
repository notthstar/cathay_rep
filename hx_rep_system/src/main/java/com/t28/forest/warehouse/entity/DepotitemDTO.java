/**
 * @description
 * @author lcy
 * @create 2019/10/14
 * @since 1.0.0
 */
package com.t28.forest.warehouse.entity;

public class DepotitemDTO {
    private Integer id;
    /**
     *主键
     */
    private Integer HeaderId;
    /**
     *表头Id
     */
    private Integer MaterialId;
    /**
     *表头Id
     */
    private String MUnit;
    /**
     *商品计量单位
     */
    private Integer OperNumber ;
    /**
     *数量
     */
    private Integer BasicNumber;
    /**
     *基础数量，如kg、瓶
     */
    private Integer UnitPrice;
    /**
     *单价
     */
    private Integer TaxUnitPrice;
    /**
     *含税单价
     */
    private Integer AllPrice;
    /**
     *金额
     */
    private String Remark;
    /**
     *描述
     */
    private String Img;
    /**
     *图片
     */
    private Integer Incidentals;
    /**
     *运杂费
     */
    private Integer DepotId;
    /**
     *仓库ID（库存是统计出来的）
     */
    private Integer AnotherDepotId;
    /**
     *调拨时，对方仓库Id
     */
    private Integer TaxRate;
    /**
     *税率
     */
    private Integer TaxMoney;
    /**
     *税额
     */
    private Integer TaxLastMoney;
    /**
     *价税合计
     */
    private String OtherField1;
    /**
     *自定义字段1-品名
     */
    private String OtherField2;
    /**
     *自定义字段2-型号
     */
    private String OtherField3;
    /**
     *自定义字段3-制造商
     */
    private String OtherField4 ;
    /**
     *自定义字段4
     */
    private String OtherField5;
    /**
     *自定义字段5
     */
    private String MType;
    /**
     *商品类型
     */
    private Integer tenant_id;
    /**
     *租户id
     */
    private String delete_Flag;
    /**
     *删除标记，0未删除，1删除
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHeaderId() {
        return HeaderId;
    }

    public void setHeaderId(Integer headerId) {
        HeaderId = headerId;
    }

    public Integer getMaterialId() {
        return MaterialId;
    }

    public void setMaterialId(Integer materialId) {
        MaterialId = materialId;
    }

    public String getMUnit() {
        return MUnit;
    }

    public void setMUnit(String MUnit) {
        this.MUnit = MUnit;
    }

    public Integer getOperNumber() {
        return OperNumber;
    }

    public void setOperNumber(Integer operNumber) {
        OperNumber = operNumber;
    }

    public Integer getBasicNumber() {
        return BasicNumber;
    }

    public void setBasicNumber(Integer basicNumber) {
        BasicNumber = basicNumber;
    }

    public Integer getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        UnitPrice = unitPrice;
    }

    public Integer getTaxUnitPrice() {
        return TaxUnitPrice;
    }

    public void setTaxUnitPrice(Integer taxUnitPrice) {
        TaxUnitPrice = taxUnitPrice;
    }

    public Integer getAllPrice() {
        return AllPrice;
    }

    public void setAllPrice(Integer allPrice) {
        AllPrice = allPrice;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public String getImg() {
        return Img;
    }

    public void setImg(String img) {
        Img = img;
    }

    public Integer getIncidentals() {
        return Incidentals;
    }

    public void setIncidentals(Integer incidentals) {
        Incidentals = incidentals;
    }

    public Integer getDepotId() {
        return DepotId;
    }

    public void setDepotId(Integer depotId) {
        DepotId = depotId;
    }

    public Integer getAnotherDepotId() {
        return AnotherDepotId;
    }

    public void setAnotherDepotId(Integer anotherDepotId) {
        AnotherDepotId = anotherDepotId;
    }

    public Integer getTaxRate() {
        return TaxRate;
    }

    public void setTaxRate(Integer taxRate) {
        TaxRate = taxRate;
    }

    public Integer getTaxMoney() {
        return TaxMoney;
    }

    public void setTaxMoney(Integer taxMoney) {
        TaxMoney = taxMoney;
    }

    public Integer getTaxLastMoney() {
        return TaxLastMoney;
    }

    public void setTaxLastMoney(Integer taxLastMoney) {
        TaxLastMoney = taxLastMoney;
    }

    public String getOtherField1() {
        return OtherField1;
    }

    public void setOtherField1(String otherField1) {
        OtherField1 = otherField1;
    }

    public String getOtherField2() {
        return OtherField2;
    }

    public void setOtherField2(String otherField2) {
        OtherField2 = otherField2;
    }

    public String getOtherField3() {
        return OtherField3;
    }

    public void setOtherField3(String otherField3) {
        OtherField3 = otherField3;
    }

    public String getOtherField4() {
        return OtherField4;
    }

    public void setOtherField4(String otherField4) {
        OtherField4 = otherField4;
    }

    public String getOtherField5() {
        return OtherField5;
    }

    public void setOtherField5(String otherField5) {
        OtherField5 = otherField5;
    }

    public String getMType() {
        return MType;
    }

    public void setMType(String MType) {
        this.MType = MType;
    }

    public Integer getTenant_id() {
        return tenant_id;
    }

    public void setTenant_id(Integer tenant_id) {
        this.tenant_id = tenant_id;
    }

    public String getDelete_Flag() {
        return delete_Flag;
    }

    public void setDelete_Flag(String delete_Flag) {
        this.delete_Flag = delete_Flag;
    }
}
