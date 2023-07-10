package student.demo.utils;

public class AppConstant {

    public static final String FIND_ALL_STUDENTS = "select s.stu_id, s.stu_name, s.course, s.specialization, s.percentage,d.depart_id, d.depart_name from student s join department d where s.depart_id = d.depart_id";
}
