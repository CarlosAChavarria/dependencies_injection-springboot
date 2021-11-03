package org.generation.dependencies_injection.service;

import org.generation.dependencies_injection.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImplMap implements StudentService{
    Map<Integer, String> studentMap = new HashMap<>();
    @Override
    public void add(Student student) {

    }

    @Override
    public void delete(Student student) {

    }

    @Override
    public List<Student> all() {
        List<Student> data = new ArrayList(studentMap.values());
        return data;
    }

    @Override
    public Student findById(String id) {
        return null;
    }

    private void addStudentsMap(){
        //Student student1 = new Student("1", 1, "Ramiro", "chavarria", 1);
        studentMap.put(1,"hola");
        //studentMap.put(2,new Student("2", 1, "Luis", "ortiz", 1));
        //studentMap.put(3,new Student("3", 1, "Jose", "león", 1));
    }
}
