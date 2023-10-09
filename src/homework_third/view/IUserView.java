package homework_third.view;

import homework_third.data.Student;
import homework_third.data.User;

import java.util.List;

public interface IUserView<T extends User> {

    void sendOnConsole(List<T> list);
}
