package interfaces.basic;

public interface Sportsman {
    public static final String SPORT_TYPE1 = "Powerlifting";
    String SPORT_TYPE2 = "Running";
    void train();
    default void workOut(){
        System.out.println(getName() + " is working out");
    }
    String getName();
}
