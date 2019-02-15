package Ch9Inheritance;


public class MyLawFirmV1 {
    public static void main(String[] args) {
        Employee gaby = new Lawyer();
        Employee andrew = new Secretary();
        Employee charlie = new Marketer();

        printInfo(gaby);
        printInfo(andrew);
        printInfo(charlie);
    }
    public static void printInfo(Employee staff){
        System.out.println("salary: "+staff.getSalary());
        System.out.println("vacation: "+staff.getVacationDays());
    }

}
