package homework_third.controller;

import lesson_third.User;

import java.time.LocalDate;

public interface IUserController<T extends User> {

    public void create(String firstName,
                    String secondName,
                    String patronymic,
                    LocalDate dateOfBirth);
}
