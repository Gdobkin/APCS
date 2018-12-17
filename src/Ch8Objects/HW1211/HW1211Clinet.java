package Ch8Objects.HW1211;

public class HW1211Clinet {
    public static void main(String[] args) {
        Student gaby= new Student("gaby",11,4.0,053102,
                "1000 W Boston Post Road","Cuddy",0,'F');
        System.out.println(gaby);
        Bicycle sparky = new Bicycle(1000, false, "new",10,"red");
        System.out.println(sparky);
        BankAccount highSchoolChecking = new BankAccount("Gaby",1234567779,
                "1 Thompson Place",070502,1111,3000);
        System.out.println(highSchoolChecking);
    }
}
