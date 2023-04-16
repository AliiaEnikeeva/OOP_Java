package vehicle;

public class Truck extends Transport{
    public Truck(String model, String color, Integer wheels, Integer weigth, Integer maxspeed) {
        super(model, color, wheels, weigth, maxspeed);
    }

    public void run(){
        System.out.println("Грузовик едет");
    }

    @Override
    public String toString() {
        return "Грузовик " + super.toString();
    }
}
