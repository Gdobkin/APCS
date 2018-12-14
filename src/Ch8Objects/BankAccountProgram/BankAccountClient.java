package Ch8Objects.BankAccountProgram;

import Ch8Objects.HW1102.BankAccount;

public class BankAccountClient {
    public static void main(String[] args) {
        BankAccount andrew = new BankAccount("Andrew", 123456789, "123 sesame street", 20802);
        andrew.deposit(10000);
        System.out.println(andrew);
        andrew.withdraw(500);

        BankAccount gaby = new BankAccount("Gaby",914245678,"1 Thompson Place",53102,1313,1000000000);
    }


}
