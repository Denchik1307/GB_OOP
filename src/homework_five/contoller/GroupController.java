package homework_five.contoller;

import homework_five.data.Student;
import homework_five.data.Teacher;
import homework_five.service.StudentGroupService;

import java.util.List;

public class GroupController {

    StudentGroupService studentGroupService = new StudentGroupService();

    public void createGroup(Teacher teacher, List<Student> studentList) {
        this.studentGroupService.create(teacher, studentList);
    }

    public List<Student> getStudents() {
        return this.studentGroupService.getStudents();
    }

    public Teacher getTeacherThisGroup() {
        return this.studentGroupService.getTeacherThisGroup();
    }

    public void replaceTeacher(Teacher teacher) {
        this.studentGroupService.replaceTeacher(teacher);
    }

    public void addStudent(Student student) {
        this.studentGroupService.addStudent(student);
    }

    @Override
    public String toString() {
        return this.studentGroupService.toString();
    }
}
