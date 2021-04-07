package com.studentmanagement.crud.mapper;

import com.studentmanagement.crud.entity.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String stuno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbg.generated
     */
    int insert(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbg.generated
     */
    int insertSelective(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbg.generated
     */
    Student selectByPrimaryKey(String stuno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Student record);
}