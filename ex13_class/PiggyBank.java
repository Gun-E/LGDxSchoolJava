package ex13_class;

public class PiggyBank {
    private int money;

    public PiggyBank() {
    }

    public PiggyBank(int money) {
        this.money = money;
    }


    public void deposit(int money) {
        this.money += money;
        System.out.print("입금 후 ");
        showMoney();
    }

    public void withdraw(int money) {
        this.money -= money;
        System.out.print("인출 후 ");
        showMoney();
    }

    public void showMoney() {
        System.out.println("잔액은 " + money + "원 입니다.");
    }
}
