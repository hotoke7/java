package java_basic_09;

/**
 * 公衆電話を表すクラス。
 */
public class PayPhone extends Telephone {
    private int balance;

    /**
     * コンストラクタ。
     *
     * 電話番号と残高を以下の通り初期化する。
     *
     * 電話番号：引数
     * 残高：0
     *
     * @param phoneNumber 電話番号
     */
    public PayPhone(String phoneNumber) {
        super(phoneNumber);
        this.balance = 0;
    }

    /**
     * 電話をかける。
     *
     * 残高に応じて以下の処理を行う。
     * <p>
     * 残高が10円以上の場合
     *   ・電話をかけ、残高から10円を引く。
     * 残高が10円未満の場合
     *   ・残高が足りない旨標準出力する。
     *
     * @param targetNumber 相手の電話番号
     */
    @Override
    public void call(String targetNumber) {
        if (balance < 10) {
            System.out.println("残高が10円未満です。お金を入れてください。");
            return;

        }
        super.call(targetNumber);
        balance -= 10;
    }


    /**
     * 電話を切る。
     *
     * 以下の処理を行う。
     * <p>
     * ・電話を切り、お釣りを返却する旨標準出力する
     * ・残高を0にする。
     */
    @Override
    public void hangUp() {
        super.hangUp();
        System.out.println("お釣りの" + balance + "円を返します。");
        balance = 0;
    }

    /**
     * 残高の加算処理。
     *
     * 引数の値を残高に加算し、現在残高を標準出力する。
     *
     * @param money 投入金額
     */
    public void insertMoney(int money) {
        balance += money;
        System.out.println(money + "円をチャージしました。現在の残高は" + balance + "円です。");
    }
}
