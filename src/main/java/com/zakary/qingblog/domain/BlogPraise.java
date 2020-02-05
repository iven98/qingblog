package com.zakary.qingblog.domain;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public class BlogPraise implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_praise.blog_praise_id
     *
     * @mbg.generated
     */
    private Integer blogPraiseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_praise.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_praise.blog_id
     *
     * @mbg.generated
     */
    private Integer blogId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table blog_praise
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_praise.blog_praise_id
     *
     * @return the value of blog_praise.blog_praise_id
     *
     * @mbg.generated
     */
    public Integer getBlogPraiseId() {
        return blogPraiseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_praise.blog_praise_id
     *
     * @param blogPraiseId the value for blog_praise.blog_praise_id
     *
     * @mbg.generated
     */
    public void setBlogPraiseId(Integer blogPraiseId) {
        this.blogPraiseId = blogPraiseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_praise.user_id
     *
     * @return the value of blog_praise.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_praise.user_id
     *
     * @param userId the value for blog_praise.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_praise.blog_id
     *
     * @return the value of blog_praise.blog_id
     *
     * @mbg.generated
     */
    public Integer getBlogId() {
        return blogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_praise.blog_id
     *
     * @param blogId the value for blog_praise.blog_id
     *
     * @mbg.generated
     */
    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_praise
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", blogPraiseId=").append(blogPraiseId);
        sb.append(", userId=").append(userId);
        sb.append(", blogId=").append(blogId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}