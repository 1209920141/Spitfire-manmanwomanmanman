package com.neusoft.bsp.dao;

import com.neusoft.bsp.model.offerPrice;

public interface offerPriceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ofp_offer_price
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer ofpId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ofp_offer_price
     *
     * @mbg.generated
     */
    int insert(offerPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ofp_offer_price
     *
     * @mbg.generated
     */
    int insertSelective(offerPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ofp_offer_price
     *
     * @mbg.generated
     */
    offerPrice selectByPrimaryKey(Integer ofpId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ofp_offer_price
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(offerPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ofp_offer_price
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(offerPrice record);
}