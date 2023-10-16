package homework_six.DIP;
// Данному объекту неважно какой будет двигатель, он зависит от абстракции Car - Engine.

public class Test {
    public static void main(String[] args) {
        Car car = new Car(new PetrolEngine());
        car.start();
        car = new Car(new DieselPetrol());
        car.start();
    }
}
