package student.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student", schema = "student_dept")
public class Student {

    @Id
    @Column(name = "stu_id")
    private int studentId;

    @Column(name = "stu_name")
    private String studentName;

    @Column(name = "course")
    private String courseName;

    @Column(name = "specialization")
    private String specializedIn;

    @Column(name = "percentage")
    private float percentage;

    @Column(name = "depart_id")
    private int departId;
}
