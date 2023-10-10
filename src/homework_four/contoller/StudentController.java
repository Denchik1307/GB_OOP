package homework_four.contoller;

import homework_four.data.Student;
import homework_four.data.Teacher;
import homework_four.service.StudentService;
import homework_four.view.StudentView;


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

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Student student : studentService.getAll()) {
            stringBuilder.append(student.toString()).append("\n");
        }
        return stringBuilder.toString();
    }
}
