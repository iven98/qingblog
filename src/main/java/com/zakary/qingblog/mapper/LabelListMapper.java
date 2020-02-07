package com.zakary.qingblog.mapper;

import com.zakary.qingblog.domain.LabelList;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LabelListMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table label_list
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("labelId") Integer labelId, @Param("blogId") Integer blogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table label_list
     *
     * @mbg.generated
     */
    int insert(LabelList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table label_list
     *
     * @mbg.generated
     */
    List<LabelList> selectAll();
}