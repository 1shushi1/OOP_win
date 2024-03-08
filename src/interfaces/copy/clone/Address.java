package interfaces.copy.clone;

public class Address implements Cloneable{
    private String city;
    private String street;
    private int houseNumber;
    public Address(String city, String street, int houseNumber){
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }
    @Override
    public Address clone(){
        Address address = new Address(city, street, houseNumber);
        return address;
    }
    @Override
    public String toString(){
        return "\nCity : " + city + "\nStreet : " + street + "\nHouse number : " + houseNumber;
    }
}
