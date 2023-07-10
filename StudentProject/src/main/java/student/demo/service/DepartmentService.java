package student.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import student.demo.entity.Department;
import student.demo.repository.DepartmentRepo;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepo departmentRepo;

    public Department createDepartment (Department request)
    {
        Department saveData = departmentRepo.save(request);
        return saveData;
    }

    public Department updateDepartment(Department request)
    {
        Department existedData=departmentRepo.findById(request.getDepartID()).orElse(null);
        existedData.setDepartName(request.getDepartName());
        return departmentRepo.save(existedData);
    }

    public String deleteDepartment(int departID){
        departmentRepo.deleteById(departID);
        return "Deleted Successfully";
    }

    public List<Department> getDepartment()
    {
        return departmentRepo.findAll();
    }
}
