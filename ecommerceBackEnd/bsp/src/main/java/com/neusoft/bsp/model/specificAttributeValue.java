package com.neusoft.bsp.model;

import java.util.Date;

public class specificAttributeValue {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spv_specific_attribute_value.SPV_ID
     *
     * @mbg.generated
     */
    private Integer spvId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spv_specific_attribute_value.SPA_ID
     *
     * @mbg.generated
     */
    private Integer spaId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spv_specific_attribute_value.NAME_EN
     *
     * @mbg.generated
     */
    private String nameEn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spv_specific_attribute_value.NAME_CN
     *
     * @mbg.generated
     */
    private String nameCn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spv_specific_attribute_value.CREATED_BY
     *
     * @mbg.generated
     */
    private String createdBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spv_specific_attribute_value.CREATION_DATE
     *
     * @mbg.generated
     */
    private Date creationDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spv_specific_attribute_value.LAST_UPDATE_BY
     *
     * @mbg.generated
     */
    private String lastUpdateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spv_specific_attribute_value.LAST_UPDATE_DATE
     *
     * @mbg.generated
     */
    private Date lastUpdateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spv_specific_attribute_value.CALL_CNT
     *
     * @mbg.generated
     */
    private Integer callCnt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spv_specific_attribute_value.REMARK
     *
     * @mbg.generated
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spv_specific_attribute_value.STS_CD
     *
     * @mbg.generated
     */
    private String stsCd;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spv_specific_attribute_value
     *
     * @mbg.generated
     */
    public specificAttributeValue(Integer spvId, Integer spaId, String nameEn, String nameCn, String createdBy, Date creationDate, String lastUpdateBy, Date lastUpdateDate, Integer callCnt, String remark, String stsCd) {
        this.spvId = spvId;
        this.spaId = spaId;
        this.nameEn = nameEn;
        this.nameCn = nameCn;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.lastUpdateBy = lastUpdateBy;
        this.lastUpdateDate = lastUpdateDate;
        this.callCnt = callCnt;
        this.remark = remark;
        this.stsCd = stsCd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spv_specific_attribute_value
     *
     * @mbg.generated
     */
    public specificAttributeValue() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spv_specific_attribute_value.SPV_ID
     *
     * @return the value of spv_specific_attribute_value.SPV_ID
     *
     * @mbg.generated
     */
    public Integer getSpvId() {
        return spvId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spv_specific_attribute_value.SPV_ID
     *
     * @param spvId the value for spv_specific_attribute_value.SPV_ID
     *
     * @mbg.generated
     */
    public void setSpvId(Integer spvId) {
        this.spvId = spvId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spv_specific_attribute_value.SPA_ID
     *
     * @return the value of spv_specific_attribute_value.SPA_ID
     *
     * @mbg.generated
     */
    public Integer getSpaId() {
        return spaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spv_specific_attribute_value.SPA_ID
     *
     * @param spaId the value for spv_specific_attribute_value.SPA_ID
     *
     * @mbg.generated
     */
    public void setSpaId(Integer spaId) {
        this.spaId = spaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spv_specific_attribute_value.NAME_EN
     *
     * @return the value of spv_specific_attribute_value.NAME_EN
     *
     * @mbg.generated
     */
    public String getNameEn() {
        return nameEn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spv_specific_attribute_value.NAME_EN
     *
     * @param nameEn the value for spv_specific_attribute_value.NAME_EN
     *
     * @mbg.generated
     */
    public void setNameEn(String nameEn) {
        this.nameEn = nameEn == null ? null : nameEn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spv_specific_attribute_value.NAME_CN
     *
     * @return the value of spv_specific_attribute_value.NAME_CN
     *
     * @mbg.generated
     */
    public String getNameCn() {
        return nameCn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spv_specific_attribute_value.NAME_CN
     *
     * @param nameCn the value for spv_specific_attribute_value.NAME_CN
     *
     * @mbg.generated
     */
    public void setNameCn(String nameCn) {
        this.nameCn = nameCn == null ? null : nameCn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spv_specific_attribute_value.CREATED_BY
     *
     * @return the value of spv_specific_attribute_value.CREATED_BY
     *
     * @mbg.generated
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spv_specific_attribute_value.CREATED_BY
     *
     * @param createdBy the value for spv_specific_attribute_value.CREATED_BY
     *
     * @mbg.generated
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spv_specific_attribute_value.CREATION_DATE
     *
     * @return the value of spv_specific_attribute_value.CREATION_DATE
     *
     * @mbg.generated
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spv_specific_attribute_value.CREATION_DATE
     *
     * @param creationDate the value for spv_specific_attribute_value.CREATION_DATE
     *
     * @mbg.generated
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spv_specific_attribute_value.LAST_UPDATE_BY
     *
     * @return the value of spv_specific_attribute_value.LAST_UPDATE_BY
     *
     * @mbg.generated
     */
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spv_specific_attribute_value.LAST_UPDATE_BY
     *
     * @param lastUpdateBy the value for spv_specific_attribute_value.LAST_UPDATE_BY
     *
     * @mbg.generated
     */
    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy == null ? null : lastUpdateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spv_specific_attribute_value.LAST_UPDATE_DATE
     *
     * @return the value of spv_specific_attribute_value.LAST_UPDATE_DATE
     *
     * @mbg.generated
     */
    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spv_specific_attribute_value.LAST_UPDATE_DATE
     *
     * @param lastUpdateDate the value for spv_specific_attribute_value.LAST_UPDATE_DATE
     *
     * @mbg.generated
     */
    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spv_specific_attribute_value.CALL_CNT
     *
     * @return the value of spv_specific_attribute_value.CALL_CNT
     *
     * @mbg.generated
     */
    public Integer getCallCnt() {
        return callCnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spv_specific_attribute_value.CALL_CNT
     *
     * @param callCnt the value for spv_specific_attribute_value.CALL_CNT
     *
     * @mbg.generated
     */
    public void setCallCnt(Integer callCnt) {
        this.callCnt = callCnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spv_specific_attribute_value.REMARK
     *
     * @return the value of spv_specific_attribute_value.REMARK
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spv_specific_attribute_value.REMARK
     *
     * @param remark the value for spv_specific_attribute_value.REMARK
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spv_specific_attribute_value.STS_CD
     *
     * @return the value of spv_specific_attribute_value.STS_CD
     *
     * @mbg.generated
     */
    public String getStsCd() {
        return stsCd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spv_specific_attribute_value.STS_CD
     *
     * @param stsCd the value for spv_specific_attribute_value.STS_CD
     *
     * @mbg.generated
     */
    public void setStsCd(String stsCd) {
        this.stsCd = stsCd == null ? null : stsCd.trim();
    }
}