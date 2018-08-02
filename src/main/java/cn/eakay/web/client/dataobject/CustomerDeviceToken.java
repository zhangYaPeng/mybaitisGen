package cn.eakay.web.client.dataobject;

import java.util.Date;

public class CustomerDeviceToken {
    /**
     * 对应数据库 customer_device_token.id
     * 
     */
    private Integer id;

    /**
     * 对应数据库 customer_device_token.customer_id
     * 用户id
     */
    private Integer customerId;

    /**
     * 对应数据库 customer_device_token.create_time
     * 添加时间
     */
    private Date createTime;

    /**
     * 对应数据库 customer_device_token.update_time
     * 更新时间
     */
    private Date updateTime;

    /**
     * 对应数据库 customer_device_token.app_client
     * 客户端类型：1:android，2:IOS
     */
    private Byte appClient;

    /**
     * 对应数据库 customer_device_token.app_version
     * 客户端版本
     */
    private String appVersion;

    /**
     * 对应数据库 customer_device_token.device_token
     * 客户端token推送用
     */
    private String deviceToken;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getAppClient() {
        return appClient;
    }

    public void setAppClient(Byte appClient) {
        this.appClient = appClient;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }
}