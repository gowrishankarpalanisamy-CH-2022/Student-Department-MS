package student.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import student.demo.entity.Student;
import student.demo.repository.StudentRepo;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public Student createStudent(Student request)
    {
        return studentRepo.save(request);
    }

    public Student updateStudent(Student request)
    {
        Student existedData= studentRepo.findById(request.getStudentId()).orElse(null);
        existedData.setStudentName(request.getStudentName());
        existedData.setCourseName(request.getCourseName());
        existedData.setDepartId(request.getDepartId());
        existedData.setPercentage(request.getPercentage());
        existedData.setSpecializedIn(request.getSpecializedIn());

        return studentRepo.save(existedData);
    }

    public String deleteStudent(int studentId){
        studentRepo.deleteById(studentId);
        return "Deleted successfully";
    }

    public List<StudentDetails> getStudents()
    {
        return studentRepo.findAllStudents();
    }
}
