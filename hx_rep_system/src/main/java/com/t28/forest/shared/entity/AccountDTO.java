package com.t28.forest.shared.entity;

/**
 * @author XiangYuFeng
 * @description 账户信息表数据传输对象
 * @create 2019/10/14
 * @since 1.0.0
 */
public class AccountDTO {
    /**
     * 主键
     */
    private Integer id;
    /**
     * 名称
     */
    private String name;
    /**
     * 编号
     */
    private String serialNo;
    /**
     * 期初金额
     */
    private Double initialAmount;
    /**
     * 当前余额
     */
    private Double currentAmount;
    /**
     * 备注
     */
    private String remark;
    /**
     * 是否默认,1表示是,0表示否
     */
    private Integer isDefault;
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

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public Double getInitialAmount() {
        return initialAmount;
    }

    public void setInitialAmount(Double initialAmount) {
        this.initialAmount = initialAmount;
    }

    public Double getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(Double currentAmount) {
        this.currentAmount = currentAmount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    @Override
    public String toString() {
        return "AccountDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", serialNo='" + serialNo + '\'' +
                ", initialAmount=" + initialAmount +
                ", currentAmount=" + currentAmount +
                ", remark='" + remark + '\'' +
                ", isDefault=" + isDefault +
                ", tenantId=" + tenantId +
                ", deleteFlag='" + deleteFlag + '\'' +
                '}';
    }
}
