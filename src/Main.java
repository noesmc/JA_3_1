import domain.Car;

public class Main {

    public static void main(String[] args) {
        Car myCar = new Car(
                "Skoda",
                "Octavia",
                2012,
                "Sedan",
                "Gasoline",
                1800);
        myCar.getInfo();
    }
}
