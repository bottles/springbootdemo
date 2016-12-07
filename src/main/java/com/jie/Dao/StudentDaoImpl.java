package com.jie.Dao;

import com.jie.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by u6076069 on 7/12/16.
 */
@Repository
@Qualifier("fakedata")
public class StudentDaoImpl implements StudentDao {
    @Autowired
    private static Map<Integer, Student> student;
    static {
        student = new HashMap<Integer, Student>(){
            {
                put(1, new Student(1, "Steve", "Blackburn", "Steve", "123456"));
                put(2, new Student(2, "Alice", "Kuss", "Alice", "111111"));
                put(3, new Student(3, "Mario", "Maker", "Mario", "111111"));
            }
        };
    }
    @Override
    public Collection<Student> getAllStudents() {
        return this.student.values();
    }

    @Override
    public Student getStudentByID(int id) {
        return this.student.get(id);
    }

    @Override
    public void removeStudentByID(int id) {
        this.student.remove(id);
    }
}
