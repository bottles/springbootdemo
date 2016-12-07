package com.jie.Dao;

import com.jie.Entity.Student;

import java.util.Collection;

/**
 * Created by u6076069 on 7/12/16.
 */
public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentByID(int id);

    void removeStudentByID(int id);
}
