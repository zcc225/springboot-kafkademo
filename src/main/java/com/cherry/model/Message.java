package com.cherry.model;

import java.time.LocalDateTime;

/**
 * Created by Administrator on 2017/7/26 0026.
 */
public class Message {

    private Long id;

    private String msg;

    private LocalDateTime sendTime;

    public Message() {
    }

    public Long getId() {
        return id;
    }

    public String getMsg() {
        return msg;
    }

    public LocalDateTime getSendTime() {
        return sendTime;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setSendTime(LocalDateTime sendTime) {
        this.sendTime = sendTime;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", sendTime=" + sendTime +
                '}';
    }
}


