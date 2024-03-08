package interfaces.sorting.difficult;

import java.util.Date;

public class Phone implements Comparable<Phone>{
    private String brand;
    private String model;
    private long serial;
    private double price;
    private Date date;
    private Sim sim;
    private int width;
    public Phone(String brand, String model, long serial, double price, Date date, Sim sim, int width){
        this.brand = brand;
        this.model = model;
        this.serial = serial;
        this.price = price;
        this.date = date;
        this.sim = sim;
        this.width = width;
    }
//    @Override
//    public int compareTo(Phone phone) {
//        if (this.width > phone.width){
//            return 1;
//        }
//        if (this.width < phone.width){
//            return -1;
//        } else {
//            return 0;
//        }
//        return width - phone.width;
//    }

//    @Override
//    public int compareTo(Phone phone){
//        if (price > phone.price){
//            return 1;
//        }
//        if (price < phone.price){
//            return -1;
//        } else {
//            return 0;
//        }
//        return Double.compare(price, phone.price);
//    }

//    @Override
//    public int compareTo(Phone phone){
//        return -Long.compare(serial, phone.serial);
//        // "-" reverse our code
//    }

//    @Override
//    public int compareTo(Phone phone){
//        return date.compareTo(phone.date);
//    }

//    @Override
//    public int compareTo(Phone phone){
//        return sim.getBalance() - phone.sim.getBalance();
//    }

    @Override
    public int compareTo(Phone phone){
        return sim.getOperator().compareTo(phone.sim.getOperator());
    }

    @Override
    public String toString(){
        return "Brand : " + brand + "\nModel : " + model + "\nSerial : " + serial + "\nPrice : " + price + "\nDate : " + date + "\nSim info : " + sim + "\nWidth : " + width;
    }
}
