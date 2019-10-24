package com.t28.forest.sales.vo;

/**
 * @author XiangYuFeng
 * @description 分页信息页面显示对象
 * @create 2019/10/21
 * @since 1.0.0
 */
public class PageVO {
    /**
     * 当前页
     */
    private Integer current;
    /**
     * 每页显示的数据条数
     */
    private Integer pageSize;
    /**
     * 总页数
     */
    private Integer total;

    public PageVO() {}

    public PageVO(Integer current, Integer pageSize) {
        setCurrent(current);
        this.pageSize = pageSize;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * 页面模板属性的获取是通过get方法确定的
     * 页面显示当前页的方法
     */
    public Integer getCurrentPage() {
        return current;
    }

    public Integer getCurrent() {
        return (current-1) * pageSize;
    }

    public void setCurrent(Integer current) {
        if (current < 1) {
            this.current = 1;
            return;
        }
        this.current = current;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

}