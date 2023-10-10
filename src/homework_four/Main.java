package homework_four;

import homework_four.contoller.StudentController;
import homework_four.contoller.TeacherController;

public class Main {
    public static void main(String[] args) {
        TeacherController teacherController = new TeacherController();
        teacherController.create("1","1","1","1.1.1");
        teacherController.create("2","2","2","2.2.2");
        teacherController.create("3","3","3","3.3.3");
        StudentController studentController = new StudentController();
        studentController.create("1","1","1","1.1.1");
        studentController.create("2","2","2","2.2.2");
        studentController.create("3","3","3","3.3.3");
//        teacherController.editTeacher();
        System.out.println(teacherController.toString());
//        studentController.showAll();
        teacherController.editTeacher(2L);
    }
}