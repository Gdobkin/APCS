package Ch9Inheritance;

public class Marketer extends Employee {
    public double getSalary(){
        return 50000;
    }
    public void advertise(){
        System.out.println("I'll convince you to hire my law firm");
    }
}