package com.studentmanagement.crud.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Student implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_info.stuNo
     *
     * @mbg.generated
     */
    private String stuno;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_info.stuName
     *
     * @mbg.generated
     */
    private String stuname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_info.stuAge
     *
     * @mbg.generated
     */
    private Integer stuage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student_info.stuPhone
     *
     * @mbg.generated
     */
    private String stuphone;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_info.stuNo
     *
     * @return the value of student_info.stuNo
     *
     * @mbg.generated
     */
    public String getStuno() {
        return stuno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_info.stuNo
     *
     * @param stuno the value for student_info.stuNo
     *
     * @mbg.generated
     */
    public void setStuno(String stuno) {
        this.stuno = stuno == null ? null : stuno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_info.stuName
     *
     * @return the value of student_info.stuName
     *
     * @mbg.generated
     */
    public String getStuname() {
        return stuname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_info.stuName
     *
     * @param stuname the value for student_info.stuName
     *
     * @mbg.generated
     */
    public void setStuname(String stuname) {
        this.stuname = stuname == null ? null : stuname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_info.stuAge
     *
     * @return the value of student_info.stuAge
     *
     * @mbg.generated
     */
    public Integer getStuage() {
        return stuage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_info.stuAge
     *
     * @param stuage the value for student_info.stuAge
     *
     * @mbg.generated
     */
    public void setStuage(Integer stuage) {
        this.stuage = stuage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student_info.stuPhone
     *
     * @return the value of student_info.stuPhone
     *
     * @mbg.generated
     */
    public String getStuphone() {
        return stuphone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student_info.stuPhone
     *
     * @param stuphone the value for student_info.stuPhone
     *
     * @mbg.generated
     */
    public void setStuphone(String stuphone) {
        this.stuphone = stuphone == null ? null : stuphone.trim();
    }
}