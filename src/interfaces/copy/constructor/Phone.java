package interfaces.copy.constructor;

public class Phone{
    private String phoneNumber;
    private String operator;
    public Phone(Phone originalPhone){
        this.phoneNumber = originalPhone.phoneNumber;
        this.operator = originalPhone.operator;
    }
    public Phone(String phoneNumber, String operator){
        this.phoneNumber = phoneNumber;
        this.operator = operator;
    }
    @Override
    public boolean equals(Object object){
        if (this == object){
            return true;
        }
        if (object == null){
            return false;
        }
        if (!(object instanceof Phone)){
            return false;
        }
        Phone phone = (Phone) object;
        if (phoneNumber == phone.phoneNumber && operator == phone.operator){
            return true;
        }
        return false;
    }
    @Override
    public int hashCode(){
        int hashCode = 81;
        hashCode = 81 * hashCode + phoneNumber.hashCode();
        hashCode = 81 * hashCode + operator.hashCode();
        return hashCode;
    }
    @Override
    public String toString(){
        return "Phone number : " + phoneNumber + "\nOperator : " + operator;
    }
}
