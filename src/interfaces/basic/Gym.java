package interfaces.basic;
import java.util.ArrayList;

public class Gym {
    private ArrayList<Sportsman> sportsmanList = new ArrayList<>();
    public void addSportsmen(Sportsman s){
        sportsmanList.add(s);
    }
    public void competition(){
        for (int i = 0; i < sportsmanList.size(); i++) {
            sportsmanList.get(i).train();
        }
    }
}
