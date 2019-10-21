package com.t28.forest.shared.entity;

import java.math.BigDecimal;

/**
 * @author XiangYuFeng
 * @description 仓库信息主表数据传输对象
 * @create 2019/10/14
 * @since 1.0.0
 */
public class DepotDTO {
    /**
     * 主键
     */
    private Integer id;
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
    private Double warehousing;
    /**
     * 搬运费
     */
    private Double truckAge;
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
    private Integer principal;
    /**
     * 租户id
     */
    private Integer tenantId;
    /**
     * 删除标记，0未删除，1删除
     */
    private String deleteFlag;
    /**
     * 是否默认
     */
    private Integer isDefault;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getWarehousing() {
        return warehousing;
    }

    public void setWarehousing(Double warehousing) {
        this.warehousing = warehousing;
    }

    public Double getTruckAge() {
        return truckAge;
    }

    public void setTruckAge(Double truckAge) {
        this.truckAge = truckAge;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getPrincipal() {
        return principal;
    }

    public void setPrincipal(Integer principal) {
        this.principal = principal;
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

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public String toString() {
        return "DepotDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", warehousing=" + warehousing +
                ", truckAge=" + truckAge +
                ", type=" + type +
                ", sort='" + sort + '\'' +
                ", remark='" + remark + '\'' +
                ", principal=" + principal +
                ", tenantId=" + tenantId +
                ", deleteFlag='" + deleteFlag + '\'' +
                ", isDefault=" + isDefault +
                '}';
    }
}
