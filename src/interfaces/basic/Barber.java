package interfaces.basic;

public class Barber extends Person implements Musician{
    private String barbershop;
    private String instument;
    private String sport;
    private int voiceLevel;
    public Barber(String name, int id, String barbershop, String instument, int voiceLevel, String sport){
        super(name, id);
        this.barbershop = barbershop;
        this.instument = instument;
        this.voiceLevel = voiceLevel;
        this.sport = sport;
    }
    public void playMusic(){
        System.out.println("Barber " + getName() + " is playing on " + instument);
    }
    public int getVoiceLevel(){
        return voiceLevel;
    }
    public void cutHair(){
        System.out.println("Barber " + getName() + " is cutting hair");
    }
    @Override
    public String toString(){
       return super.toString() + ". Barbershop : " + barbershop + ". Voice level : " + voiceLevel;
    }
}
