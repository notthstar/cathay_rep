/**
 * @description 实体类
 * @author HF
 * @create 2019/10/14
 * @since 1.0.0
 */
package com.t28.forest.purchasing.entity;

import java.util.Date;

public class AccountheadDTO {
    private Integer id;
    /**
     * 主键
     */
    private String type;
    /**
     * 类型(支出/收入/收款/付款/转账)
     */
    private Integer organId;
    /**
     * 单位Id(收款/付款单位)
     */
    private Integer handsPersonId;
    /**
     * 经手人Id
     */
    private Double changeAmount;
    /**
     * 变动金额(优惠/收款/付款/实付)
     */
    private Double totalPrice;
    /**
     * 合计金额
     */
    private Integer accountId;
    /**
     * 账户(收款/付款)
     */
    private String billNo;
    /**
     * 单据编号
     */
    private Date billTime;
    /**
     * 单据日期
     */
    private String remark;
    /**
     * 备注
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getOrganId() {
        return organId;
    }

    public void setOrganId(Integer organId) {
        this.organId = organId;
    }

    public Integer getHandsPersonId() {
        return handsPersonId;
    }

    public void setHandsPersonId(Integer handsPersonId) {
        this.handsPersonId = handsPersonId;
    }

    public Double getChangeAmount() {
        return changeAmount;
    }

    public void setChangeAmount(Double changeAmount) {
        this.changeAmount = changeAmount;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public Date getBillTime() {
        return billTime;
    }

    public void setBillTime(Date billTime) {
        this.billTime = billTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        return "AccountheadDTO{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", organId=" + organId +
                ", handsPersonId=" + handsPersonId +
                ", changeAmount=" + changeAmount +
                ", totalPrice=" + totalPrice +
                ", accountId=" + accountId +
                ", billNo='" + billNo + '\'' +
                ", billTime=" + billTime +
                ", remark='" + remark + '\'' +
                ", tenantId=" + tenantId +
                ", deleteFlag='" + deleteFlag + '\'' +
                '}';
    }
}
