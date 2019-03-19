package java_basic_09;

public class PayPhone extends Telephone {
    public int balance;

    public PayPhone(String phoneNumber) {
        super(phoneNumber);
        this.balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public void call(String targetNumber) {
        if (balance < 10) {
            System.out.println("残高が10円未満です。お金を入れてください。");
            return;

        }
        super.call(targetNumber);
        balance -= 10;
        System.out.println("残高は" + balance + "円です。");
    }

    @Override
    public void hangUp() {
        super.hangUp();
        System.out.println("お釣りの" + balance + "円を返します。");
        balance = 0;
    }

    public void insertMoney(int money) {
        balance += money;
        System.out.println(money + "円をチャージしました。現在の残高は" + balance + "円です。");
    }
}
