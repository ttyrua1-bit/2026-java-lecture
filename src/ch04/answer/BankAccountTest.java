package ch04.answer;

public class BankAccountTest {
    static void main() {
        BankAccount bank01 = new BankAccount("이재헌",50000);

         bank01.deposit(5000);
         bank01.withdraw(57000);
         bank01.showBalance();



    }
}
