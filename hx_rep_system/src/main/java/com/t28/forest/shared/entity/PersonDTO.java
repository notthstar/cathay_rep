package com.t28.forest.shared.entity;

/**
 * @author XiangYuFeng
 * @description 经手人表数据传输对象
 * @create 2019/10/14
 * @since 1.0.0
 */
public class PersonDTO {
    /**
     * 主键
     */
    private Integer id;
    /**
     * 类型
     */
    private String type;
    /**
     * 姓名
     */
    private String name;
    /**
     * 租户id
     */
    private Integer tenantId;
    /**
     * 删除标记，0未删除，1删除
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "PersonDTO{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", tenantId=" + tenantId +
                ", deleteFlag='" + deleteFlag + '\'' +
                '}';
    }
}
