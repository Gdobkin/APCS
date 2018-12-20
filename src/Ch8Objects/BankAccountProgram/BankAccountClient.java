package Ch8Objects.BankAccountProgram;

public class BankAccountClient {
    public static void main(String[] args) {
        Address home = new Address(123,"sesame street","Larchmont","NY", 10538);
        Dob birthday = new Dob(2,8,02);
        BankAccount andrew = new BankAccount("Andrew", 123456789, home, birthday);
        andrew.deposit(10000);
        System.out.println(andrew);
        andrew.withdraw(500);
        BankAccount gaby = new BankAccount("Gaby",914245678, home, birthday,1313,1000000000);
    }


}
