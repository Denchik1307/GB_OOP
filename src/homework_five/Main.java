package homework_five;

import homework_five.contoller.GroupController;
import homework_five.contoller.StudentController;
import homework_five.data.Teacher;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("1", "1", "1", "1.1.1", 111L);
        GroupController groupController = new GroupController();
        StudentController studentController = new StudentController();

        studentController.create("1", "1", "1", "1.1.1");
        studentController.create("2", "2", "2", "2.2.2");
        studentController.create("3", "3", "3", "3.3.3");

        groupController.createGroup(teacher, studentController.getAll());

        System.out.println(groupController.toString());

    }
}