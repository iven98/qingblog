package com.zakary.qingblog.domain;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public class Label implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column label.label_id
     *
     * @mbg.generated
     */
    private Integer labelId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column label.label_title
     *
     * @mbg.generated
     */
    private String labelTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column label.label_description
     *
     * @mbg.generated
     */
    private String labelDescription;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table label
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column label.label_id
     *
     * @return the value of label.label_id
     *
     * @mbg.generated
     */
    public Integer getLabelId() {
        return labelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column label.label_id
     *
     * @param labelId the value for label.label_id
     *
     * @mbg.generated
     */
    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column label.label_title
     *
     * @return the value of label.label_title
     *
     * @mbg.generated
     */
    public String getLabelTitle() {
        return labelTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column label.label_title
     *
     * @param labelTitle the value for label.label_title
     *
     * @mbg.generated
     */
    public void setLabelTitle(String labelTitle) {
        this.labelTitle = labelTitle == null ? null : labelTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column label.label_description
     *
     * @return the value of label.label_description
     *
     * @mbg.generated
     */
    public String getLabelDescription() {
        return labelDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column label.label_description
     *
     * @param labelDescription the value for label.label_description
     *
     * @mbg.generated
     */
    public void setLabelDescription(String labelDescription) {
        this.labelDescription = labelDescription == null ? null : labelDescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table label
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", labelId=").append(labelId);
        sb.append(", labelTitle=").append(labelTitle);
        sb.append(", labelDescription=").append(labelDescription);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}