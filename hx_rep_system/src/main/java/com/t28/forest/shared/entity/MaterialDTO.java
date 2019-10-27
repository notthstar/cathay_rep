package com.t28.forest.shared.entity;

/**
 * @author XiangYuFeng
 * @description 商品表数据传输对象
 * @create 2019/10/14
 * @since 1.0.0
 */
public class MaterialDTO {
    /**
     * 主键自增
     */
    private Integer id;
    /**
     * 产品类型
     */
    private Integer categoryId;
    /**
     * 产品名称
     */
    private String name;
    /**
     * 产品制造商
     */
    private String mfrs;
    /**
     * 产品包装（KG/包）
     */
    private Double packing;
    /**
     * 安全存量（KG）
     */
    private Double safetyStock;
    /**
     * 型号
     */
    private String model;
    /**
     * 规格
     */
    private String standard;
    /**
     * 颜色
     */
    private String color;
    /**
     * 单位-单个
     */
    private String unit;
    /**
     * 备注
     */
    private String remark;
    /**
     * 零售价
     */
    private Double retailPrice;
    /**
     * 最低售价
     */
    private Double lowPrice;
    /**
     * 预设售价一
     */
    private Double presetPriceOne;
    /**
     * 预设售价二
     */
    private Double presetPriceTow;
    /**
     * 计量单位Id
     */
    private Integer unitId;
    /**
     * 首选出库单位
     */
    private String firstOutUnit;
    /**
     * 首选入库单位
     */
    private String firstInUnit;
    /**
     * 价格策略
     */
    private String priceStrategy;
    /**
     * 启用 0-禁用  1-启用
     */
    private Integer enabled;
    /**
     * 自定义1
     */
    private String otherField1;
    /**
     * 自定义2
     */
    private String otherField2;
    /**
     * 自定义3
     */
    private String otherField3;
    /**
     * 是否开启序列号，0否，1是
     */
    private String enableSerialNumber;
    /**
     * 租户id
     */
    private Integer tenantId;
    /**
     * 删除标记，0未删除，1删除
     */
    private String deleteFlag;

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

    public Double getPacking() {
        return packing;
    }

    public void setPacking(Double packing) {
        this.packing = packing;
    }

    public Double getSafetyStock() {
        return safetyStock;
    }

    public void setSafetyStock(Double safetyStock) {
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

    public Double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(Double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public Double getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(Double lowPrice) {
        this.lowPrice = lowPrice;
    }

    public Double getPresetPriceOne() {
        return presetPriceOne;
    }

    public void setPresetPriceOne(Double presetPriceOne) {
        this.presetPriceOne = presetPriceOne;
    }

    public Double getPresetPriceTow() {
        return presetPriceTow;
    }

    public void setPresetPriceTow(Double presetPriceTow) {
        this.presetPriceTow = presetPriceTow;
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
                ", presetPriceTow=" + presetPriceTow +
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