package test.dao;

import test.bean.Test;

public interface TestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated Wed Jul 12 10:10:28 CST 2017
     */
    int deleteByPrimaryKey(Integer uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated Wed Jul 12 10:10:28 CST 2017
     */
    int insert(Test record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated Wed Jul 12 10:10:28 CST 2017
     */
    int insertSelective(Test record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated Wed Jul 12 10:10:28 CST 2017
     */
    Test selectByPrimaryKey(Integer uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated Wed Jul 12 10:10:28 CST 2017
     */
    int updateByPrimaryKeySelective(Test record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated Wed Jul 12 10:10:28 CST 2017
     */
    int updateByPrimaryKey(Test record);
}