package com.neusoft.bsp.model;

import java.util.Date;

public class andorra {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_andorra.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_andorra.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_andorra.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_andorra.type
     *
     * @mbg.generated
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_andorra.adurl
     *
     * @mbg.generated
     */
    private String adurl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_andorra.publisher
     *
     * @mbg.generated
     */
    private String publisher;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_andorra.addtime
     *
     * @mbg.generated
     */
    private Date addtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_andorra.uptime
     *
     * @mbg.generated
     */
    private Date uptime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_andorra.starttime
     *
     * @mbg.generated
     */
    private String starttime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_andorra.endtime
     *
     * @mbg.generated
     */
    private String endtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_andorra.status
     *
     * @mbg.generated
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_andorra.tourl
     *
     * @mbg.generated
     */
    private String tourl;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_andorra
     *
     * @mbg.generated
     */
    public andorra(Long id, String title, String content, String type, String adurl, String publisher, Date addtime, Date uptime, String starttime, String endtime, String status, String tourl) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.type = type;
        this.adurl = adurl;
        this.publisher = publisher;
        this.addtime = addtime;
        this.uptime = uptime;
        this.starttime = starttime;
        this.endtime = endtime;
        this.status = status;
        this.tourl = tourl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_andorra
     *
     * @mbg.generated
     */
    public andorra() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_andorra.id
     *
     * @return the value of sys_andorra.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_andorra.id
     *
     * @param id the value for sys_andorra.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_andorra.title
     *
     * @return the value of sys_andorra.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_andorra.title
     *
     * @param title the value for sys_andorra.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_andorra.content
     *
     * @return the value of sys_andorra.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_andorra.content
     *
     * @param content the value for sys_andorra.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_andorra.type
     *
     * @return the value of sys_andorra.type
     *
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_andorra.type
     *
     * @param type the value for sys_andorra.type
     *
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_andorra.adurl
     *
     * @return the value of sys_andorra.adurl
     *
     * @mbg.generated
     */
    public String getAdurl() {
        return adurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_andorra.adurl
     *
     * @param adurl the value for sys_andorra.adurl
     *
     * @mbg.generated
     */
    public void setAdurl(String adurl) {
        this.adurl = adurl == null ? null : adurl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_andorra.publisher
     *
     * @return the value of sys_andorra.publisher
     *
     * @mbg.generated
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_andorra.publisher
     *
     * @param publisher the value for sys_andorra.publisher
     *
     * @mbg.generated
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_andorra.addtime
     *
     * @return the value of sys_andorra.addtime
     *
     * @mbg.generated
     */
    public Date getAddtime() {
        return addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_andorra.addtime
     *
     * @param addtime the value for sys_andorra.addtime
     *
     * @mbg.generated
     */
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_andorra.uptime
     *
     * @return the value of sys_andorra.uptime
     *
     * @mbg.generated
     */
    public Date getUptime() {
        return uptime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_andorra.uptime
     *
     * @param uptime the value for sys_andorra.uptime
     *
     * @mbg.generated
     */
    public void setUptime(Date uptime) {
        this.uptime = uptime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_andorra.starttime
     *
     * @return the value of sys_andorra.starttime
     *
     * @mbg.generated
     */
    public String getStarttime() {
        return starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_andorra.starttime
     *
     * @param starttime the value for sys_andorra.starttime
     *
     * @mbg.generated
     */
    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_andorra.endtime
     *
     * @return the value of sys_andorra.endtime
     *
     * @mbg.generated
     */
    public String getEndtime() {
        return endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_andorra.endtime
     *
     * @param endtime the value for sys_andorra.endtime
     *
     * @mbg.generated
     */
    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_andorra.status
     *
     * @return the value of sys_andorra.status
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_andorra.status
     *
     * @param status the value for sys_andorra.status
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_andorra.tourl
     *
     * @return the value of sys_andorra.tourl
     *
     * @mbg.generated
     */
    public String getTourl() {
        return tourl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_andorra.tourl
     *
     * @param tourl the value for sys_andorra.tourl
     *
     * @mbg.generated
     */
    public void setTourl(String tourl) {
        this.tourl = tourl == null ? null : tourl.trim();
    }
}