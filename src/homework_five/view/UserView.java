package homework_five.view;

import homework_five.data.User;

import java.util.List;

public interface UserView <T extends User>{
    public void sendOnConsole(List<T> users);
}
