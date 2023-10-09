package homework_third;

import homework_third.data.Student;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("1","1","1", LocalDate.of(2012,12,12), countMaxId);
        Student student2 = new Student("2","2","2", LocalDate.of(2012,12,12), countMaxId);
        Student student3 = new Student("3","3","3", LocalDate.of(2012,12,12), countMaxId);
        Student student4 = new Student("4","4","4", LocalDate.of(2012,12,12), countMaxId);
    }
}
