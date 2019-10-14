/**
 * @description 实体类
 * @author HF
 * @create 2019/10/14
 * @since 1.0.0
 */
package com.t28.forest.purchasing.entity;

import java.util.Date;

public class AccountheadDTO {
    private Integer Id;
    /**
     * 主键
     */
    private String Type;
    /**
     * 类型(支出/收入/收款/付款/转账)
     */
    private Integer OrganId;
    /**
     * 单位Id(收款/付款单位)
     */
    private Integer HandsPersonId;
    /**
     * 经手人Id
     */
    private double ChangeAmount;
    /**
     * 变动金额(优惠/收款/付款/实付)
     */
    private double TotalPrice;
    /**
     * 合计金额
     */
    private Integer AccountId;
    /**
     * 账户(收款/付款)
     */
    private String BillNo;
    /**
     * 单据编号
     */
    private Date BillTime;
    /**
     * 单据日期
     */
    private String Remark;
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
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Integer getOrganId() {
        return OrganId;
    }

    public void setOrganId(Integer organId) {
        OrganId = organId;
    }

    public Integer getHandsPersonId() {
        return HandsPersonId;
    }

    public void setHandsPersonId(Integer handsPersonId) {
        HandsPersonId = handsPersonId;
    }

    public double getChangeAmount() {
        return ChangeAmount;
    }

    public void setChangeAmount(double changeAmount) {
        ChangeAmount = changeAmount;
    }

    public double getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        TotalPrice = totalPrice;
    }

    public Integer getAccountId() {
        return AccountId;
    }

    public void setAccountId(Integer accountId) {
        AccountId = accountId;
    }

    public String getBillNo() {
        return BillNo;
    }

    public void setBillNo(String billNo) {
        BillNo = billNo;
    }

    public Date getBillTime() {
        return BillTime;
    }

    public void setBillTime(Date billTime) {
        BillTime = billTime;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
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
                "Id=" + Id +
                ", Type='" + Type + '\'' +
                ", OrganId=" + OrganId +
                ", HandsPersonId=" + HandsPersonId +
                ", ChangeAmount=" + ChangeAmount +
                ", TotalPrice=" + TotalPrice +
                ", AccountId=" + AccountId +
                ", BillNo='" + BillNo + '\'' +
                ", BillTime=" + BillTime +
                ", Remark='" + Remark + '\'' +
                ", tenantId=" + tenantId +
                ", deleteFlag='" + deleteFlag + '\'' +
                '}';
    }
}
