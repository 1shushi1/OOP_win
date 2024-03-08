package interfaces.basic;

import java.util.ArrayList;

public class MusicBand {
    private ArrayList<Musician> musicians = new ArrayList<>();
    public void addMusician(Musician m){
        musicians.add(m);
    }
    public void perform(){
        for (int i = 0; i < musicians.size(); i++) {
            musicians.get(i).playMusic();
        }
    }
}
