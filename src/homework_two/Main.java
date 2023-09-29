package homework_two;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Ivan");
        Human human2 = new Human("Vladimir");
        Human human3 = new Human("Den");
        Human human4 = new Human("Alex");
        List<Thread> threads = new ArrayList<>();
        List<Human> persons = new ArrayList<>();
        persons.add(human1);
        persons.add(human2);
        persons.add(human3);
        persons.add(human4);
        for (Human human : persons) {
            Thread tread = new Thread(new Runnable() {
                @Override
                public void run() {
                    market.acceptToMarket(human);
                }
            });
//            tread.setName("Tread for " + human.name);
            threads.add(tread);

        }
        for (Thread thread : threads) {
//            System.out.println(thread.getName());
            thread.start();


        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        market.update();
    }
}
