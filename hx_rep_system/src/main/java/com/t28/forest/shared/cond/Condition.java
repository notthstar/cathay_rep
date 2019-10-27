package com.t28.forest.shared.cond;

import java.util.Date;
import java.util.Objects;

/**
 * @author XiangYuFeng
 * @description 公共的查询条件信息
 * @create 2019/10/22
 * @since 1.0.0
 */
public class Condition {
    /**
     * 编号
     */
    private String code;
    /**
     * 名称
     */
    private String name;
    /**
     * 开始日期
     */
    private Date beginDate;
    /**
     * 结束日期
     */
    private Date endDate;

    public Condition() {}

    public Condition(String code, String name, Date beginDate, Date endDate) {
        setCode(code);
        setName(name);
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        if (Objects.equals("", code.trim())) {
            this.code = null;
            return;
        }
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (Objects.equals("", name.trim())) {
            this.name = null;
            return;
        }
        this.name = name;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}