package com.t28.forest.shared.entity;

import java.util.Date;

/**
 * @author XiangYuFeng
 * @description 财务主表数据传输对象
 * @create 2019/10/14
 * @since 1.0.0
 */
public class AccounTheadDTO {
    /**
     * 主键自增
     */
    private Integer id;
    /**
     * 类型(支出/收入/收款/付款/转账)
     */
    private String type;
    /**
     * 单位Id(收款/付款单位)
     */
    private Integer organId;
    /**
     * 经手人Id
     */
    private Integer handsPersonId;
    /**
     * 变动金额(优惠/收款/付款/实付)
     */
    private Double changeAmount;
    /**
     * 合计金额
     */
    private Double totalPrice;
    /**
     * 账户(收款/付款)
     */
    private Integer accountId;
    /**
     * 单据编号
     */
    private String billNo;
    /**
     * 单据日期
     */
    private Date billTime;
    /**
     * 备注
     */
    private String remark;
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
        return "AccounTheadDTO{" +
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