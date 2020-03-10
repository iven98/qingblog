package com.zakary.qingblog.domain;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public class Favorites implements Serializable {

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column favorites_id
     *
     * @mbg.generated
     */
    private Integer favoritesId;
    public Integer getFavoritesId() {
        return favoritesId;
    }

    public void setFavoritesId(Integer favoritesId) {
        this.favoritesId = favoritesId;
    }


    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column favorites.blog_id
     *
     * @mbg.generated
     */
    private Integer blogId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column favorites.blog_title
     *
     * @mbg.generated
     */
    private String blogTitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table favorites
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;


    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column favorites.blog_id
     *
     * @return the value of favorites.blog_id
     *
     * @mbg.generated
     */
    public Integer getBlogId() {
        return blogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column favorites.blog_id
     *
     * @param blogId the value for favorites.blog_id
     *
     * @mbg.generated
     */
    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column favorites.blog_title
     *
     * @return the value of favorites.blog_title
     *
     * @mbg.generated
     */
    public String getBlogTitle() {
        return blogTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column favorites.blog_title
     *
     * @param blogTitle the value for favorites.blog_title
     *
     * @mbg.generated
     */
    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle == null ? null : blogTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favorites
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", favoritesId=").append(favoritesId);
        sb.append(", blogId=").append(blogId);
        sb.append(", blogTitle=").append(blogTitle);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}