package interfaces.parking;

public abstract class Car {
    private String brand;
    private String model;
    private String type;
    public Car(String brand, String model, String type){
        this.brand = brand;
        this.model = model;
        this.type = type;
    }
}
