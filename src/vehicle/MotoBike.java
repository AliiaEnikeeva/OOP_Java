package vehicle;

public class MotoBike extends Transport{
    public MotoBike(String model, String color, Integer wheels, Integer weigth, Integer maxspeed) {
        super(model, color, wheels, weigth, maxspeed);
    }

    public void run(){
        System.out.println("Мотоцикл едет");
    }

    @Override
    public String toString() {
        return "Мотоцикл " + super.toString();
    }
}
