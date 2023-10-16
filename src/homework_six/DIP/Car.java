package homework_six.DIP;

// модуль верхнего уровня содержащий абстракцию интерфейса Engine
public class Car {
    public Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
}
