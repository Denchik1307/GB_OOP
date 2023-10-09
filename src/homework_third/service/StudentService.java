package homework_third.service;

import homework_third.data.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentService implements UserService<Student> {

    private final List<Student> students;
    private Long countMaxId;


    public StudentService() {
        this.students = new ArrayList<Student>();
        this.countMaxId = 0L;
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String firstName,
                       String secondName,
                       String patronymic,
                       LocalDate dateOfBirth) {
        Student student = new Student(firstName,
                secondName,
                patronymic,
                dateOfBirth,
                countMaxId);
        countMaxId++;
        students.add(student);

    }
}
