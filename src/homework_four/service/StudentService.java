package homework_four.service;

import homework_four.data.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements UserService<Student>{

    private final List<Student> students;

    public StudentService() {
        this.students = new ArrayList<>();
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, String dateOfBirth) {

        Long maxId = 0L;

        for (Student student: students){
            if (student.getStudentId() > maxId){
                maxId = student.getStudentId();
            }
        }

        Student student = new Student(firstName, secondName, patronymic, dateOfBirth, ++maxId);

        students.add(student);
    }
}
