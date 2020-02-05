package com.zakary.qingblog.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Date;

@Repository
public class User implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_name
     *
     * @mbg.generated
     */
    private String userName;

    /**
     *
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_password
     *
     * @mbg.generated
     */
    private String userPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_tel
     *
     * @mbg.generated
     */
    private String userTel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_mail
     *
     * @mbg.generated
     */
    private String userMail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_register_date
     *
     * @mbg.generated
     */
    private Date userRegisterDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_image
     *
     * @mbg.generated
     */
    private String userImage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_state
     *
     * @mbg.generated
     */
    private String userState;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_id
     *
     * @return the value of user.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_id
     *
     * @param userId the value for user.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_name
     *
     * @return the value of user.user_name
     *
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_name
     *
     * @param userName the value for user.user_name
     *
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_password
     *
     * @return the value of user.user_password
     *
     * @mbg.generated
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_password
     *
     * @param userPassword the value for user.user_password
     *
     * @mbg.generated
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_tel
     *
     * @return the value of user.user_tel
     *
     * @mbg.generated
     */
    public String getUserTel() {
        return userTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_tel
     *
     * @param userTel the value for user.user_tel
     *
     * @mbg.generated
     */
    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_mail
     *
     * @return the value of user.user_mail
     *
     * @mbg.generated
     */
    public String getUserMail() {
        return userMail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_mail
     *
     * @param userMail the value for user.user_mail
     *
     * @mbg.generated
     */
    public void setUserMail(String userMail) {
        this.userMail = userMail == null ? null : userMail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_register_date
     *
     * @return the value of user.user_register_date
     *
     * @mbg.generated
     */
    public Date getUserRegisterDate() {
        return userRegisterDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_register_date
     *
     * @param userRegisterDate the value for user.user_register_date
     *
     * @mbg.generated
     */
    public void setUserRegisterDate(Date userRegisterDate) {
        this.userRegisterDate = userRegisterDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_image
     *
     * @return the value of user.user_image
     *
     * @mbg.generated
     */
    public String getUserImage() {
        return userImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_image
     *
     * @param userImage the value for user.user_image
     *
     * @mbg.generated
     */
    public void setUserImage(String userImage) {
        this.userImage = userImage == null ? null : userImage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_state
     *
     * @return the value of user.user_state
     *
     * @mbg.generated
     */
    public String getUserState() {
        return userState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_state
     *
     * @param userState the value for user.user_state
     *
     * @mbg.generated
     */
    public void setUserState(String userState) {
        this.userState = userState == null ? null : userState.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", userPassword=").append(userPassword);
        sb.append(", userTel=").append(userTel);
        sb.append(", userMail=").append(userMail);
        sb.append(", userRegisterDate=").append(userRegisterDate);
        sb.append(", userImage=").append(userImage);
        sb.append(", userState=").append(userState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}