/**
 * @description 实体类
 * @author HF
 * @create 2019/10/14
 * @since 1.0.0
 */
package com.t28.forest.warehouse.entity;

import java.util.Date;

public class DepotheadDTO {
    private Integer Id;
    /**
     * 主键
     */
    private String Type;
    /**
     * 类型(出库/入库)
     */
    private String SubType;
    /**
     * 出入库分类
     */
    private Integer ProjectId;
    /**
     * 项目Id
     */
    private String DefaultNumber;
    /**
     * 初始票据号
     */
    private String Number;
    /**
     * 票据号
     */
    private String OperPersonName;
    /**
     * 操作员名字
     */
    private Date CreateTime;
    /**
     * 创建时间
     */
    private Date OperTime;
    /**
     * 出入库时间
     */
    private Integer OrganId;
    /**
     * 供应商Id
     */
    private double HandsPersonId;
    /**
     * 采购/领料-经手人Id
     */
    private Integer AccountId;
    /**
     * 账户Id
     */
    private double ChangeAmount;
    /**
     * 变动金额(收款/付款)
     */
    private Integer AllocationProjectId;
    /**
     * 调拨时，对方项目Id
     */
    private double TotalPrice;
    /**
     * 合计金额
     */
    private String PayType;
    /**
     * 付款类型(现金、记账等)
     */
    private String Remark;
    /**
     * 备注
     */
    private String Salesman;
    /**
     * 业务员（可以多个）
     */
    private String AccountIdList;
    /**
     * 多账户ID列表
     */
    private String AccountMoneyList;
    /**
     * 多账户金额列表
     */
    private double Discount;
    /**
     * 优惠率
     */
    private double DiscountMoney;
    /**
     * 优惠金额
     */
    private double DiscountLastMoney;
    /**
     * 优惠后金额
     */
    private double OtherMoney;
    /**
     * 销售或采购费用合计
     */
    private String OtherMoneyList;
    /**
     * 销售或采购费用涉及项目Id数组（包括快递、招待等）
     */
    private String OtherMoneyItem;
    /**
     * 销售或采购费用涉及项目（包括快递、招待等）
     */
    private Integer AccountDay;
    /**
     * 结算天数
     */
    private String Status;
    /**
     * 状态，0未审核、1已审核、2已转采购|销售
     */
    private String LinkNumber;
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

    public String getSubType() {
        return SubType;
    }

    public void setSubType(String subType) {
        SubType = subType;
    }

    public Integer getProjectId() {
        return ProjectId;
    }

    public void setProjectId(Integer projectId) {
        ProjectId = projectId;
    }

    public String getDefaultNumber() {
        return DefaultNumber;
    }

    public void setDefaultNumber(String defaultNumber) {
        DefaultNumber = defaultNumber;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getOperPersonName() {
        return OperPersonName;
    }

    public void setOperPersonName(String operPersonName) {
        OperPersonName = operPersonName;
    }

    public Date getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Date createTime) {
        CreateTime = createTime;
    }

    public Date getOperTime() {
        return OperTime;
    }

    public void setOperTime(Date operTime) {
        OperTime = operTime;
    }

    public Integer getOrganId() {
        return OrganId;
    }

    public void setOrganId(Integer organId) {
        OrganId = organId;
    }

    public double getHandsPersonId() {
        return HandsPersonId;
    }

    public void setHandsPersonId(double handsPersonId) {
        HandsPersonId = handsPersonId;
    }

    public Integer getAccountId() {
        return AccountId;
    }

    public void setAccountId(Integer accountId) {
        AccountId = accountId;
    }

    public double getChangeAmount() {
        return ChangeAmount;
    }

    public void setChangeAmount(double changeAmount) {
        ChangeAmount = changeAmount;
    }

    public Integer getAllocationProjectId() {
        return AllocationProjectId;
    }

    public void setAllocationProjectId(Integer allocationProjectId) {
        AllocationProjectId = allocationProjectId;
    }

    public double getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        TotalPrice = totalPrice;
    }

    public String getPayType() {
        return PayType;
    }

    public void setPayType(String payType) {
        PayType = payType;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public String getSalesman() {
        return Salesman;
    }

    public void setSalesman(String salesman) {
        Salesman = salesman;
    }

    public String getAccountIdList() {
        return AccountIdList;
    }

    public void setAccountIdList(String accountIdList) {
        AccountIdList = accountIdList;
    }

    public String getAccountMoneyList() {
        return AccountMoneyList;
    }

    public void setAccountMoneyList(String accountMoneyList) {
        AccountMoneyList = accountMoneyList;
    }

    public double getDiscount() {
        return Discount;
    }

    public void setDiscount(double discount) {
        Discount = discount;
    }

    public double getDiscountMoney() {
        return DiscountMoney;
    }

    public void setDiscountMoney(double discountMoney) {
        DiscountMoney = discountMoney;
    }

    public double getDiscountLastMoney() {
        return DiscountLastMoney;
    }

    public void setDiscountLastMoney(double discountLastMoney) {
        DiscountLastMoney = discountLastMoney;
    }

    public double getOtherMoney() {
        return OtherMoney;
    }

    public void setOtherMoney(double otherMoney) {
        OtherMoney = otherMoney;
    }

    public String getOtherMoneyList() {
        return OtherMoneyList;
    }

    public void setOtherMoneyList(String otherMoneyList) {
        OtherMoneyList = otherMoneyList;
    }

    public String getOtherMoneyItem() {
        return OtherMoneyItem;
    }

    public void setOtherMoneyItem(String otherMoneyItem) {
        OtherMoneyItem = otherMoneyItem;
    }

    public Integer getAccountDay() {
        return AccountDay;
    }

    public void setAccountDay(Integer accountDay) {
        AccountDay = accountDay;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getLinkNumber() {
        return LinkNumber;
    }

    public void setLinkNumber(String linkNumber) {
        LinkNumber = linkNumber;
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
        return "DepotheadDTO{" +
                "Id=" + Id +
                ", Type='" + Type + '\'' +
                ", SubType='" + SubType + '\'' +
                ", ProjectId=" + ProjectId +
                ", DefaultNumber='" + DefaultNumber + '\'' +
                ", Number='" + Number + '\'' +
                ", OperPersonName='" + OperPersonName + '\'' +
                ", CreateTime=" + CreateTime +
                ", OperTime=" + OperTime +
                ", OrganId=" + OrganId +
                ", HandsPersonId=" + HandsPersonId +
                ", AccountId=" + AccountId +
                ", ChangeAmount=" + ChangeAmount +
                ", AllocationProjectId=" + AllocationProjectId +
                ", TotalPrice=" + TotalPrice +
                ", PayType='" + PayType + '\'' +
                ", Remark='" + Remark + '\'' +
                ", Salesman='" + Salesman + '\'' +
                ", AccountIdList='" + AccountIdList + '\'' +
                ", AccountMoneyList='" + AccountMoneyList + '\'' +
                ", Discount=" + Discount +
                ", DiscountMoney=" + DiscountMoney +
                ", DiscountLastMoney=" + DiscountLastMoney +
                ", OtherMoney=" + OtherMoney +
                ", OtherMoneyList='" + OtherMoneyList + '\'' +
                ", OtherMoneyItem='" + OtherMoneyItem + '\'' +
                ", AccountDay=" + AccountDay +
                ", Status='" + Status + '\'' +
                ", LinkNumber='" + LinkNumber + '\'' +
                ", tenantId=" + tenantId +
                ", deleteFlag='" + deleteFlag + '\'' +
                '}';
    }
}
