package com.cui.basic.service;

import java.util.List;

/**
 * dao接口声明
 *
 * @author cuijiabin
 */
public interface StudentDao {

    List<Student> findAllStudents();

    Student findStudentById(Integer id);

    void insertStudent(Student student);

    void updateStudent(Student student);

}
