package interfaces.computer;

public class InkJet implements Printable{
    @Override
    public void print(String info){
        System.out.println("InkJet printed this info : " + info);
    }
}
