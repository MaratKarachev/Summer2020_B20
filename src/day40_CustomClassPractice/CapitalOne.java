package day40_CustomClassPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {

    public static void main(String[] args) {

        BankAccount Beslan = new BankAccount();
        BankAccount Ahmet = new BankAccount();
        BankAccount Viorel = new BankAccount();
        BankAccount Nurmamet = new BankAccount();
        BankAccount Waqar = new BankAccount();

        Beslan.setAccountInfo("Checking", "Beslan", "4567890123");
        Ahmet.setAccountInfo("Checking", "Ahmet", "12453433212");
        Viorel.setAccountInfo("Checking", "Viorel", "963259741");
        Nurmamet.setAccountInfo("Checking", "Nurmamet", "741258963");
        Waqar.setAccountInfo("Checking", "Waqar", "852147963");

        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.addAll(Arrays.asList(Beslan, Ahmet, Viorel, Nurmamet, Waqar));

        for (BankAccount each : accounts) {
            each.deposit(500);
            each.getAccountInfo();
        }

        accounts.get(3).deposit(1000);
        accounts.get(3).checkBalance();
        accounts.get(3).withDraw(1000);
        accounts.get(3).checkBalance();

        accounts.get(4).deposit(600);
        accounts.get(4).checkBalance();

        System.out.println("************************************");

        accounts.removeIf(each->each.balance<1000);
        for(BankAccount each: accounts){
            each.getAccountInfo();

        }

    }
}
