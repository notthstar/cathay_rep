package com.t28.forest.shared.entity;

import java.util.Date;

/**
 * @author XiangYuFeng
 * @description 单据主表数据传输对象
 * @create 2019/10/16
 * @since 1.0.0
 */
public class DepoTheadDTO {
    /**
     * 主键、自增
     */
    private Integer id;
    /**
     * 类型（出库/入库）
     */
    private String type;
    /**
     * 出入库分类
     */
    private String subType;
    /**
     * 项目ID
     */
    private Integer projectId;
    /**
     * 初始票据号
     */
    private String defaultNumber;
    /**
     * 票据号
     */
    private String number;
    /**
     * 操作员名字
     */
    private String openPersonName;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 出入库时间
     */
    private Date operTime;
    /**
     * 供应商ID
     */
    private Integer organId;
    /**
     * 采购/领料-经手人ID
     */
    private Integer handsPersonId;
    /**
     * 账户ID
     */
    private Integer accountId;
    /**
     * 变动金额（收款/付款）
     */
    private Double changeAmount;
    /**
     * 调拨时、对方项目ID
     */
    private Integer allocationProjectId;
    /**
     * 合计金额
     */
    private Double totalPrice;
    /**
     * 付款类型（现金/记账等）
     */
    private String payType;
    /**
     * 备注
     */
    private String remark;
    /**
     * 业务员（可以多个）
     */
    private String salesMan;
    /**
     * 多账户ID列表
     */
    private String accountIdList;
    /**
     * 多账户金额列表
     */
    private String accountMoneyList;
    /**
     * 优惠率
     */
    private Double disCount;
    /**
     * 优惠金额
     */
    private Double disCountMoney;
    /**
     * 优惠后金额
     */
    private Double disCountLashMoney;
    /**
     * 销售或采购费用合计
     */
    private Double otherMoney;
    /**
     * 销售或采购费用涉及项目ID数组（包括快递、招待等）
     */
    private String otherMoneyList;
    /**
     * 销售或采购费用涉及项目（包括快递、招待等）
     */
    private String otherMoneyItem;
    /**
     * 结算天数
     */
    private Integer accountDay;
    /**
     * 状态、0未审核、1已审核、2已转采购 | 销售
     */
    private String status;
    /**
     * 关联订单号
     */
    private String linkNumber;
    /**
     * 租户ID
     */
    private Integer tenantId;
    /**
     * 删除标记、0未删除、1已删除
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

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getDefaultNumber() {
        return defaultNumber;
    }

    public void setDefaultNumber(String defaultNumber) {
        this.defaultNumber = defaultNumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOpenPersonName() {
        return openPersonName;
    }

    public void setOpenPersonName(String openPersonName) {
        this.openPersonName = openPersonName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getOperTime() {
        return operTime;
    }

    public void setOperTime(Date operTime) {
        this.operTime = operTime;
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

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Double getChangeAmount() {
        return changeAmount;
    }

    public void setChangeAmount(Double changeAmount) {
        this.changeAmount = changeAmount;
    }

    public Integer getAllocationProjectId() {
        return allocationProjectId;
    }

    public void setAllocationProjectId(Integer allocationProjectId) {
        this.allocationProjectId = allocationProjectId;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSalesMan() {
        return salesMan;
    }

    public void setSalesMan(String salesMan) {
        this.salesMan = salesMan;
    }

    public String getAccountIdList() {
        return accountIdList;
    }

    public void setAccountIdList(String accountIdList) {
        this.accountIdList = accountIdList;
    }

    public String getAccountMoneyList() {
        return accountMoneyList;
    }

    public void setAccountMoneyList(String accountMoneyList) {
        this.accountMoneyList = accountMoneyList;
    }

    public Double getDisCount() {
        return disCount;
    }

    public void setDisCount(Double disCount) {
        this.disCount = disCount;
    }

    public Double getDisCountMoney() {
        return disCountMoney;
    }

    public void setDisCountMoney(Double disCountMoney) {
        this.disCountMoney = disCountMoney;
    }

    public Double getDisCountLashMoney() {
        return disCountLashMoney;
    }

    public void setDisCountLashMoney(Double disCountLashMoney) {
        this.disCountLashMoney = disCountLashMoney;
    }

    public Double getOtherMoney() {
        return otherMoney;
    }

    public void setOtherMoney(Double otherMoney) {
        this.otherMoney = otherMoney;
    }

    public String getOtherMoneyList() {
        return otherMoneyList;
    }

    public void setOtherMoneyList(String otherMoneyList) {
        this.otherMoneyList = otherMoneyList;
    }

    public String getOtherMoneyItem() {
        return otherMoneyItem;
    }

    public void setOtherMoneyItem(String otherMoneyItem) {
        this.otherMoneyItem = otherMoneyItem;
    }

    public Integer getAccountDay() {
        return accountDay;
    }

    public void setAccountDay(Integer accountDay) {
        this.accountDay = accountDay;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLinkNumber() {
        return linkNumber;
    }

    public void setLinkNumber(String linkNumber) {
        this.linkNumber = linkNumber;
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
        return "DepoTheadDTO{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", subType='" + subType + '\'' +
                ", projectId=" + projectId +
                ", defaultNumber='" + defaultNumber + '\'' +
                ", number='" + number + '\'' +
                ", openPersonName='" + openPersonName + '\'' +
                ", createTime=" + createTime +
                ", operTime=" + operTime +
                ", organId=" + organId +
                ", handsPersonId=" + handsPersonId +
                ", accountId=" + accountId +
                ", changeAmount=" + changeAmount +
                ", allocationprojectId=" + allocationProjectId +
                ", totalPrice=" + totalPrice +
                ", payType='" + payType + '\'' +
                ", remark='" + remark + '\'' +
                ", salesMan='" + salesMan + '\'' +
                ", accountIdList='" + accountIdList + '\'' +
                ", accountMoneyList='" + accountMoneyList + '\'' +
                ", disCount=" + disCount +
                ", disCountMoney=" + disCountMoney +
                ", disCountLashMoney=" + disCountLashMoney +
                ", otherMoney=" + otherMoney +
                ", otherMoneyList='" + otherMoneyList + '\'' +
                ", othermoneyItem='" + otherMoneyItem + '\'' +
                ", accountDay=" + accountDay +
                ", status='" + status + '\'' +
                ", linkNumber='" + linkNumber + '\'' +
                ", tenantId=" + tenantId +
                ", deleteFlag='" + deleteFlag + '\'' +
                '}';
    }
}