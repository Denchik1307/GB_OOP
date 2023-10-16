package homework_six.DIP;
// модуль нижнего уровня осуществляет(зависит) абстракцию интерфейса Engine
public class PetrolEngine implements Engine {
    @Override
    public void start(){
        System.out.println("Бензиновый двигатель запущен");
    }
}
