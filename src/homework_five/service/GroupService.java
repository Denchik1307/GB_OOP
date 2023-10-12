package homework_five.service;

import homework_five.data.Student;
import homework_five.data.StudentGroup;
import homework_five.data.Teacher;

import java.util.List;

public interface GroupService<T> {

    StudentGroup create(Teacher teacher, List<Student> studentList);
    List<Student> getStudents();
    Teacher getTeacherThisGroup();
}
