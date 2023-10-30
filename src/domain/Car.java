package domain;

public class Car {
    private String brand;
    private String model;
    private int yearOfCreating;
    private String form;
    private float volumeInCm3;

    public Car(String brand, String model, int yearOfCreating, String form, float volumeInCm3) {
        this.brand = brand;
        this.model = model;
        this.yearOfCreating = yearOfCreating;
        this.form = form;
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
                Volume: %f
                """, brand, model, yearOfCreating, form, volumeInDm3(volumeInCm3));
    }
}



