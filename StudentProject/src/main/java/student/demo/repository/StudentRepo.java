package student.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import student.demo.entity.Student;
import student.demo.service.StudentDetails;
import student.demo.utils.AppConstant;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
    @Query(value = AppConstant.FIND_ALL_STUDENTS,nativeQuery = true)
    List<StudentDetails> findAllStudents();
}
