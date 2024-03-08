package interfaces.basic;

public class Student extends Person implements Musician, Sportsman{
    private String instrument;
    private String sport;
    private String university;
    private int voiceLevel;
    public Student(String name, int id, String university, int voiceLevel, String sport, String instrument){
        super(name, id);
        this.university = university;
        this.voiceLevel = voiceLevel;
        this.instrument = instrument;
        this.sport = sport;
    }
    public void study(){
        System.out.println("Student " + getName() + " is studying in " + university);
    }
    @Override
    public void playMusic(){
        System.out.println("Student " + getName() + " is playing music on " + instrument);
    }
    @Override
    public void train(){
        System.out.println("Student " + getName() + " is " + sport);
    }
    @Override
    public int getVoiceLevel(){
        return voiceLevel;
    }
    @Override
    public String toString(){
        return super.toString() + ". University : " + university + ". Voice level : " + voiceLevel;
    }
}
