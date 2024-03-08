package interfaces.sorting.differentObjectsSorting;
import java.util.Date;
public class Table implements Compare{
    private double weight;
    private Date manufactureDate;
    private double height;
    public Table(int weight, Date manufactureDate, double height){
        this.weight = weight;
        this.manufactureDate = manufactureDate;
        this.height = height;
    }
//    @Override
//    public int compareTo(Compare compare){
//        return Double.compare(weight, compare.getWeight());
//    }
    @Override
    public int compareTo(Compare compare){
        return -manufactureDate.compareTo(compare.getDate());
    }
    @Override
    public double getWeight(){
        return weight;
    }
    @Override
    public Date getDate(){
        return manufactureDate;
    }

    @Override
    public String toString(){
        return "Table :" + "\nWeight : " + weight + "\nDate of manufacture : " + manufactureDate + "\nHeight : " + height;
    }
}
