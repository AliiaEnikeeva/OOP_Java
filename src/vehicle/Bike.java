package vehicle;

public class Bike extends Transport{
    public Bike(String model, String color, Integer wheels, Integer weigth, Integer maxspeed) {
        super(model, color, wheels, weigth, maxspeed);
    }

    public void run(){
        System.out.println("Велосипед едет");
    }

    @Override
    public String toString() {
        return "Велосипед " + super.toString();
    }
}
