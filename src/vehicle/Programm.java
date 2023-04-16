package vehicle;

public class Programm {

    public static void main(String[] args) {
        Transport[] transports = {new Car("Audi", "Black", 4, 1800, 300),
        new Truck("Mad", "Red", 4, 9000, 150),
        new Bike("MaxPro", "Silver", 2, 5, 20),
        new MotoBike("Kawasaki", "Orange", 2, 160, 180)};
        for (Transport transport:transports) {
            getInfo(transport);
        }
    }

    public static void getInfo(Transport transport) {
        System.out.println(transport.toString());
        transport.run();

    }
}
