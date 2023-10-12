package homework_five.view;

import homework_five.data.Teacher;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class TeacherView implements UserView<Teacher> {

    @Override
    public void sendOnConsole(@NotNull List<Teacher> teacherList) {
        for(Teacher teacher: teacherList){
            System.out.println(teacher.toString());
        }
    }
}
