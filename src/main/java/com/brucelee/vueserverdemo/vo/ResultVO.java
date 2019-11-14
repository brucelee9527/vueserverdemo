package com.brucelee.vueserverdemo.vo;

public class ResultVO {
    /**
     * 响应码
     */
    private Integer code;

    public ResultVO(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
