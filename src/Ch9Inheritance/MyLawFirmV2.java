package Ch9Inheritance;


public class MyLawFirmV2 {
    public static void main(String[] args) {
        Employee[] myEmployees = {new Lawyer(), new Secretary(),new Marketer()};
        printInfo(myEmployees);
    }
    public static void printInfo(Employee[] staff) {
        for (int i = 0; i < staff.length; i++) {
            System.out.println("salary: " + staff[i].getSalary());
            System.out.println("vacation: " + staff[i].getVacationDays());
            System.out.println("form: " + staff[i].getVacationForm());
        }
    }

}
