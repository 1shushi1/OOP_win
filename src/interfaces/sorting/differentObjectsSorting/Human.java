package interfaces.sorting.differentObjectsSorting;

import java.util.Date;

public class Human implements Compare{
    private String name;
    private double weight;
    private Date dateOfBirth;
    private double height;
    public Human(String name, double weight, Date dateOfBirth, double height){
        this.name = name;
        this.weight = weight;
        this.dateOfBirth = dateOfBirth;
        this.height = height;
    }
//    @Override
//    public int compareTo(Compare compare){
//        return Double.compare(weight, compare.getWeight());
//    }
    @Override
    public double getWeight(){
        return weight;
    }
    @Override
    public String toString(){
        return "Human :" + "\nName : " + name + "\nWeight : " + weight + "\nDate of birth : " + dateOfBirth + "\nHeight : " + height;
    }
    @Override
    public Date getDate(){
        return dateOfBirth;
    }
    @Override
    public int compareTo(Compare compare){
        return -dateOfBirth.compareTo(compare.getDate());
    }
}
