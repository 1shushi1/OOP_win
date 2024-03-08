package interfaces.parking;

public final class BMWX5 extends Car implements SUV{
    public BMWX5(){
        super("BMW", "X5", "SUV");
    }
    @Override
    public String getType(){
        return getClass().getSimpleName();
    }
}
