package student.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "department", schema = "student_dept")
public class Department {

    @Id
    @Column(name = "depart_id")
    private int departID;

    @Column(name = "depart_name")
    private String departName;
}
