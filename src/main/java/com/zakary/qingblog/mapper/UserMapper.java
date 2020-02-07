package com.zakary.qingblog.mapper;

import com.zakary.qingblog.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    User selectByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    List<User> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(User record);

    /**
     *@description 用户存在时，查询用户信息
     *@param:  * @param null
     *@return:
     *@Author: Zakary
     *@date: 2020/2/5 13:08
    */
    User selectByUserMail(String userMail);
    /**
     *@description: 查询该用户名的用户记录个数
     *@param:  * @param null
     *@return:
     *@Author: Zakary
     *@date: 2020/2/5 13:10
    */
    int selectCountByUserMail(String userMail);

    int selectAllCount();
}