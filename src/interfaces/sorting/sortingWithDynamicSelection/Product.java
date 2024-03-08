package interfaces.sorting.sortingWithDynamicSelection;

import java.util.Date;

public class Product {
    private String brand;
    private String title;
    private int date;
    private double price;
    private long barcode;
    private double weight;
    private double size;
    public Product(String brand, String title, int date, double price, long barcode, double weight, double size){
        this.brand = brand;
        this.title = title;
        this.date = date;
        this.price = price;
        this.barcode = barcode;
        this.weight = weight;
        this.size = size;
    }
    @Override
    public String toString(){
        return "Brand : " + brand + ". Title : " + title + ". Date : " + date + ". Price : " + price + ". Barcode : " + barcode + ". Weight : " + weight + ". Size : " + size;
    }
    public String getBrand(){
        return brand;
    }
    public String getTitle(){
        return title;
    }
    public int getDate(){
        return date;
    }
    public double getPrice(){
        return price;
    }
    public long getBarcode(){
        return barcode;
    }
    public double getWeight(){
        return weight;
    }
    public double getSize(){
        return size;
    }
}
