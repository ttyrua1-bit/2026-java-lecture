package ch04.answer;

public class BankAccount {

    String owner;
    int balance;

    int money;


    BankAccount(String owner,int balance){
        this.owner = owner;
        this.balance = balance;
    }

    void deposit(int money){

        balance += money;

        System.out.println("잔액을 입금하였습니다. ");
    }

    void withdraw(int money){
        if(balance<money){
            System.out.println("잔액이 부족합니다.");
        }
        else {
            balance -= money;
            System.out.println("잔액 "+money+"원을 출금하였습니다.");
        }

    }

    void showBalance(){
        System.out.println("통장의 잔액은 "+balance+" 원입니다.");
    }




}
