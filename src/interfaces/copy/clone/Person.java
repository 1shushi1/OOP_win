package interfaces.copy.clone;

import java.util.ArrayList;
import java.util.Date;

public class Person implements Cloneable{
    private String name;
    private Date date;
    private Address address;
    private ArrayList<Phone> phones = new ArrayList<>();
    public Person(String name, Date date, Address address){
        this.name = name;
        this.date = date;
        this.address = address;
    }
    public void addPhones(Phone phone){
        if (!phones.contains(phone)){
            phones.add(phone);
        }
    }
    @Override
    public Person clone(){
        Person person = new Person(name, date, address);
        for (int i = 0; i < phones.size() ; i++) {
            addPhones(phones.get(i).clone());
        }
        return person;
    }
    @Override
    public String toString(){
        return "Name : " + name + "\nDate : " + date + "\nAddress" + address;
    }
}
