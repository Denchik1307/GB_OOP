package final_work;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Person {
    String lastName;
    String firstName;
    String middleName;
    Date birthDate;
    long phoneNumber;
    String gender;

     public static Person createPerson(String lastName,
                                       String firstName,
                                       String middleName,
                                       String birthDateStr,
                                       String phoneNumberStr,
                                       String gender) throws InvalidDataException {
         Date birthDateChecked;
         long phoneNumberChecked;

        if (lastName.length() <= 3 || firstName.length() <= 3 || middleName.length() <= 3) {
            throw new InvalidDataException("Фамилия, имя и отчество должны содержать более 3 символов");
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        dateFormat.setLenient(false);
        try {
            birthDateChecked = dateFormat.parse(birthDateStr);
        } catch (ParseException e) {
            throw new InvalidDataException("Неверный формат даты рождения");
        }

        try {
            phoneNumberChecked = Long.parseLong(phoneNumberStr);
        } catch (NumberFormatException e) {
            throw new InvalidDataException("Неверный формат номера телефона");
        }

        if (!Objects.equals(gender, "f") && !Objects.equals(gender, "m")) {
            throw new InvalidDataException("Неверный формат пола");
        }
        return new Person(lastName, firstName, middleName, birthDateChecked, phoneNumberChecked, gender);
    }

    private Person(@NotNull String lastName,
                   String firstName,
                   String middleName,
                   Date birthDate,
                   Long phoneNumber,
                   String gender) {

        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        dateFormat.setLenient(false);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.lastName).append(" ")
                .append(this.firstName).append(" ")
                .append(this.middleName).append(" ")
                .append(dateFormat.format(this.birthDate)).append(" ")
                .append(this.phoneNumber).append(" ")
                .append(this.gender).append("\n");
        return  stringBuilder.toString() ;
    }

    private static void savePersonToFile(Person person) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(person.lastName + ".txt", true))) {
            writer.write(person.toString());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Ошибка при чтении/записи файла: " + e.getMessage());
        }
    }
}
