package com.t28.forest.retail.entity;

import java.util.Date;

/**
 * 功能描述:Depothead数据传输对象
 *
 * @since: 1.0.0
 * @Author: Zsy
 * @Date: 2019/10/16$
 */
public class DepotheadDTO {

    private Integer id;
    /**
     * 主键
     */
    private String type;
    /**
     * 类型(出库/入库)
     */
    private String subType;
    /**
     * 出入库分类
     */
    private Integer projectId;
    /**
     * 项目Id
     */
    private String defaultNumber;
    /**
     * 初始票据号
     */
    private String number;
    /**
     * 票据号
     */
    private String operPersonName;
    /**
     * 操作员名字
     */
    private Date createTime;
    /**
     * 创建时间
     */
    private Date operTime;
    /**
     * 出入库时间
     */
    private Integer organId;
    /**
     * 供应商Id
     */
    private Double handsPersonId;
    /**
     * 采购/领料-经手人Id
     */
    private Integer accountId;
    /**
     * 账户Id
     */
    private Double changeAmount;
    /**
     * 变动金额(收款/付款)
     */
    private Integer allocationProjectId;
    /**
     * 调拨时，对方项目Id
     */
    private Double totalPrice;
    /**
     * 合计金额
     */
    private String payType;
    /**
     * 付款类型(现金、记账等)
     */
    private String remark;
    /**
     * 备注
     */
    private String salesman;
    /**
     * 业务员（可以多个）
     */
    private String accountIdList;
    /**
     * 多账户ID列表
     */
    private String accountMoneyList;
    /**
     * 多账户金额列表
     */
    private Double discount;
    /**
     * 优惠率
     */
    private Double discountMoney;
    /**
     * 优惠金额
     */
    private Double discountLastMoney;
    /**
     * 优惠后金额
     */
    private Double otherMoney;
    /**
     * 销售或采购费用合计
     */
    private String otherMoneyList;
    /**
     * 销售或采购费用涉及项目Id数组（包括快递、招待等）
     */
    private String otherMoneyItem;
    /**
     * 销售或采购费用涉及项目（包括快递、招待等）
     */
    private Integer accountDay;
    /**
     * 结算天数
     */
    private String status;
    /**
     * 状态，0未审核、1已审核、2已转采购|销售
     */
    private String linkNumber;
    /**
     * 关联订单号
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

    public String getOperPersonName() {
        return operPersonName;
    }

    public void setOperPersonName(String operPersonName) {
        this.operPersonName = operPersonName;
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

    public Double getHandsPersonId() {
        return handsPersonId;
    }

    public void setHandsPersonId(Double handsPersonId) {
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

    public String getSalesman() {
        return salesman;
    }

    public void setSalesman(String salesman) {
        this.salesman = salesman;
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

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getDiscountMoney() {
        return discountMoney;
    }

    public void setDiscountMoney(Double discountMoney) {
        this.discountMoney = discountMoney;
    }

    public Double getDiscountLastMoney() {
        return discountLastMoney;
    }

    public void setDiscountLastMoney(Double discountLastMoney) {
        this.discountLastMoney = discountLastMoney;
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
                ", operPersonName='" + operPersonName + '\'' +
                ", createTime=" + createTime +
                ", operTime=" + operTime +
                ", organId=" + organId +
                ", handsPersonId=" + handsPersonId +
                ", accountId=" + accountId +
                ", changeAmount=" + changeAmount +
                ", allocationProjectId=" + allocationProjectId +
                ", totalPrice=" + totalPrice +
                ", payType='" + payType + '\'' +
                ", remark='" + remark + '\'' +
                ", salesman='" + salesman + '\'' +
                ", accountIdList='" + accountIdList + '\'' +
                ", accountMoneyList='" + accountMoneyList + '\'' +
                ", discount=" + discount +
                ", discountMoney=" + discountMoney +
                ", discountLastMoney=" + discountLastMoney +
                ", otherMoney=" + otherMoney +
                ", otherMoneyList='" + otherMoneyList + '\'' +
                ", otherMoneyItem='" + otherMoneyItem + '\'' +
                ", accountDay=" + accountDay +
                ", status='" + status + '\'' +
                ", linkNumber='" + linkNumber + '\'' +
                ", tenantId=" + tenantId +
                ", deleteFlag='" + deleteFlag + '\'' +
                '}';
    }
}
