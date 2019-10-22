package com.t28.forest.warehouse.entity;


import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 仓库表
 * </p>
 *
 * @author lcy
 * @since 2019-10-21
 */
public class JshDepot implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */

    private Long id;

    /**
     * 仓库名称
     */
    private String name;

    /**
     * 仓库地址
     */
    private String address;

    /**
     * 仓储费
     */
    private BigDecimal warehousing;

    /**
     * 搬运费
     */
    private BigDecimal truckage;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 排序
     */
    private String sort;

    /**
     * 描述
     */
    private String remark;

    /**
     * 负责人
     */
    private Long principal;

    /**
     * 租户id
     */
    private Long tenantId;

    /**
     * 删除标记，0未删除，1删除
     */

    private String deleteFlag;

    /**
     * 是否默认
     */
    private Integer isDefault;

    public Long getId() {
        return id;
    }

    public JshDepot setId(Long id) {
        this.id = id;
        return this;
    }
    public String getName() {
        return name;
    }

    public JshDepot setName(String name) {
        this.name = name;
        return this;
    }
    public String getAddress() {
        return address;
    }

    public JshDepot setAddress(String address) {
        this.address = address;
        return this;
    }
    public BigDecimal getWarehousing() {
        return warehousing;
    }

    public JshDepot setWarehousing(BigDecimal warehousing) {
        this.warehousing = warehousing;
        return this;
    }
    public BigDecimal getTruckage() {
        return truckage;
    }

    public JshDepot setTruckage(BigDecimal truckage) {
        this.truckage = truckage;
        return this;
    }
    public Integer getType() {
        return type;
    }

    public JshDepot setType(Integer type) {
        this.type = type;
        return this;
    }
    public String getSort() {
        return sort;
    }

    public JshDepot setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getRemark() {
        return remark;
    }

    public JshDepot setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public Long getPrincipal() {
        return principal;
    }

    public JshDepot setPrincipal(Long principal) {
        this.principal = principal;
        return this;
    }
    public Long getTenantId() {
        return tenantId;
    }

    public JshDepot setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getDeleteFlag() {
        return deleteFlag;
    }

    public JshDepot setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
        return this;
    }
    public Integer getIsDefault() {
        return isDefault;
    }

    public JshDepot setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    @Override
    public String toString() {
        return "JshDepot{" +
            "id=" + id +
            ", name=" + name +
            ", address=" + address +
            ", warehousing=" + warehousing +
            ", truckage=" + truckage +
            ", type=" + type +
            ", sort=" + sort +
            ", remark=" + remark +
            ", principal=" + principal +
            ", tenantId=" + tenantId +
            ", deleteFlag=" + deleteFlag +
            ", isDefault=" + isDefault +
        "}";
    }
}
