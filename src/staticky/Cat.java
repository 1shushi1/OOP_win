package staticky;

public class Cat {
    public static final int MAX_LIVES = 9;
    private static int catCounter = 0;
    String name;
    int age;
    int livesRemaining;
    public Cat(){
        catCounter++;
        livesRemaining = MAX_LIVES;
    }
    public void meow(){
        System.out.println("Meow");
    }
    public static int getCatCounter(){
        return catCounter;
    }
}
