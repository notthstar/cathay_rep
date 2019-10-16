/**
 * @description 实体类
 * @author HF
 * @create 2019/10/14
 * @since 1.0.0
 */
package com.t28.forest.purchasing.entity;

public class MaterialDTO {
    private Integer id;
    /**
     * 主键
     */
    private Integer categoryId;
    /**
     * 产品类型
     */
    private String name;
    /**
     * 名称
     */
    private String mfrs;
    /**
     * 制造商
     */
    private double packing;
    /**
     * 包装（KG/包）
     */
    private double safetyStock;
    /**
     * 安全存量（KG）
     */
    private String model;
    /**
     * 型号
     */
    private String standard;
    /**
     * 规格
     */
    private String color;
    /**
     * 颜色
     */
    private String unit;
    /**
     * 单位-单个
     */
    private String remark;
    /**
     * 备注
     */
    private double retailPrice;
    /**
     * 零售价
     */
    private double lowPrice;
    /**
     * 最低售价
     */
    private double presetPriceOne;
    /**
     * 预设售价一
     */
    private double presetPriceTwo;
    /**
     * 预设售价二
     */
    private Integer unitId;
    /**
     * 计量单位Id
     */
    private String firstOutUnit;
    /**
     * 首选出库单位
     */
    private String firstInUnit;
    /**
     * 首选入库单位
     */
    private String priceStrategy;
    /**
     * 价格策略
     */
    private Integer enabled;
    /**
     * 启用 0-禁用  1-启用
     */
    private String otherField1;
    /**
     * 自定义1
     */
    private String otherField2;
    /**
     * 自定义2
     */
    private String otherField3;
    /**
     * 自定义3
     */
    private String enableSerialNumber;
    /**
     * 是否开启序列号，0否，1是
     */
    private Integer tenantId;
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

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMfrs() {
        return mfrs;
    }

    public void setMfrs(String mfrs) {
        this.mfrs = mfrs;
    }

    public double getPacking() {
        return packing;
    }

    public void setPacking(double packing) {
        this.packing = packing;
    }

    public double getSafetyStock() {
        return safetyStock;
    }

    public void setSafetyStock(double safetyStock) {
        this.safetyStock = safetyStock;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public double getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(double lowPrice) {
        this.lowPrice = lowPrice;
    }

    public double getPresetPriceOne() {
        return presetPriceOne;
    }

    public void setPresetPriceOne(double presetPriceOne) {
        this.presetPriceOne = presetPriceOne;
    }

    public double getPresetPriceTwo() {
        return presetPriceTwo;
    }

    public void setPresetPriceTwo(double presetPriceTwo) {
        this.presetPriceTwo = presetPriceTwo;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public String getFirstOutUnit() {
        return firstOutUnit;
    }

    public void setFirstOutUnit(String firstOutUnit) {
        this.firstOutUnit = firstOutUnit;
    }

    public String getFirstInUnit() {
        return firstInUnit;
    }

    public void setFirstInUnit(String firstInUnit) {
        this.firstInUnit = firstInUnit;
    }

    public String getPriceStrategy() {
        return priceStrategy;
    }

    public void setPriceStrategy(String priceStrategy) {
        this.priceStrategy = priceStrategy;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
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

    public String getEnableSerialNumber() {
        return enableSerialNumber;
    }

    public void setEnableSerialNumber(String enableSerialNumber) {
        this.enableSerialNumber = enableSerialNumber;
    }

    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    @Override
    public String toString() {
        return "MaterialDTO{" +
                "id=" + id +
                ", categoryId=" + categoryId +
                ", name='" + name + '\'' +
                ", mfrs='" + mfrs + '\'' +
                ", packing=" + packing +
                ", safetyStock=" + safetyStock +
                ", model='" + model + '\'' +
                ", standard='" + standard + '\'' +
                ", color='" + color + '\'' +
                ", unit='" + unit + '\'' +
                ", remark='" + remark + '\'' +
                ", retailPrice=" + retailPrice +
                ", lowPrice=" + lowPrice +
                ", presetPriceOne=" + presetPriceOne +
                ", presetPriceTwo=" + presetPriceTwo +
                ", unitId=" + unitId +
                ", firstOutUnit='" + firstOutUnit + '\'' +
                ", firstInUnit='" + firstInUnit + '\'' +
                ", priceStrategy='" + priceStrategy + '\'' +
                ", enabled=" + enabled +
                ", otherField1='" + otherField1 + '\'' +
                ", otherField2='" + otherField2 + '\'' +
                ", otherField3='" + otherField3 + '\'' +
                ", enableSerialNumber='" + enableSerialNumber + '\'' +
                ", tenantId=" + tenantId +
                ", deleteFlag='" + deleteFlag + '\'' +
                '}';
    }
}
