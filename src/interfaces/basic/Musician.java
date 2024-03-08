package interfaces.basic;

import java.util.ArrayList;

public interface Musician{
    String INSTUMENT1 = "Balalaika";
    String INSTUMENT2 = "Guitar";
    String INSTUMENT3 = "Piano";

    void playMusic();
    default void rehearsal(){
        System.out.println("Musician is rehearsing");
    }
    int getVoiceLevel();
    static Musician theMostLoudMusician(ArrayList<Musician> musicians){
        Musician musician = musicians.get(0);
        for (int i = 0; i < musicians.size(); i++) {
            if (musicians.get(i).getVoiceLevel() > musician.getVoiceLevel()){
                musician = musicians.get(i);
            }
        }
        return musician;
    }
}
