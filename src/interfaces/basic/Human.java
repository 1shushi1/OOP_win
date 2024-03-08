package interfaces.basic;

public class Human {
    private String name;
    public Human(String name){
        this.name = name;
    }
    public void eat(){
        System.out.println("Human " + name + " is eating");
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return "Name : " + name;
    }
}
