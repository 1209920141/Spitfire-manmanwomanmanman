package com.neusoft.bsp.model;

import java.util.Date;

public class image {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column img_image.IMG_ID
     *
     * @mbg.generated
     */
    private Integer imgId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column img_image.NAME
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column img_image.WIDTH
     *
     * @mbg.generated
     */
    private Integer width;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column img_image.HEIGHT
     *
     * @mbg.generated
     */
    private Integer height;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column img_image.URI
     *
     * @mbg.generated
     */
    private String uri;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column img_image.TYPE_CD
     *
     * @mbg.generated
     */
    private String typeCd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column img_image.ENTITY_ID
     *
     * @mbg.generated
     */
    private Integer entityId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column img_image.ENTITY_CD
     *
     * @mbg.generated
     */
    private String entityCd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column img_image.SEQ_NO
     *
     * @mbg.generated
     */
    private Integer seqNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column img_image.CREATED_BY
     *
     * @mbg.generated
     */
    private String createdBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column img_image.CREATION_DATE
     *
     * @mbg.generated
     */
    private Date creationDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column img_image.LAST_UPDATE_BY
     *
     * @mbg.generated
     */
    private String lastUpdateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column img_image.LAST_UPDATE_DATE
     *
     * @mbg.generated
     */
    private Date lastUpdateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column img_image.CALL_CNT
     *
     * @mbg.generated
     */
    private Integer callCnt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column img_image.REMARK
     *
     * @mbg.generated
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column img_image.STS_CD
     *
     * @mbg.generated
     */
    private String stsCd;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table img_image
     *
     * @mbg.generated
     */
    public image(Integer imgId, String name, Integer width, Integer height, String uri, String typeCd, Integer entityId, String entityCd, Integer seqNo, String createdBy, Date creationDate, String lastUpdateBy, Date lastUpdateDate, Integer callCnt, String remark, String stsCd) {
        this.imgId = imgId;
        this.name = name;
        this.width = width;
        this.height = height;
        this.uri = uri;
        this.typeCd = typeCd;
        this.entityId = entityId;
        this.entityCd = entityCd;
        this.seqNo = seqNo;
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
     * This method corresponds to the database table img_image
     *
     * @mbg.generated
     */
    public image() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column img_image.IMG_ID
     *
     * @return the value of img_image.IMG_ID
     *
     * @mbg.generated
     */
    public Integer getImgId() {
        return imgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column img_image.IMG_ID
     *
     * @param imgId the value for img_image.IMG_ID
     *
     * @mbg.generated
     */
    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column img_image.NAME
     *
     * @return the value of img_image.NAME
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column img_image.NAME
     *
     * @param name the value for img_image.NAME
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column img_image.WIDTH
     *
     * @return the value of img_image.WIDTH
     *
     * @mbg.generated
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column img_image.WIDTH
     *
     * @param width the value for img_image.WIDTH
     *
     * @mbg.generated
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column img_image.HEIGHT
     *
     * @return the value of img_image.HEIGHT
     *
     * @mbg.generated
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column img_image.HEIGHT
     *
     * @param height the value for img_image.HEIGHT
     *
     * @mbg.generated
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column img_image.URI
     *
     * @return the value of img_image.URI
     *
     * @mbg.generated
     */
    public String getUri() {
        return uri;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column img_image.URI
     *
     * @param uri the value for img_image.URI
     *
     * @mbg.generated
     */
    public void setUri(String uri) {
        this.uri = uri == null ? null : uri.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column img_image.TYPE_CD
     *
     * @return the value of img_image.TYPE_CD
     *
     * @mbg.generated
     */
    public String getTypeCd() {
        return typeCd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column img_image.TYPE_CD
     *
     * @param typeCd the value for img_image.TYPE_CD
     *
     * @mbg.generated
     */
    public void setTypeCd(String typeCd) {
        this.typeCd = typeCd == null ? null : typeCd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column img_image.ENTITY_ID
     *
     * @return the value of img_image.ENTITY_ID
     *
     * @mbg.generated
     */
    public Integer getEntityId() {
        return entityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column img_image.ENTITY_ID
     *
     * @param entityId the value for img_image.ENTITY_ID
     *
     * @mbg.generated
     */
    public void setEntityId(Integer entityId) {
        this.entityId = entityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column img_image.ENTITY_CD
     *
     * @return the value of img_image.ENTITY_CD
     *
     * @mbg.generated
     */
    public String getEntityCd() {
        return entityCd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column img_image.ENTITY_CD
     *
     * @param entityCd the value for img_image.ENTITY_CD
     *
     * @mbg.generated
     */
    public void setEntityCd(String entityCd) {
        this.entityCd = entityCd == null ? null : entityCd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column img_image.SEQ_NO
     *
     * @return the value of img_image.SEQ_NO
     *
     * @mbg.generated
     */
    public Integer getSeqNo() {
        return seqNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column img_image.SEQ_NO
     *
     * @param seqNo the value for img_image.SEQ_NO
     *
     * @mbg.generated
     */
    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column img_image.CREATED_BY
     *
     * @return the value of img_image.CREATED_BY
     *
     * @mbg.generated
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column img_image.CREATED_BY
     *
     * @param createdBy the value for img_image.CREATED_BY
     *
     * @mbg.generated
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column img_image.CREATION_DATE
     *
     * @return the value of img_image.CREATION_DATE
     *
     * @mbg.generated
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column img_image.CREATION_DATE
     *
     * @param creationDate the value for img_image.CREATION_DATE
     *
     * @mbg.generated
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column img_image.LAST_UPDATE_BY
     *
     * @return the value of img_image.LAST_UPDATE_BY
     *
     * @mbg.generated
     */
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column img_image.LAST_UPDATE_BY
     *
     * @param lastUpdateBy the value for img_image.LAST_UPDATE_BY
     *
     * @mbg.generated
     */
    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy == null ? null : lastUpdateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column img_image.LAST_UPDATE_DATE
     *
     * @return the value of img_image.LAST_UPDATE_DATE
     *
     * @mbg.generated
     */
    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column img_image.LAST_UPDATE_DATE
     *
     * @param lastUpdateDate the value for img_image.LAST_UPDATE_DATE
     *
     * @mbg.generated
     */
    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column img_image.CALL_CNT
     *
     * @return the value of img_image.CALL_CNT
     *
     * @mbg.generated
     */
    public Integer getCallCnt() {
        return callCnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column img_image.CALL_CNT
     *
     * @param callCnt the value for img_image.CALL_CNT
     *
     * @mbg.generated
     */
    public void setCallCnt(Integer callCnt) {
        this.callCnt = callCnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column img_image.REMARK
     *
     * @return the value of img_image.REMARK
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column img_image.REMARK
     *
     * @param remark the value for img_image.REMARK
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column img_image.STS_CD
     *
     * @return the value of img_image.STS_CD
     *
     * @mbg.generated
     */
    public String getStsCd() {
        return stsCd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column img_image.STS_CD
     *
     * @param stsCd the value for img_image.STS_CD
     *
     * @mbg.generated
     */
    public void setStsCd(String stsCd) {
        this.stsCd = stsCd == null ? null : stsCd.trim();
    }
}