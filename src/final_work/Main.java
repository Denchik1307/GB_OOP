package final_work;

import java.util.Scanner;

import static final_work.MyFileWriter.writeDataToFile;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Введите данные в формате 'Фамилия Имя Отчество дата рождения номер телефона пол':");
            String userData = scanner.nextLine();

            String[] dataArr = userData.split(" ");
            if (dataArr.length != 6) {
                System.out.println("Ошибка! Введено неверное количество данных.");
                System.exit(1);
            }
            String surname = dataArr[0];
            String name = dataArr[1];
            String patronymic = dataArr[2];
            String dateOfBirth = dataArr[3];
            String phoneNumber = dataArr[4];
            String gender = dataArr[5];

            if (isValidDate(dateOfBirth)) {
                try {
                    writeDataToFile(Person.createPerson(surname, name, patronymic, dateOfBirth, phoneNumber, gender));
                    System.out.println("Данные успешно записаны в файл.");
                }catch (InvalidDataException e){
                    System.out.println("Ошибка при записи данных в файл:");
                    MyStacktrace.printStacktrace(e);
                }
            } else {
                System.exit(1);
            }

        }
    }

    private static boolean isValidDate(String date){
        String[] dateParts = date.split("\\.");
        if (dateParts.length != 3 || dateParts[0].length() != 2 || dateParts[1].length() != 2 || dateParts[2].length() != 4) {
            return false;
        }

        try {
            int day = Integer.parseInt(dateParts[0]);
            int month = Integer.parseInt(dateParts[1]);
            int year = Integer.parseInt(dateParts[2]);
        } catch (NumberFormatException e) {
            return false;
        }


        return true;
    }
}
