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
@Qualifier("neo4j")
@Repository
public class Neo4jImpl implements StudentDao {

    @Autowired
    private Neo4jRepInterface repository;


    @Override
    public Collection<Student> getAllStudents() {
        Map<Integer, Student> student = new HashMap<>();
        int i = 0;
        for (Student student1 : this.repository.findAll()) {
            student.put(++i, student1);
        }

        return student.values();
    }

    @Override
    public Student getStudentByID(int id) {
        int i = 1;
        Student result = null;
        for (Student student1 : this.repository.findAll()) {
            System.out.println(student1.toString());
            if (i == id) {
                result = student1;
                break;
            }
            ++i;
        }
        return result;
    }

    @Override
    public void removeStudentByID(int id) {

    }
}
