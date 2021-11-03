package org.generation.dependencies_injection.controller;

import org.generation.dependencies_injection.model.Student;
import org.generation.dependencies_injection.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController
{

    private final StudentService studentService;

    public StudentController( @Autowired StudentService studentService )
    {
        this.studentService = studentService;
    }

    // comprobando los metodos
    // pruebas de conexion
    @GetMapping ("/hola")
    public String index() {
        return "Saludos";
    }

    // mostrando todos los datos agregados de prueba
    @GetMapping ("/students")
    public List<Student> allData(){
        return studentService.all();
    }

    // agregando un nuevo dato
    @GetMapping ("/nuevo/estudiante")
    public String newStudent(){
        studentService.add(new Student("4", 1, "roberto", "perez", 1));
        return "Estudiante agregado";
    }

    // buscando estudiante por id
    @GetMapping( "/student/{id}" )
    public Student findById( @PathVariable( "id" ) String id )
    {
        String idStudent = String.valueOf((2)-1);
        return studentService.findById(idStudent);
    }

    // eliminando a un estudiante
    /*@GetMapping("/delete/student")
    public String borrar(){
        studentService.delete();
        return "Estudiante eliminado";
    }*/
}
