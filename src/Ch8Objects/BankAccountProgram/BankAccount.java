package Ch8Objects.BankAccountProgram;

public class BankAccount {
    //state fields
    private double balance;
    private String name;
    private int acctNum;
    private int ssn;
    private int pin;
    private Address address;
    private DateOfBirth dob;

    //overloaded constructors
    public BankAccount(String name, int ssn, Address address, DateOfBirth dob){
        this.name=name;
        this.ssn=ssn;
        this.address=address;
        this.dob=dob;
    }
    public BankAccount(String name, int ssn, Address address, DateOfBirth dob, int pin, int balance){
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

    public Address getAddress() {
        return address;
    }

    public DateOfBirth getDob(){
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
        return "Name: "+name+" Balance: "+balance;
    }
}

