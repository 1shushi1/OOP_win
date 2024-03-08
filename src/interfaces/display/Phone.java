package interfaces.display;

public class Phone implements Usb{
    private String brand;
    private String model;
    private int capacity;
    public Phone(String brand, String model, int capacity){
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
    }
    @Override
    public String getData(){
        String info = "Brand : " + brand + "." + "\nModel : " +  model + "." + "\nCapacity : " + capacity + ".";
        return info;
    }
}
