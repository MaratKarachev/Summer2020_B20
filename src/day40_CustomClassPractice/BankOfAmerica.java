package day40_CustomClassPractice;

public class BankOfAmerica {
    public static void main(String[] args) {
        BankAccount Dawud = new BankAccount();
        Dawud.setAccountInfo("Saving", "Dawud Abduwali", "123455786");
        Dawud.getAccountInfo();

        Dawud.deposit(1000);

        Dawud.checkBalance();

        Dawud.withDraw(500);

        Dawud.checkBalance();

        Dawud.withDraw(100000);

        Dawud.checkBalance();
    }
}
