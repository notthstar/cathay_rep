package com.t28.forest.retail.entity;

/**
 * 功能描述:Supplier数据传输对象
 *
 * @since: 1.0.0
 * @Author: Zsy
 * @Date: 2019/10/21$
 */
public class SupplierDTO {
    private Integer id;
    /**
     *主键
     */
    private String supplier;
    /**
     *名称
     */
    private String contacts;
    /**
     *联系人
     */
    private String phonenum;
    /**
     *联系电话
     */
    private String email;
    /**
     *电子邮箱
     */
    private String description;
    /**
     *备注
     */
    private Integer isystem;
    /**
     *是否系统自带 0==系统 1==非系统
     */
    private String type;
    /**
     *类型
     */
    private Integer enabled;
    /**
     *启用
     */
    private Double AdvanceIn;
    /**
     *预收款
     */
    private Double BeginNeedGet;
    /**
     *期初应收
     */
    private Double BeginNeedPay;
    /**
     *期初应付
     */
    private Double AllNeedGet;
    /**
     *累计应收
     */
    private Double AllNeedPay;
    /**
     *累计应付
     */
    private String fax;
    /**
     *传真
     */
    private String telephone;
    /**
     *手机
     */
    private String address;
    /**
     *地址
     */
    private String taxNum;
    /**
     *纳税人识别号
     */
    private String bankName;
    /**
     *开户行
     */
    private String accountNumber;
    /**
     *账号
     */
    private Double taxRate;
    /**
     *税率
     */
    private Integer tenant_id;
    /**
     *租户id
     */
    private String delete_Flag;
    /**
     *删除标记，0未删除，1删除
     */

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

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
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
        return AdvanceIn;
    }

    public void setAdvanceIn(Double advanceIn) {
        AdvanceIn = advanceIn;
    }

    public Double getBeginNeedGet() {
        return BeginNeedGet;
    }

    public void setBeginNeedGet(Double beginNeedGet) {
        BeginNeedGet = beginNeedGet;
    }

    public Double getBeginNeedPay() {
        return BeginNeedPay;
    }

    public void setBeginNeedPay(Double beginNeedPay) {
        BeginNeedPay = beginNeedPay;
    }

    public Double getAllNeedGet() {
        return AllNeedGet;
    }

    public void setAllNeedGet(Double allNeedGet) {
        AllNeedGet = allNeedGet;
    }

    public Double getAllNeedPay() {
        return AllNeedPay;
    }

    public void setAllNeedPay(Double allNeedPay) {
        AllNeedPay = allNeedPay;
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

    public Integer getTenant_id() {
        return tenant_id;
    }

    public void setTenant_id(Integer tenant_id) {
        this.tenant_id = tenant_id;
    }

    public String getDelete_Flag() {
        return delete_Flag;
    }

    public void setDelete_Flag(String delete_Flag) {
        this.delete_Flag = delete_Flag;
    }

    @Override
    public String toString() {
        return "SupplierDTO{" +
                "id=" + id +
                ", supplier='" + supplier + '\'' +
                ", contacts='" + contacts + '\'' +
                ", phonenum='" + phonenum + '\'' +
                ", email='" + email + '\'' +
                ", description='" + description + '\'' +
                ", isystem=" + isystem +
                ", type='" + type + '\'' +
                ", enabled=" + enabled +
                ", AdvanceIn=" + AdvanceIn +
                ", BeginNeedGet=" + BeginNeedGet +
                ", BeginNeedPay=" + BeginNeedPay +
                ", AllNeedGet=" + AllNeedGet +
                ", AllNeedPay=" + AllNeedPay +
                ", fax='" + fax + '\'' +
                ", telephone='" + telephone + '\'' +
                ", address='" + address + '\'' +
                ", taxNum='" + taxNum + '\'' +
                ", bankName='" + bankName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", taxRate=" + taxRate +
                ", tenant_id=" + tenant_id +
                ", delete_Flag='" + delete_Flag + '\'' +
                '}';
    }
}
