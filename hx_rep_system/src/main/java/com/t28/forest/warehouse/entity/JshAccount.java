package com.t28.forest.warehouse.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 账户信息
 * </p>
 *
 * @author lcy
 * @since 2019-10-21
 */
public class JshAccount implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */

    private Long Id;

    /**
     * 名称
     */

    private String Name;

    /**
     * 编号
     */

    private String SerialNo;

    /**
     * 期初金额
     */

    private BigDecimal InitialAmount;

    /**
     * 当前余额
     */

    private BigDecimal CurrentAmount;

    /**
     * 备注
     */

    private String Remark;

    /**
     * 是否默认,1表示是,0表示否
     */

    private Integer IsDefault;

    /**
     * 租户id
     */
    private Long tenantId;

    /**
     * 删除标记，0未删除，1删除
     */

    private String deleteFlag;

    public Long getId() {
        return Id;
    }

    public JshAccount setId(Long Id) {
        this.Id = Id;
        return this;
    }
    public String getName() {
        return Name;
    }

    public JshAccount setName(String Name) {
        this.Name = Name;
        return this;
    }
    public String getSerialNo() {
        return SerialNo;
    }

    public JshAccount setSerialNo(String SerialNo) {
        this.SerialNo = SerialNo;
        return this;
    }
    public BigDecimal getInitialAmount() {
        return InitialAmount;
    }

    public JshAccount setInitialAmount(BigDecimal InitialAmount) {
        this.InitialAmount = InitialAmount;
        return this;
    }
    public BigDecimal getCurrentAmount() {
        return CurrentAmount;
    }

    public JshAccount setCurrentAmount(BigDecimal CurrentAmount) {
        this.CurrentAmount = CurrentAmount;
        return this;
    }
    public String getRemark() {
        return Remark;
    }

    public JshAccount setRemark(String Remark) {
        this.Remark = Remark;
        return this;
    }
    public Integer getIsDefault() {
        return IsDefault;
    }

    public JshAccount setIsDefault(Integer IsDefault) {
        this.IsDefault = IsDefault;
        return this;
    }
    public Long getTenantId() {
        return tenantId;
    }

    public JshAccount setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getDeleteFlag() {
        return deleteFlag;
    }

    public JshAccount setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
        return this;
    }

    @Override
    public String toString() {
        return "JshAccount{" +
            "Id=" + Id +
            ", Name=" + Name +
            ", SerialNo=" + SerialNo +
            ", InitialAmount=" + InitialAmount +
            ", CurrentAmount=" + CurrentAmount +
            ", Remark=" + Remark +
            ", IsDefault=" + IsDefault +
            ", tenantId=" + tenantId +
            ", deleteFlag=" + deleteFlag +
        "}";
    }
}
