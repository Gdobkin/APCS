package Ch9Inheritance;

public class Lawyer extends Employee {
    public Lawyer(String name,int year){
        super(name,year);
    }
    public int getVacationDays(){
        return 15;
    }
    public String getVacationForm(){
        return "pink";
    }
    public void sue(){
        System.out.println("I'll see you in court!");
    }
}
