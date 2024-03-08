package interfaces.parking;

import java.util.ArrayList;

public class Parking {
    private Dispetcher dispetcher = new Dispetcher();
    private ArrayList<Sedan> sedans = new ArrayList<>();
    private ArrayList<SUV> SUVs = new ArrayList<>();
    @Override
    public String toString(){
        String empty = "Sedans : \n";
        for (int i = 0; i < sedans.size(); i++) {
            empty += sedans.get(i).getType() + "\n";
        }
        empty = empty + "SUV's : \n";
        for (int i = 0; i < SUVs.size(); i++) {
            empty += SUVs.get(i).getType() + "\n";
        }
        return empty;
    }
    public void dispetch(Car car){
        dispetcher.typeChecker(car);
    }
    class Dispetcher{
        public void typeChecker(Car car){
            if (car instanceof Sedan){
                sedans.add((Sedan) car);
            } else {
                SUVs.add((SUV) car);
            }
        }
    }
}
