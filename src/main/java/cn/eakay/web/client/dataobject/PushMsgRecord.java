package cn.eakay.web.client.dataobject;

import java.util.Date;

public class PushMsgRecord {
    /**
     * 对应数据库 push_msg_record.id
     * 
     */
    private Integer id;

    /**
     * 对应数据库 push_msg_record.customerId
     * 用户ID
     */
    private Integer customerid;

    /**
     * 对应数据库 push_msg_record.appClient
     * 用户客户端类型1、android 2、ios
     */
    private String appclient;

    /**
     * 对应数据库 push_msg_record.deviceToken
     * 用户设备嘛
     */
    private String devicetoken;

    /**
     * 对应数据库 push_msg_record.pushId
     * push_msg 对应的ID
     */
    private Integer pushid;

    /**
     * 对应数据库 push_msg_record.msgType
     * 内容类型1、文本
     */
    private Integer msgtype;

    /**
     * 对应数据库 push_msg_record.title
     * 标题
     */
    private String title;

    /**
     * 对应数据库 push_msg_record.message
     * 推送内容
     */
    private String message;

    /**
     * 对应数据库 push_msg_record.pushTime
     * 推送时间
     */
    private Date pushtime;

    /**
     * 对应数据库 push_msg_record.pushStatus
     * 推送状态 0、未推送 1、推送成功 2、推送失败
     */
    private Integer pushstatus;

    /**
     * 对应数据库 push_msg_record.isRead
     * 是否已读 0、未读 1、已读
     */
    private Boolean isread;

    /**
     * 对应数据库 push_msg_record.status
     * 消息状态 1、正常 2、删除
     */
    private Boolean status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getAppclient() {
        return appclient;
    }

    public void setAppclient(String appclient) {
        this.appclient = appclient;
    }

    public String getDevicetoken() {
        return devicetoken;
    }

    public void setDevicetoken(String devicetoken) {
        this.devicetoken = devicetoken;
    }

    public Integer getPushid() {
        return pushid;
    }

    public void setPushid(Integer pushid) {
        this.pushid = pushid;
    }

    public Integer getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(Integer msgtype) {
        this.msgtype = msgtype;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getPushtime() {
        return pushtime;
    }

    public void setPushtime(Date pushtime) {
        this.pushtime = pushtime;
    }

    public Integer getPushstatus() {
        return pushstatus;
    }

    public void setPushstatus(Integer pushstatus) {
        this.pushstatus = pushstatus;
    }

    public Boolean getIsread() {
        return isread;
    }

    public void setIsread(Boolean isread) {
        this.isread = isread;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}