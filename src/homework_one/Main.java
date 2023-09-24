package homework_one;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotDrink hotDrink1 = new HotDrink("Coffee", 100, 98);
        HotDrink hotDrink2 = new HotDrink("Tea", 80, 67);
        HotDrink hotDrink3 = new HotDrink("mulled wine", 80, 67);

        HotDrinkVendingMachine machine = new HotDrinkVendingMachine(
                List.of(
                        hotDrink1,
                        hotDrink2,
                        hotDrink3));

        System.out.println(machine.getProduct("Coffee"));
        System.out.println(machine.getProduct("Tea"));
        System.out.println(machine.getProduct("mulled wine"));
//        System.out.println(machine.getProduct("vodka"));
    }
}