package homework_one;

public interface VendingMachine {
    Product getProduct(String name) throws IllegalStateException;
}
