import domain.Car;

public class Main {

    public static void main(String[] args) {
        Car myCar = new Car(
                "Skoda",
                "Octavia",
                "A5 scout",
                2012,
                "Universal",
                "Gasoline",
                1800);
        myCar.getInfo();
    }
}
