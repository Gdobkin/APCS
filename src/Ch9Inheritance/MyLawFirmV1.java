package Ch9Inheritance;


public class MyLawFirmV1 {
    public static void main(String[] args) {
        Employee gaby = new Lawyer("ki");
        Employee andrew = new Secretary("k");
        Employee charlie = new Marketer("k");

        printInfo(gaby);
        printInfo(andrew);
        printInfo(charlie);
    }
    public static void printInfo(Employee staff){
        System.out.println("salary: "+staff.getSalary());
        System.out.println("vacation: "+staff.getVacationDays());
    }

}
