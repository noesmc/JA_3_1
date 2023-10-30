package domain;

public class Car {
    private String brand;
    private String model;
    private int yearOfCreating;
    private String form;
    private String fuelType;
    private float volumeInCm3;

    public Car(String brand, String model, int yearOfCreating, String form, String fuelType, float volumeInCm3) {
        this.brand = brand;
        this.model = model;
        this.yearOfCreating = yearOfCreating;
        this.form = form;
        this.fuelType = fuelType;
        this.volumeInCm3 = volumeInCm3;
    }

    public float volumeInDm3(float volumeInDm3) {
        volumeInDm3 = volumeInCm3 / 1000f;
        return volumeInDm3;
    }

    public void getInfo() {
            System.out.printf("""
                Brand: %s,
                Model: %s,
                Year of creating: %d,
                Form: %s,
                Type of fuel: %s,
                Volume: %f
                """, brand, model, yearOfCreating, form, fuelType, volumeInDm3(volumeInCm3));
    }
}



