package homework_one;

public class HotDrink extends Product{
    private int volume;
    private int temperature;

    public HotDrink(String name, double cost) {
        super(name, cost);
    }

    public HotDrink(String name, int volume, int temperature) {
        super(name);
        this.volume = volume;
        this.temperature = temperature;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name = " + super.getName() +
                " \\ volume = " + this.volume +
                " \\ temperature = " + this.temperature + "°C}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HotDrink that)) {
            return false;
        }

        return super.getName().equalsIgnoreCase(that.getName())
                && super.getCost() == that.getCost()
                && getVolume() == that.getVolume();
    }

    public enum Drinks{
        Coffee("Coffee"),
        Tea("Tea"),
        Cacao("Cacao");

        private final String drinkName;
        private Drinks(String drink){
            this.drinkName = drink;
        }
        @Override
        public String toString(){
            return drinkName;
        }

    }
}
