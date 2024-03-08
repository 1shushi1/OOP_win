package interfaces.sorting.difficult;

public class Sim {
    private String operator;
    private int balance;
    private double tarif;
    private String number;
    public Sim(String operator, int balance, double tarif, String number){
        this.operator = operator;
        this.balance = balance;
        this.tarif = tarif;
        this.number = number;
    }
    @Override
    public String toString(){
        return "\nOperator : " + operator + "\nBalance : " + balance + "\nTarif : " + tarif + "\nNumber : " + number;
    }
    public int getBalance(){
        return balance;
    }
    public String getOperator(){
        return operator;
    }
}
