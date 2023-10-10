package homework_four.data;


import org.jetbrains.annotations.NotNull;

public class Student extends User implements Comparable<Student>{

    private Long studentId;

    public Student(String firstName, String secondName, String patronymic, String dateOfBirth, Long studentId) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.studentId = studentId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString() + ",student ID= \"" + studentId + "\"";
    }

    @Override
    public int compareTo(@NotNull Student o) {
        return this.getStudentId().compareTo(o.getStudentId());
    }
}