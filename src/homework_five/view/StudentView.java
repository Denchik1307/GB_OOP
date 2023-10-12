package homework_five.view;

import homework_five.data.Student;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class StudentView implements UserView<Student>{

    @Override
    public void sendOnConsole(@NotNull List<Student> users) {
        for(Student student : users){
            System.out.println(student.toString());
        }
    }
}
