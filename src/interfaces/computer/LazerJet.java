package interfaces.computer;

public class LazerJet implements Printable{
    @Override
    public void print(String info){
        System.out.println("LazerJet printed this info : " + info);
    }
}
