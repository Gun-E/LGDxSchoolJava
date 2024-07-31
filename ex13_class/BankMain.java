package ex13_class;

public class BankMain {
    public static void main(String[] args) {
        PiggyBank piggyBank = new PiggyBank(9999999);

        piggyBank.showMoney();
        piggyBank.deposit(1);
        piggyBank.withdraw(1000000);
        piggyBank.showMoney();
    }
}
