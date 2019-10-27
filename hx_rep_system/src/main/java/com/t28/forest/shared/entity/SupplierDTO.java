package com.t28.forest.shared.entity;

/**
 * @author XiangYuFeng
 * @description 供应商/客户信息表数据传输对象
 * @create 2019/10/21
 * @since 1.0.0
 */
public class SupplierDTO {
    /**
     *主键
     */
    private Integer id;
    /**
     *名称
     */
    private String supplier;
    /**
     *联系人
     */
    private String contacts;
    /**
     *联系电话
     */
    private String phoneNum;
    /**
     *电子邮箱
     */
    private String email;
    /**
     *备注
     */
    private String description;
    /**
     *是否系统自带 0==系统 1==非系统
     */
    private Integer isystem;
    /**
     *类型
     */
    private String type;
    /**
     *启用
     */
    private Integer enabled;
    /**
     *预收款
     */
    private Double advanceIn;
    /**
     *期初应收
     */
    private Double beginNeedGet;
    /**
     *期初应付
     */
    private Double beginNeedPay;
    /**
     *累计应收
     */
    private Double allNeedGet;
    /**
     *累计应付
     */
    private Double allNeedPay;
    /**
     *传真
     */
    private String fax;
    /**
     *手机
     */
    private String telephone;
    /**
     *地址
     */
    private String address;
    /**
     *纳税人识别号
     */
    private String taxNum;
    /**
     *开户行
     */
    private String bankName;
    /**
     *账号
     */
    private String accountNumber;
    /**
     *税率
     */
    private Double taxRate;
    /**
     *租户id
     */
    private Integer tenantId;
    /**
     *删除标记，0未删除，1删除
     */
    private String deleteFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getIsystem() {
        return isystem;
    }

    public void setIsystem(Integer isystem) {
        this.isystem = isystem;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public Double getAdvanceIn() {
        return advanceIn;
    }

    public void setAdvanceIn(Double advanceIn) {
        this.advanceIn = advanceIn;
    }

    public Double getBeginNeedGet() {
        return beginNeedGet;
    }

    public void setBeginNeedGet(Double beginNeedGet) {
        this.beginNeedGet = beginNeedGet;
    }

    public Double getBeginNeedPay() {
        return beginNeedPay;
    }

    public void setBeginNeedPay(Double beginNeedPay) {
        this.beginNeedPay = beginNeedPay;
    }

    public Double getAllNeedGet() {
        return allNeedGet;
    }

    public void setAllNeedGet(Double allNeedGet) {
        this.allNeedGet = allNeedGet;
    }

    public Double getAllNeedPay() {
        return allNeedPay;
    }

    public void setAllNeedPay(Double allNeedPay) {
        this.allNeedPay = allNeedPay;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTaxNum() {
        return taxNum;
    }

    public void setTaxNum(String taxNum) {
        this.taxNum = taxNum;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
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
        return "SupplierDTO{" +
                "id=" + id +
                ", supplier='" + supplier + '\'' +
                ", contacts='" + contacts + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", email='" + email + '\'' +
                ", description='" + description + '\'' +
                ", isystem=" + isystem +
                ", type='" + type + '\'' +
                ", enabled=" + enabled +
                ", advanceIn=" + advanceIn +
                ", beginNeedGet=" + beginNeedGet +
                ", beginNeedPay=" + beginNeedPay +
                ", allNeedGet=" + allNeedGet +
                ", allNeedPay=" + allNeedPay +
                ", fax='" + fax + '\'' +
                ", telephone='" + telephone + '\'' +
                ", address='" + address + '\'' +
                ", taxNum='" + taxNum + '\'' +
                ", bankName='" + bankName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", taxRate=" + taxRate +
                ", tenantId=" + tenantId +
                ", deleteFlag='" + deleteFlag + '\'' +
                '}';
    }
}