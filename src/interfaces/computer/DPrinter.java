package interfaces.computer;

public class DPrinter implements Printable{
    @Override
    public void print(String info){
        System.out.println("DPrinter printed this info : " + info);
    }
}
