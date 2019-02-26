package Ch9Inheritance;


public class MyLawFirmV2 {
    public static void main(String[] args) {
        Employee[] myEmployees = {new Lawyer("Gaby",15), new Secretary("Teeny",69),new Marketer("Thalz",62)};

        printInfo(myEmployees);
    }
    public static void printInfo(Employee[] staff) {
        for (Employee a: staff) {
            System.out.println("name: " + a.name);
            System.out.println("salary: " + a.getSalary());
            System.out.println("vacation: " + a.getVacationDays());
            System.out.println("form: " + a.getVacationForm());
            System.out.println();
        }
    }

}
