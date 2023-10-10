package homework_four.view;

import homework_four.data.Student;
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
