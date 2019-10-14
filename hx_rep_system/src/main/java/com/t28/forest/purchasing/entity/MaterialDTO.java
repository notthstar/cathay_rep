/**
 * @description 实体类
 * @author HF
 * @create 2019/10/14
 * @since 1.0.0
 */
package com.t28.forest.purchasing.entity;

public class MaterialDTO {
    private Integer Id;
    /**
     * 主键
     */
    private Integer CategoryId;
    /**
     * 产品类型
     */
    private String Name;
    /**
     * 名称
     */
    private String Mfrs;
    /**
     * 制造商
     */
    private double Packing;
    /**
     * 包装（KG/包）
     */
    private double SafetyStock;
    /**
     * 安全存量（KG）
     */
    private String Model;
    /**
     * 型号
     */
    private String Standard;
    /**
     * 规格
     */
    private String Color;
    /**
     * 颜色
     */
    private String Unit;
    /**
     * 单位-单个
     */
    private String Remark;
    /**
     * 备注
     */
    private double RetailPrice;
    /**
     * 零售价
     */
    private double LowPrice;
    /**
     * 最低售价
     */
    private double PresetPriceOne;
    /**
     * 预设售价一
     */
    private double PresetPriceTwo;
    /**
     * 预设售价二
     */
    private Integer UnitId;
    /**
     * 计量单位Id
     */
    private String FirstOutUnit;
    /**
     * 首选出库单位
     */
    private String FirstInUnit;
    /**
     * 首选入库单位
     */
    private String PriceStrategy;
    /**
     * 价格策略
     */
    private Integer Enabled;
    /**
     * 启用 0-禁用  1-启用
     */
    private String OtherField1;
    /**
     * 自定义1
     */
    private String OtherField2;
    /**
     * 自定义2
     */
    private String OtherField3;
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
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(Integer categoryId) {
        CategoryId = categoryId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMfrs() {
        return Mfrs;
    }

    public void setMfrs(String mfrs) {
        Mfrs = mfrs;
    }

    public double getPacking() {
        return Packing;
    }

    public void setPacking(double packing) {
        Packing = packing;
    }

    public double getSafetyStock() {
        return SafetyStock;
    }

    public void setSafetyStock(double safetyStock) {
        SafetyStock = safetyStock;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getStandard() {
        return Standard;
    }

    public void setStandard(String standard) {
        Standard = standard;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public double getRetailPrice() {
        return RetailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        RetailPrice = retailPrice;
    }

    public double getLowPrice() {
        return LowPrice;
    }

    public void setLowPrice(double lowPrice) {
        LowPrice = lowPrice;
    }

    public double getPresetPriceOne() {
        return PresetPriceOne;
    }

    public void setPresetPriceOne(double presetPriceOne) {
        PresetPriceOne = presetPriceOne;
    }

    public double getPresetPriceTwo() {
        return PresetPriceTwo;
    }

    public void setPresetPriceTwo(double presetPriceTwo) {
        PresetPriceTwo = presetPriceTwo;
    }

    public Integer getUnitId() {
        return UnitId;
    }

    public void setUnitId(Integer unitId) {
        UnitId = unitId;
    }

    public String getFirstOutUnit() {
        return FirstOutUnit;
    }

    public void setFirstOutUnit(String firstOutUnit) {
        FirstOutUnit = firstOutUnit;
    }

    public String getFirstInUnit() {
        return FirstInUnit;
    }

    public void setFirstInUnit(String firstInUnit) {
        FirstInUnit = firstInUnit;
    }

    public String getPriceStrategy() {
        return PriceStrategy;
    }

    public void setPriceStrategy(String priceStrategy) {
        PriceStrategy = priceStrategy;
    }

    public Integer getEnabled() {
        return Enabled;
    }

    public void setEnabled(Integer enabled) {
        Enabled = enabled;
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
                "Id=" + Id +
                ", CategoryId=" + CategoryId +
                ", Name='" + Name + '\'' +
                ", Mfrs='" + Mfrs + '\'' +
                ", Packing=" + Packing +
                ", SafetyStock=" + SafetyStock +
                ", Model='" + Model + '\'' +
                ", Standard='" + Standard + '\'' +
                ", Color='" + Color + '\'' +
                ", Unit='" + Unit + '\'' +
                ", Remark='" + Remark + '\'' +
                ", RetailPrice=" + RetailPrice +
                ", LowPrice=" + LowPrice +
                ", PresetPriceOne=" + PresetPriceOne +
                ", PresetPriceTwo=" + PresetPriceTwo +
                ", UnitId=" + UnitId +
                ", FirstOutUnit='" + FirstOutUnit + '\'' +
                ", FirstInUnit='" + FirstInUnit + '\'' +
                ", PriceStrategy='" + PriceStrategy + '\'' +
                ", Enabled=" + Enabled +
                ", OtherField1='" + OtherField1 + '\'' +
                ", OtherField2='" + OtherField2 + '\'' +
                ", OtherField3='" + OtherField3 + '\'' +
                ", enableSerialNumber='" + enableSerialNumber + '\'' +
                ", tenantId=" + tenantId +
                ", deleteFlag='" + deleteFlag + '\'' +
                '}';
    }
}
