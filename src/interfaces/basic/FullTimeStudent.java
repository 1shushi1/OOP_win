package interfaces.basic;

public class FullTimeStudent extends Student{
    public FullTimeStudent(String name, int id, String university, int voiceLevel, String sport, String instrument){
        super(name, id, university, voiceLevel, sport, instrument);
    }
    @Override
    public String toString(){
        return super.toString();
    }
}
