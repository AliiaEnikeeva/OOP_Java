package vehicle;

public class Car extends Transport{
    public Car(String model, String color, Integer wheels, Integer weigth, Integer maxspeed) {
        super(model, color, wheels, weigth, maxspeed);
    }

    public void run(){
        System.out.println("Машина едет");
    }

    @Override
    public String toString() {
        return "Машина " + super.toString();
    }
}
