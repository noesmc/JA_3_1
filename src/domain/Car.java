package domain;

public class Car {
    private String brand;
    private String model;
    private String modelRange;
    private int yearOfCreating;
    private String form;
    private String fuelType;
    private float volumeInCm3;

    public Car(String brand, String model, String modelRange, int yearOfCreating, String form, String fuelType,
               float volumeInCm3) {
        this.brand = brand;
        this.model = model;
        this.modelRange = modelRange;
        this.yearOfCreating = yearOfCreating;
        this.form = form;
        this.fuelType = fuelType;
        this.volumeInCm3 = volumeInCm3;
    }

    public float volumeInDm3() {
        return volumeInCm3 / 1000f;
    }

    public void getInfo() {
        System.out.printf("""
                Brand: %s,
                Model: %s,
                Model range: %s
                Year of creating: %d,
                Form: %s,
                Type of fuel: %s,
                Volume: %f
                """, brand, model, modelRange, yearOfCreating, form, fuelType, volumeInDm3());
    }
}



