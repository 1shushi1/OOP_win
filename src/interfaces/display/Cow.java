package interfaces.display;
import java.util.Date;

public class Cow implements Usb{
    private String name;
    private Date dateOfBirth;
    private double weight;
    public Cow(String name, Date dateOfBirth, double weight){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.weight = weight;
    }
    @Override
    public String getData(){
        String info = "Name : " + name + "." + "\nDate of birth : " + dateOfBirth + "." + "\nWeight : " + weight;
        return info;
    }
}
