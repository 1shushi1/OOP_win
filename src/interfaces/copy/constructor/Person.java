package interfaces.copy.constructor;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Person {
    private String name;
    private Date date;
    private Address address;
    private ArrayList<Phone> phones = new ArrayList<>();

    public Person(String name, Date date, Address address) {
        this.name = name;
        this.date = date;
        this.address = address;
    }

    public Person(Person original) {
        this.name = original.name;
        this.date = original.date;
        this.address = new Address(original.address);
        for(Phone phone : original.phones){
            this.phones.add(new Phone(phone));
        }
    }

    public void addPhones(Phone phone) {
        if (!phones.contains(phone)) {
            phones.add(phone);
        }
    }

    @Override
    public String toString() {
        String empty = "";
        for (int i = 0; i < phones.size(); i++) {
            empty += phones.get(i) + "\n";
        }
        return "Name : " + name + "\nDate : " + date + "\nAddress : " + address + "\nPhones : \n" + empty;
    }
}

