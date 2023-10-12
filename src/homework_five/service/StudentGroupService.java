package homework_five.service;

import homework_five.data.Student;
import homework_five.data.StudentGroup;
import homework_five.data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudentGroupService implements GroupService<StudentGroup> {

    private StudentGroup studentGroup;

    @Override
    public StudentGroup create(Teacher teacher, List<Student> studentList) {
        this.studentGroup = new StudentGroup(teacher, studentList);
        return this.studentGroup;
    }

    @Override
    public List<Student> getStudents() {
        return this.studentGroup.getStudentList();
    }

    @Override
    public Teacher getTeacherThisGroup() {
        return this.studentGroup.getTeacherThisGroup();
    }

    public void replaceTeacher(Teacher teacher) {
        this.studentGroup.replaceTeacher(teacher);
    }

    public void addStudent(Student student) {
        this.studentGroup.addStudent(student);
    }


    @Override
    public String toString() {
        return this.studentGroup.toString();
    }
}
