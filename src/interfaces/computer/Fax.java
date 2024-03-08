package interfaces.computer;

public class Fax implements Printable{
    @Override
    public void print(String info){
        System.out.println("Fax printed this info : "  + info);
    }
}
