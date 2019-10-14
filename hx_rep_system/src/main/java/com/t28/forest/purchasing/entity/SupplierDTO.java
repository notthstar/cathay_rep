/**
 * @description 实体类
 * @author HF
 * @create 2019/10/14
 * @since 1.0.0
 */
package com.t28.forest.purchasing.entity;

public class SupplierDTO {
    private Integer id;
    /**
     * 主键
     */
    private String supplier;
    /**
     * 供应商名称
     */
    private String contacts;
    /**
     * 联系人
     */
    private String phonenum;
    /**
     * 联系电话
     */
    private String email;
    /**
     * 电子邮箱
     */
    private String description;
    /**
     * 备注
     */
    private Integer isystem;
    /**
     * 是否系统自带 0==系统 1==非系统
     */
    private String type;
    /**
     * 类型
     */
    private Integer enabled;
    /**
     * 启用
     */
    private double AdvanceIn;
    /**
     * 预收款
     */

    private double BeginNeedGet;
    /**
     * 期初应收
     */
    private double BeginNeedPay;
    /**
     * 期初应付
     */
    private double AllNeedGet;
    /**
     * 累计应收
     */
    private double AllNeedPay;
    /**
     * 累计应付
     */
    private String fax;
    /**
     * 传真
     */
    private String telephone;
    /**
     * 手机
     */
    private String address;
    /**
     * 地址
     */
    private String taxNum;
    /**
     * 纳税人识别号
     */
    private String bankName;
    /**
     * 开户行
     */
    private String accountNumber;
    /**
     * 账号
     */
    private double taxRate;
    /**
     * 税率
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

    public double getAdvanceIn() {
        return AdvanceIn;
    }

    public void setAdvanceIn(double advanceIn) {
        AdvanceIn = advanceIn;
    }

    public double getBeginNeedGet() {
        return BeginNeedGet;
    }

    public void setBeginNeedGet(double beginNeedGet) {
        BeginNeedGet = beginNeedGet;
    }

    public double getBeginNeedPay() {
        return BeginNeedPay;
    }

    public void setBeginNeedPay(double beginNeedPay) {
        BeginNeedPay = beginNeedPay;
    }

    public double getAllNeedGet() {
        return AllNeedGet;
    }

    public void setAllNeedGet(double allNeedGet) {
        AllNeedGet = allNeedGet;
    }

    public double getAllNeedPay() {
        return AllNeedPay;
    }

    public void setAllNeedPay(double allNeedPay) {
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

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
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
                ", tenant_id=" + tenantId +
                ", delete_Flag='" + deleteFlag + '\'' +
                '}';
    }
}
