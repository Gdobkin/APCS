package Ch8Objects.BankAccountProgram;

public class BankAccountClient {
    public static void main(String[] args) {
        BankAccount andrew = new BankAccount("Andrew", 123456789, new Address(123,"sesame street","Larchmont","NY", 10538), new DateOfBirth(2,8,02));
        andrew.deposit(10000);
        System.out.println(andrew);
        andrew.withdraw(500);
        BankAccount gaby = new BankAccount("Gaby",914245678, new Address(123,"sesame street","Larchmont","NY", 10538), new DateOfBirth(2,8,02),1313,1000000000);
    }


}
