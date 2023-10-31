package final_work;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter {

    public static void writeDataToFile(Person person){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(person.lastName + ".txt", true))) {
            writer.write(person.toString());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Ошибка при чтении/записи файла: " + e.getMessage());
        }
    }
}
