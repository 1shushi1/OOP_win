package interfaces.copy.constructor;


import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+380968478479", "Kiyvstar");
        Phone phone2 = new Phone("+380685825858", "Kiyvstar");
        Phone phone3 = new Phone("+380985825858", "Kiyvstar");
        Person person = new Person("Sasha", new Date(2015-1900, 10, 11), new Address("Lutsk", "Chornovola", 10));
        person.addPhones(phone1);
        person.addPhones(phone2);
        person.addPhones(phone3);
        Person clone = new Person(person);
        System.out.println("Original person : \n" + person);
        System.out.println();
        System.out.println("Clone person : \n" + clone);
    }
}
