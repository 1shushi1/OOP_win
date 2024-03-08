package interfaces.parking;

public final class Ferrari extends Car implements Sedan{
    public Ferrari(){
        super("Ferrari", "La-Ferrari", "Sedan");
    }
    @Override
    public String getType(){
        return getClass().getSimpleName();
    }
}
