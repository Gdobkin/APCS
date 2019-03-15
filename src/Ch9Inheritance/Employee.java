package Ch9Inheritance;

public class Employee {
    public String getName() {
        return name;
    }

    private String name;
    private int years;
    public Employee(String name, int years){
        this.name = name;
        this.years = years;
    }
    public Employee(String name){
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public int getHours(){
        return 40;
    }
    public double getSalary(){
        return 40000;
    }
    public int getVacationDays(){
        return 10;
    }
    public String getVacationForm(){
        return "yellow";
    }
}
