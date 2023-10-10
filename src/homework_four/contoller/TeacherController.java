package homework_four.contoller;

import homework_four.data.Teacher;
import homework_four.service.TeacherService;
import homework_four.view.TeacherView;


public class TeacherController implements UserController<Teacher> {

    TeacherService teacherService = new TeacherService();
    TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String patronymic, String dateOfBirth) {
        teacherService.create(firstName, secondName, patronymic, dateOfBirth);
    }

    public void showAll() {
        teacherView.sendOnConsole(teacherService.getAll());
    }

    public Teacher select(Long teacherId) {
        return teacherService.select(teacherId);
    }

    public void editTeacher(Long teacherId) {
        teacherService.editTeacher(teacherId);
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Teacher teacher : teacherService.getAll()) {
            stringBuilder.append(teacher.toString()).append("\n");
        }
        return stringBuilder.toString();
    }
}
