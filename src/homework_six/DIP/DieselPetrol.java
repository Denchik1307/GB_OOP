package homework_six.DIP;
// модуль нижнего уровня осуществляет(зависит) абстракцию интерфейса Engine
public class DieselPetrol implements Engine {
    @Override
    public void start() {
        System.out.println("Запустили дизельный двигатель");
    }
}
