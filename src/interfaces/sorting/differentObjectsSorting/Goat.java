package interfaces.sorting.differentObjectsSorting;

import java.util.Date;

public class Goat implements Compare{
    private double weight;
    private Date dateOfBirth;
    private double height;
    public Goat(double weight, Date dateOfBirth, double height){
        this.weight = weight;
        this.height = height;
        this.dateOfBirth = dateOfBirth;
    }
//    @Override
//    public int compareTo(Compare compare){
//        return Double.compare(weight, compare.getWeight());
//    }
    @Override
    public int compareTo(Compare compare){
        return -dateOfBirth.compareTo(compare.getDate());
    }
    @Override
    public double getWeight(){
        return weight;
    }
    @Override
    public String toString(){
        return "Goat :" + "\nWeight : " + weight + "\nDate of birth : " + dateOfBirth + "\nHeight : " + height;
    }
    @Override
    public Date getDate(){
        return dateOfBirth;
    }
}
