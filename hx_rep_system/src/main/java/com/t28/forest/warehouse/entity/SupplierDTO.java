package com.t28.forest.warehouse.entity;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 供应商/客户信息表
 * </p>
 *
 * @author lcy
 * @since 2019-10-21
 */

public class SupplierDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */

    private Long id;

    /**
     * 供应商名称
     */
    private String supplier;

    /**
     * 联系人
     */
    private String contacts;

    /**
     * 联系电话
     */
    private String phonenum;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 备注
     */
    private String description;

    /**
     * 是否系统自带 0==系统 1==非系统
     */
    private Integer isystem;

    /**
     * 类型
     */
    private String type;

    /**
     * 启用
     */
    private Integer enabled;

    /**
     * 预收款
     */

    private BigDecimal AdvanceIn;

    /**
     * 期初应收
     */

    private BigDecimal BeginNeedGet;

    /**
     * 期初应付
     */

    private BigDecimal BeginNeedPay;

    /**
     * 累计应收
     */

    private BigDecimal AllNeedGet;

    /**
     * 累计应付
     */

    private BigDecimal AllNeedPay;

    /**
     * 传真
     */
    private String fax;

    /**
     * 手机
     */
    private String telephone;

    /**
     * 地址
     */
    private String address;

    /**
     * 纳税人识别号
     */

    private String taxNum;

    /**
     * 开户行
     */

    private String bankName;

    /**
     * 账号
     */

    private String accountNumber;

    /**
     * 税率
     */

    private BigDecimal taxRate;

    /**
     * 租户id
     */
    private Long tenantId;

    /**
     * 删除标记，0未删除，1删除
     */

    private String deleteFlag;

    public Long getId() {
        return id;
    }

    public SupplierDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public String getSupplier() {
        return supplier;
    }

    public SupplierDTO setSupplier(String supplier) {
        this.supplier = supplier;
        return this;
    }
    public String getContacts() {
        return contacts;
    }

    public SupplierDTO setContacts(String contacts) {
        this.contacts = contacts;
        return this;
    }
    public String getPhonenum() {
        return phonenum;
    }

    public SupplierDTO setPhonenum(String phonenum) {
        this.phonenum = phonenum;
        return this;
    }
    public String getEmail() {
        return email;
    }

    public SupplierDTO setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getDescription() {
        return description;
    }

    public SupplierDTO setDescription(String description) {
        this.description = description;
        return this;
    }
    public Integer getIsystem() {
        return isystem;
    }

    public SupplierDTO setIsystem(Integer isystem) {
        this.isystem = isystem;
        return this;
    }
    public String getType() {
        return type;
    }

    public SupplierDTO setType(String type) {
        this.type = type;
        return this;
    }
    public Integer getEnabled() {
        return enabled;
    }

    public SupplierDTO setEnabled(Integer enabled) {
        this.enabled = enabled;
        return this;
    }
    public BigDecimal getAdvanceIn() {
        return AdvanceIn;
    }

    public SupplierDTO setAdvanceIn(BigDecimal AdvanceIn) {
        this.AdvanceIn = AdvanceIn;
        return this;
    }
    public BigDecimal getBeginNeedGet() {
        return BeginNeedGet;
    }

    public SupplierDTO setBeginNeedGet(BigDecimal BeginNeedGet) {
        this.BeginNeedGet = BeginNeedGet;
        return this;
    }
    public BigDecimal getBeginNeedPay() {
        return BeginNeedPay;
    }

    public SupplierDTO setBeginNeedPay(BigDecimal BeginNeedPay) {
        this.BeginNeedPay = BeginNeedPay;
        return this;
    }
    public BigDecimal getAllNeedGet() {
        return AllNeedGet;
    }

    public SupplierDTO setAllNeedGet(BigDecimal AllNeedGet) {
        this.AllNeedGet = AllNeedGet;
        return this;
    }
    public BigDecimal getAllNeedPay() {
        return AllNeedPay;
    }

    public SupplierDTO setAllNeedPay(BigDecimal AllNeedPay) {
        this.AllNeedPay = AllNeedPay;
        return this;
    }
    public String getFax() {
        return fax;
    }

    public SupplierDTO setFax(String fax) {
        this.fax = fax;
        return this;
    }
    public String getTelephone() {
        return telephone;
    }

    public SupplierDTO setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }
    public String getAddress() {
        return address;
    }

    public SupplierDTO setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getTaxNum() {
        return taxNum;
    }

    public SupplierDTO setTaxNum(String taxNum) {
        this.taxNum = taxNum;
        return this;
    }
    public String getBankName() {
        return bankName;
    }

    public SupplierDTO setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public SupplierDTO setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }
    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public SupplierDTO setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
        return this;
    }
    public Long getTenantId() {
        return tenantId;
    }

    public SupplierDTO setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getDeleteFlag() {
        return deleteFlag;
    }

    public SupplierDTO setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
        return this;
    }

    @Override
    public String toString() {
        return "SupplierDTO{" +
            "id=" + id +
            ", supplier=" + supplier +
            ", contacts=" + contacts +
            ", phonenum=" + phonenum +
            ", email=" + email +
            ", description=" + description +
            ", isystem=" + isystem +
            ", type=" + type +
            ", enabled=" + enabled +
            ", AdvanceIn=" + AdvanceIn +
            ", BeginNeedGet=" + BeginNeedGet +
            ", BeginNeedPay=" + BeginNeedPay +
            ", AllNeedGet=" + AllNeedGet +
            ", AllNeedPay=" + AllNeedPay +
            ", fax=" + fax +
            ", telephone=" + telephone +
            ", address=" + address +
            ", taxNum=" + taxNum +
            ", bankName=" + bankName +
            ", accountNumber=" + accountNumber +
            ", taxRate=" + taxRate +
            ", tenantId=" + tenantId +
            ", deleteFlag=" + deleteFlag +
        "}";
    }
}
