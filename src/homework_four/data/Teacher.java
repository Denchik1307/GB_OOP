package homework_four.data;


import org.jetbrains.annotations.NotNull;

public class Teacher extends User implements Comparable<Teacher> {

    private Long teacherId;

    public Teacher(String firstName, String secondName, String patronymic, String dateOfBirth, Long teacherId) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.teacherId = teacherId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher: " + super.toString() + ",teacherId= \"" + teacherId + "\"";
    }

    @Override
    public int compareTo(@NotNull Teacher o) {
        return this.getTeacherId().compareTo(o.getTeacherId());
    }
}
