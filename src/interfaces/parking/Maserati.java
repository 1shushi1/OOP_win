package interfaces.parking;

public final class Maserati extends Car implements Sedan{
    public Maserati(){
        super("Maserati", "Levante", "SUV");
    }
    @Override
    public String getType(){
        return getClass().getSimpleName();
    }
}
