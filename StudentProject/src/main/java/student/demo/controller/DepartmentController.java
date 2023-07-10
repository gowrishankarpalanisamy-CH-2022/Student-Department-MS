package student.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import student.demo.entity.Department;
import student.demo.service.DepartmentService;

import java.util.List;

@RestController
@CrossOrigin("*")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/getDepartment")
    public List<Department> getData()
    {
        return departmentService.getDepartment();
    }

    @PostMapping("/addDepartment")
    public Department addData(@RequestBody Department data)
    {
        return departmentService.createDepartment(data);
    }

    @PutMapping("/updateDepartment")
    public Department updateData(@RequestBody Department data){
        return departmentService.updateDepartment(data);
    }

    @DeleteMapping("/deleteDepartment/{id}")
    public String deletedData(@PathVariable int id ){
        return departmentService.deleteDepartment(id);
    }
}
