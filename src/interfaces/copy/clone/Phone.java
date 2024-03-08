package interfaces.copy.clone;

public class Phone implements Cloneable{
    private String phoneNumber;
    private String operator;
    public Phone(String phoneNumber, String operator){
        this.phoneNumber = phoneNumber;
        this.operator = operator;
    }
    @Override
    public Phone clone(){
        Phone phone = new Phone(phoneNumber, operator);
        return phone;
    }
}
