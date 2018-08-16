package com.wisdomtree.common;

import java.io.Serializable;

/**
 * datatable传参专用
 *
 * @author jiwenquan
 * @create 2018/8/13 19:04
 */
public class DataTableSearchCondition implements Serializable {
    /**
     * DataTables分页查询必须参数：draw
     */
    private int draw;
    /**
     * 开始索引
     */
    private int start;
    /**
     * 分页查询条数
     */
    private int length;
    /**
     * 排序字段
     */
    private String orderColumn;
    /**
     * 排序方向
     */
    private String orderDirection;

    /**
     * 查询关键字
     */
    private String searchCondition;

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getOrderColumn() {
        return orderColumn;
    }

    public void setOrderColumn(String orderColumn) {
        this.orderColumn = orderColumn;
    }

    public String getOrderDirection() {
        return orderDirection;
    }

    public void setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
    }

    public String getSearchCondition() {
        return searchCondition;
    }

    public void setSearchCondition(String searchCondition) {
        this.searchCondition = searchCondition;
    }
}
