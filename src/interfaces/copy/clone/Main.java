package interfaces.copy.clone;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Oleksii", new Date(2004-1900, 7, 19), new Address("Lutsk", "RomanaShuhevycha", 10));
        Person personClone = person.clone();
        System.out.println(person);
        System.out.println("\nClone");
        System.out.println(personClone);
    }
}
