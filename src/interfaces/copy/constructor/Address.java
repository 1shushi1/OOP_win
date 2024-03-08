package interfaces.copy.constructor;

public class Address{
    private String city;
    private String street;
    private int houseNumber;
    public Address(String city, String street, int houseNumber){
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }
    public Address(Address address){
        this.city = address.city;
        this.street = address.street;
        this.houseNumber = address.houseNumber;
    }

    @Override
    public String toString(){
        return "\nCity : " + city + "\nStreet : " + street + "\nHouse number : " + houseNumber;
    }

}
