package com.scu.hd.entity;

public class AppResponse {
    private int code;
    private String status;
    private String info;

    public AppResponse() {
        this.code = 1;
        this.status = "success";
        this.info = "成功";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "AppResponse{" +
                "code=" + code +
                ", status='" + status + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
