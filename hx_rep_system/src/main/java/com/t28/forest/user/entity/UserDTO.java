package com.t28.forest.user.entity;

/**
 * @author XiangYuFeng
 * @description 用户表数据传输对象
 * @create 2019/10/14
 * @since 1.0.0
 */
public class UserDTO {
    /**
     * 主键，用户ID
     */
    private Integer id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 用户登录名称
     */
    private String loginName;
    /**
     * 用户登录密码
     */
    private String password;
    /**
     * 用户职位
     */
    private String position;
    /**
     * 所属部门
     */
    private String department;
    /**
     * 电子邮箱
     */
    private String email;
    /**
     * 手机号码
     */
    private String phoneNum;
    /**
     * 是否为管理者 0==管理者 1==员工
     */
    private Integer isManager;
    /**
     * 是否系统自带数据
     */
    private Integer isystem;
    /**
     * 状态，0：正常，1：删除，2封禁
     */
    private Integer status;
    /**
     * 用户描述信息
     */
    private String description;
    /**
     * 备注
     */
    private String remark;
    /**
     * 租户id
     */
    private Integer tenantId;

    public UserDTO() {}

    public UserDTO(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Integer getIsManager() {
        return isManager;
    }

    public void setIsManager(Integer isManager) {
        this.isManager = isManager;
    }

    public Integer getIsystem() {
        return isystem;
    }

    public void setIsystem(Integer isystem) {
        this.isystem = isystem;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", position='" + position + '\'' +
                ", department='" + department + '\'' +
                ", email='" + email + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", isManager=" + isManager +
                ", isystem=" + isystem +
                ", status=" + status +
                ", description='" + description + '\'' +
                ", remark='" + remark + '\'' +
                ", tenantId=" + tenantId +
                '}';
    }
}