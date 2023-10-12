package homework_five.contoller;

import homework_five.data.Student;
import homework_five.data.Teacher;
import homework_five.service.StudentService;
import homework_five.view.StudentView;

import java.util.List;


public class StudentController implements UserController<Student>{

    StudentService studentService = new StudentService();
    StudentView studentView = new StudentView();

    @Override
    public void create(String firstName, String secondName, String patronymic, String dateOfBirth) {
        studentService.create(firstName,secondName,patronymic,dateOfBirth);
    }

    public void showAll() {
        studentView.sendOnConsole(studentService.getAll());
    }

    public List<Student> getAll() {
       return this.studentService.getAll();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Student student : studentService.getAll()) {
            stringBuilder.append(student.toString()).append("\n");
        }
        return stringBuilder.toString();
    }
}
