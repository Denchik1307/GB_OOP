package homework_one;

import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {

    private final List<Product> productsHotDrinks;

    public HotDrinkVendingMachine(List<Product> productsHotDrinks) {
        this.productsHotDrinks = productsHotDrinks;
    }

    @Override
    public Product getProduct(String name) {
        for (Product productHotDrink : productsHotDrinks) {
            if (productHotDrink.getName().equalsIgnoreCase(name)) {
                return productHotDrink;
            }
        }
        throw new IllegalStateException(String.format("Drink %s not found  :(", name));
    }

    public HotDrink getProduct(String name, int volume) {
        for (Product productHotDrink : productsHotDrinks) {
            if (productHotDrink instanceof HotDrink) {
                if (productHotDrink.getName().equalsIgnoreCase(name)
                        && ((HotDrink) productHotDrink).getVolume() == volume) {
                    return (HotDrink) productHotDrink;
                }
            }

        }
        throw new IllegalStateException(String.format("Drink %s not found  :(", name));
    }

    public HotDrink getProduct(String name, int volume, int temperature) {
        for (Product productHotDrink : productsHotDrinks) {
            if (productHotDrink instanceof HotDrink) {
                if (productHotDrink.getName().equalsIgnoreCase(name)
                        && ((HotDrink) productHotDrink).getVolume() == volume
                        && ((HotDrink) productHotDrink).getTemperature() == temperature) {
                    return (HotDrink) productHotDrink;
                }
            }
        }
        throw new IllegalStateException(String.format("Drink %s not found  :(", name));
    }

    public String getListDrinks(){
        return productsHotDrinks.stream().toList().toString();
    }
}
