package homework_six.OCP;

// Bus - класс расширяющий класс Vehicle
public class Bus extends Vehicle{
    @Override
    public double calculateAllowedSpeed() {
        return super.getMaxSpeed() * 0.5;
    }

    public Bus(int maxSpeed) {
        super(maxSpeed, "Bus");
    }
}
