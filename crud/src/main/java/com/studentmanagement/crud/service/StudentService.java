package com.studentmanagement.crud.service;

import com.studentmanagement.crud.entity.Student;
import com.studentmanagement.crud.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements StudentDao {

    private StudentMapper studentMapper;

    @Override
    public List<Student> queryAll() {

        return null;
    }

    @Override
    public boolean add(Student student) {
        return false;
    }

    @Override
    public boolean deleteByID(int no) {
        return false;
    }

    @Override
    public boolean update(Student student) {
        return false;
    }

}