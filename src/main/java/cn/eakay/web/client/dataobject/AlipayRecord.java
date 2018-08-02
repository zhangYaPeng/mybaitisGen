package cn.eakay.web.client.dataobject;

import java.math.BigDecimal;
import java.util.Date;

public class AlipayRecord {
    /**
     * 对应数据库 alipay_record.id
     * 
     */
    private Integer id;

    /**
     * 对应数据库 alipay_record.customerId
     * 
     */
    private Integer customerid;

    /**
     * 对应数据库 alipay_record.payFee
     * 
     */
    private BigDecimal payfee;

    /**
     * 对应数据库 alipay_record.createTime
     * 
     */
    private Date createtime;

    /**
     * 对应数据库 alipay_record.appClient
     * 
     */
    private String appclient;

    /**
     * 对应数据库 alipay_record.appVersion
     * 
     */
    private String appversion;

    /**
     * 对应数据库 alipay_record.subject
     * 
     */
    private String subject;

    /**
     * 对应数据库 alipay_record.code
     * 
     */
    private String code;

    /**
     * 对应数据库 alipay_record.codeDesc
     * 
     */
    private String codedesc;

    /**
     * 对应数据库 alipay_record.number
     * 
     */
    private Integer number;

    /**
     * 对应数据库 alipay_record.merchantId
     * 
     */
    private Integer merchantid;

    /**
     * 对应数据库 alipay_record.orderId
     * 订单Id
     */
    private Long orderid;

    /**
     * 对应数据库 alipay_record.tradeNo
     * 
     */
    private String tradeno;

    /**
     * 对应数据库 alipay_record.sellerEmail
     * 收款账户号
     */
    private String selleremail;

    /**
     * 对应数据库 alipay_record.buyerEmail
     * 支付账户号
     */
    private String buyeremail;

    /**
     * 对应数据库 alipay_record.payment
     * 支付方式
     */
    private String payment;

    /**
     * 对应数据库 alipay_record.subCode
     * 子状态
     */
    private String subcode;

    /**
     * 对应数据库 alipay_record.idSuffix
     * 
     */
    private String idsuffix;

    /**
     * 对应数据库 alipay_record.storageId
     * activity_storage_money表id
     */
    private Integer storageid;

    /**
     * 对应数据库 alipay_record.payTime
     * 支付时间
     */
    private Date paytime;

    /**
     * 对应数据库 alipay_record.updateTime
     * 更新时间
     */
    private Date updatetime;

    /**
     * 对应数据库 alipay_record.origQryId
     * 银联交易流水号
     */
    private String origqryid;

    /**
     * 对应数据库 alipay_record.paymentType
     * 支付类型优化添加字段1,支付宝2，微信3,未知
     */
    private Integer paymenttype;

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

    public BigDecimal getPayfee() {
        return payfee;
    }

    public void setPayfee(BigDecimal payfee) {
        this.payfee = payfee;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getAppclient() {
        return appclient;
    }

    public void setAppclient(String appclient) {
        this.appclient = appclient;
    }

    public String getAppversion() {
        return appversion;
    }

    public void setAppversion(String appversion) {
        this.appversion = appversion;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodedesc() {
        return codedesc;
    }

    public void setCodedesc(String codedesc) {
        this.codedesc = codedesc;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(Integer merchantid) {
        this.merchantid = merchantid;
    }

    public Long getOrderid() {
        return orderid;
    }

    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }

    public String getTradeno() {
        return tradeno;
    }

    public void setTradeno(String tradeno) {
        this.tradeno = tradeno;
    }

    public String getSelleremail() {
        return selleremail;
    }

    public void setSelleremail(String selleremail) {
        this.selleremail = selleremail;
    }

    public String getBuyeremail() {
        return buyeremail;
    }

    public void setBuyeremail(String buyeremail) {
        this.buyeremail = buyeremail;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getSubcode() {
        return subcode;
    }

    public void setSubcode(String subcode) {
        this.subcode = subcode;
    }

    public String getIdsuffix() {
        return idsuffix;
    }

    public void setIdsuffix(String idsuffix) {
        this.idsuffix = idsuffix;
    }

    public Integer getStorageid() {
        return storageid;
    }

    public void setStorageid(Integer storageid) {
        this.storageid = storageid;
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getOrigqryid() {
        return origqryid;
    }

    public void setOrigqryid(String origqryid) {
        this.origqryid = origqryid;
    }

    public Integer getPaymenttype() {
        return paymenttype;
    }

    public void setPaymenttype(Integer paymenttype) {
        this.paymenttype = paymenttype;
    }
}