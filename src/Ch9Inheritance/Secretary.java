package Ch9Inheritance;

public class Secretary extends Employee {
    public Secretary(String name,int year){
        super(name,year);
    }
    public void getDictation(String text){
        System.out.println("I can file all day..." + text);
    }
}
