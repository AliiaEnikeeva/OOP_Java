package vehicle;

public class Transport {
    private String model;
    private String color;
    private Integer wheels;
    private Integer weigth;
    private Integer maxspeed;

    public Transport(String model, String color, Integer wheels, Integer weigth, Integer maxspeed) {
        this.model = model;
        this.color = color;
        this.wheels = wheels;
        this.weigth = weigth;
        this.maxspeed = maxspeed;
    }

    @Override
    public String toString() {
        return " {" +
                "Цвет = '" + color + '\'' +
                ", Количество колес = " + wheels +
                ", Модель = '" + model + '\'' +
                ", Вес = " + weigth +
                ", Скорость = " + maxspeed + '}';
    }

    public void run() {
    }
}


