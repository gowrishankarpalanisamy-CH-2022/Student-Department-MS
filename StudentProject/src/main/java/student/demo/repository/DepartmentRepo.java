package student.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import student.demo.entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,Integer> {
}
