package com.t28.forest.warehouse.entity;


import java.io.Serializable;

/**
 * <p>
 * 经手人表
 * </p>
 *
 * @author lcy
 * @since 2019-10-21
 */

public class PersonDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */

    private Long Id;

    /**
     * 类型
     */

    private String Type;

    /**
     * 姓名
     */

    private String Name;

    /**
     * 租户id
     */
    private Long tenantId;

    /**
     * 删除标记，0未删除，1删除
     */

    private String deleteFlag;

    public Long getId() {
        return Id;
    }

    public PersonDTO setId(Long Id) {
        this.Id = Id;
        return this;
    }
    public String getType() {
        return Type;
    }

    public PersonDTO setType(String Type) {
        this.Type = Type;
        return this;
    }
    public String getName() {
        return Name;
    }

    public PersonDTO setName(String Name) {
        this.Name = Name;
        return this;
    }
    public Long getTenantId() {
        return tenantId;
    }

    public PersonDTO setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getDeleteFlag() {
        return deleteFlag;
    }

    public PersonDTO setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
        return this;
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
            "Id=" + Id +
            ", Type=" + Type +
            ", Name=" + Name +
            ", tenantId=" + tenantId +
            ", deleteFlag=" + deleteFlag +
        "}";
    }
}
