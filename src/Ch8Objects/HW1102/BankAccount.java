package Ch8Objects.HW1102;

public class BankAccount {
    //state fields
    private double balance;
    private String name;
    private int acctNum;
    private int ssn;
    private int pin;
    private String address;
    private int dob;

    //overloaded constructors
    public BankAccount(String name, int ssn, String address, int dob){
        this.name=name;
        this.ssn=ssn;
        this.address=address;
        this.dob=dob;
    }
    public BankAccount(String name, int ssn, String address, int dob, int pin, int balance){
        this.name=name;
        this.ssn=ssn;
        this.address=address;
        this.dob=dob;
        this.pin=pin;
        this.balance=balance;

    }
    //getters
    public double getBalance() {
        return balance;
    }

    public int getAcctNum() {
        return acctNum;
    }

    public String getAddress() {
        return address;
    }

    public int getDob(){
        return dob;
    }

    //mutators
    public void withdraw(double amt){
        balance-=amt;
    }
    public void deposit(double amt){
        balance+=amt;
    }

    //override toString
    public String toString() {
        return "Name: "+name+"\nBalance: "+balance;
    }
}

