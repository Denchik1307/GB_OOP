package homework_four.contoller;

import homework_four.data.User;

public interface UserController <T extends User>{

    void create(String firstName,String secondName,String patronymic,String dateOfBirth);
}
