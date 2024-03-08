package staticky;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Stella";
        cat.age = 8;
        cat.meow();

        System.out.println(Cat.getCatCounter());
    }
}
