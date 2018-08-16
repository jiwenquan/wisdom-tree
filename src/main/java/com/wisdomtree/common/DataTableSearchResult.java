package com.wisdomtree.common;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.util.CollectionUtils;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 * datatable返回值专用
 *
 * @author jiwenquan
 * @create 2018/8/13 19:04
 */
public class DataTableSearchResult<T> implements Serializable {
    /**
     * DataTable plugin draw variable
     */
    private int draw;
    /**
     * Total Record Count
     */
    private int recordsTotal;
    /**
     * Filtered Total Record Count
     */
    private int recordsFiltered;
    /**
     * Filtered Per-page Data List
     */
    private List<T> data = new LinkedList<T>();
    /**
     * Error
     */
    private String error;

    /**
     *  Add Data
     * @param data
     */
    public void addData(T... data) {
        if (ArrayUtils.isEmpty(data)) {
            return;
        }
        for (T d : data) {
            this.data.add(d);
        }
    }

    /**
     * Add Data List
     * @param data
     */
    public void addData(List<T> data) {
        if (CollectionUtils.isEmpty(data)) {
            return;
        }
        this.data.addAll(data);
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(int recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public int getRecordsFiltered() {
        return recordsFiltered;
    }

    public void setRecordsFiltered(int recordsFiltered) {
        this.recordsFiltered = recordsFiltered;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}