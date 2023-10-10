package homework_four.view;

import homework_four.data.User;

import java.util.List;

public interface UserView <T extends User>{
    public void sendOnConsole(List<T> users);
}
