package homework_five.data;

import java.util.List;

public class StudentGroup {
    private Teacher teacher;
    private List<Student> studentList;

    public StudentGroup(Teacher teacher, List<Student> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
    }

    public Teacher getTeacherThisGroup() {
        return this.teacher;
    }

    public List<Student> getStudentList() {
        return this.studentList;
    }

    public void replaceTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void addStudent(Student student) {
        this.studentList.add(student);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.teacher.toString()).append("\n");
        for (Student student:this.studentList) {
            stringBuilder.append(student.toString()).append("\n");
        }
        return  stringBuilder.toString();
    }
}
