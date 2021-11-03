package org.generation.dependencies_injection.service;

import org.generation.dependencies_injection.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


//definimos que este es un objeto tipo servicio
public class StudentServiceImpl implements StudentService{
    //creando una colección de tipo ArrayList
    private final List<Student> studentList = new ArrayList<>();

    public StudentServiceImpl(){
        addStudents();
    }

    @Override
    public void add(Student student) {
        studentList.add(student);
    }

    @Override
    public void delete(Student student) {
        studentList.remove( student );
    }

    @Override
    public List<Student> all() {
        return studentList;
    }

    @Override
    public Student findById(String id) {
        //parseamos el valor porque necesitamos una entero para buscarlo por id
        return studentList.get(Integer.parseInt(id));
    }

    // (private) para que solo se llame desde dentro de la misma clase
    // no es nesesario realizar el llamado desde la clase controller
    private void addStudents(){
        studentList.add(new Student("1", 1, "carlos", "chavarria", 1));
        studentList.add(new Student("2", 1, "alberto", "ortiz", 1));
        studentList.add(new Student("3", 1, "eduardo", "león", 1));
    }
}
