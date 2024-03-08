package interfaces.parking;

public final class BMWX6 extends Car implements SUV{
    public BMWX6(){
        super("BMW", "X6", "SUV");
    }
    @Override
    public String getType(){
        return getClass().getSimpleName();
    }
}
