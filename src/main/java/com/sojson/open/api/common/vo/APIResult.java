package com.sojson.open.api.common.vo;


import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;


/**
 *
 * <p>
 *
 *  测试 · 返回对象
 *
 * <p>
 *
 * 区分　责任人　日期　　　　<br/>
 * 创建　周柏成　2017年9月8日  　<br/>
 *
 * @author zhou-baicheng
 * @version 1.0 <br/>
 * @time 00:06:52 <br/>
 *
 */
public class APIResult<T> implements Serializable {
    //状态
    private Integer status;
    //描述
    private String message;

    //如果是null 不返回
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private T data;

    public APIResult() {
    }

    public APIResult(Integer status, String message) {
        this.status = status;
        this.message = message;
    }
    /*** getter / setter***/
    public Integer getStatus() {
        return status;
    }

    public APIResult<T> setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public APIResult<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public T getData() {
        return data;
    }

    public APIResult<T> setData(T data) {
        this.data = data;
        return this;
    }
}
