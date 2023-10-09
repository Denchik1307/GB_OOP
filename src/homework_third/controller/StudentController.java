package homework_third.controller;

import homework_third.service.StudentService;
import homework_third.view.StudentView;
import lesson_third.Student;

import java.time.LocalDate;

public class StudentController implements IUserController<Student> {

    private final StudentService studentService = new StudentService();
    private final StudentView studentView = new StudentView();

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        studentService.create(firstName,secondName,patronymic,dateOfBirth);
        studentView.sendOnConsole(studentService.getAll());
    }
}
