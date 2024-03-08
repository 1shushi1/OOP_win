package interfaces.basic;

public class Person extends Human{
    private int id;
    public Person(String name, int id){
        super(name);
        this.id = id;
    }
    private void vote(){
        System.out.println("Student with name : " + super.getName() + " voting");
    }
    public int getId(){
        return id;
    }
    @Override
    public String toString(){
        return super.toString() + ". ID : " + id;
    }
}
