package interfaces.basic;

public class PartTimeStudent extends Student implements Tractorist{

    public PartTimeStudent(String name, int id, String university, int voiceLevel, String sport, String instrument){
        super(name, id, university, voiceLevel, sport, instrument);
    }
    public void notStudy(){
        System.out.println("Part time student " + getName() + " is not studying");
    }
    @Override
    public void driveTractor(){
        System.out.println("Part time student " + getName() + " is driving tractor");
    }
    @Override
    public void fix(){
        System.out.println("Part time student " + getName() + " is fixing tractor");
    }
    @Override
    public void drive(){
        System.out.println("Part time student " + getName() + " is driving");
    }
    @Override
    public String toString(){
        return super.toString();
    }
}
