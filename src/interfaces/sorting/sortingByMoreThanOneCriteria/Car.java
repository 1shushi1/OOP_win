package interfaces.sorting.sortingByMoreThanOneCriteria;

import java.util.Date;

public class Car implements Comparable<Car>{
    private String brand;
    private String model;
    private Engine engine;
    private double price;
    private int year;
    public Car(String brand, String model, Engine engine, double price, int year){
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.price = price;
        this.year = year;
    }
    @Override
    public int compareTo(Car car){
        int num = this.brand.compareTo(car.brand);
        if (num != 0){
            return num;
        }
        num = this.model.compareTo(car.model);
        if (num != 0){
            return num;
        }
        num = this.engine.getBrand().compareTo(car.engine.getBrand());
        if (num != 0){
            return num;
        }
        num = Double.compare(this.price, car.price);
        if (num != 0){
            return num;
        } else {
            num = Integer.compare(this.year, car.year);
            return num;
        }
    }
    @Override
    public String toString(){
        return "Car : " + "\nBrand : " + brand + "\nModel : " + model + "\nEngine : " + engine + "\nPrice : " + price + "\nYear : " + year;
    }
}
