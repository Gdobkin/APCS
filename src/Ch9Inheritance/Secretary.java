package Ch9Inheritance;

public class Secretary extends Employee {
    public Secretary(String name){
        super(name);
    }
    public void getDictation(String text){
        System.out.println("I can file all day..." + text);
    }
}
