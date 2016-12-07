package com.jie.service;

import com.jie.Dao.StudentDao;
import com.jie.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by u6076069 on 7/12/16.
 */
@Service
public class StudentService {
    @Autowired
    @Qualifier("fakedata")
    private StudentDao studentDao;

    public Collection<Student> getAllStudents() {
        return this.studentDao.getAllStudents();
    }

    public Student getStudentByID(int id) {
        return this.studentDao.getStudentByID(id);
    }

    public void removeStudentByID(int id) {
        this.studentDao.removeStudentByID(id);
    }
}
