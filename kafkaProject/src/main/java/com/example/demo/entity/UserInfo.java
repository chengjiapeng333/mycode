package com.example.demo.entity;

/**
 * Created by chengjiapeng on 2018/5/6.
 */
public class UserInfo {
    private Long id;
    private String brower;
    private String os;
    private String ip;
    private String time;


    public UserInfo() {
        super();
        // TODO Auto-generated constructor stub
    }



    public UserInfo(Long id, String brower, String os, String ip, String time) {
        super();
        this.id = id;
        this.brower = brower;
        this.os = os;
        this.ip = ip;
        this.time = time;
    }



    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }



    public String getBrower() {
        return brower;
    }

    public void setBrower(String brower) {
        this.brower = brower;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
