package student.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import student.demo.entity.Department;
import student.demo.entity.Student;
import student.demo.service.StudentDetails;
import student.demo.service.StudentService;

import java.util.List;

@RestController
@CrossOrigin("*")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getStudent")
    public List<StudentDetails> getData()
    {
        return studentService.getStudents();
    }

    @PostMapping("/createStudent")
    public Student createData(@RequestBody Student request)
    {
        return studentService.createStudent(request);
    }

    @PutMapping("/updateStudent")
    public Student updateData(@RequestBody Student request)
    {
        return studentService.updateStudent(request);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public String deleteData(@PathVariable int id)
    {
        return studentService.deleteStudent(id);
    }
}
