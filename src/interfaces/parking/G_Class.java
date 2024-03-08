package interfaces.parking;

public final class G_Class extends Car implements SUV{
    public G_Class(){
        super("Mercedes-Benz", "G-Class", "SUV");
    }
    @Override
    public String getType(){
        return getClass().getSimpleName();
    }
}
