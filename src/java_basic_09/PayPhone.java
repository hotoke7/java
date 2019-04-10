package java_basic_09;

/**
 * 公衆電話を表すクラス
 */
public class PayPhone extends Telephone {
    private int balance;

    /**
     * 各フィールドに対して初期化処理を行う。
     * 各フィールドの初期値は以下となる。
     * 電話番号フィールド：引数
     * 残高フィールド：0
     *
     * @param phoneNumber 電話番号
     */
    public PayPhone(String phoneNumber) {
        super(phoneNumber);
        this.balance = 0;
    }

    /**
     * 残高の値に応じて標準出力処理を行い、処理を終了または残高フィールドを更新する。
     * <p>
     * 残高によって以下の動作を行う。
     * 残高が10円以上の場合、以下の動作を行う。
     * ・親のCallメソッドを呼び出す。
     * ・残高から10円を引く。
     * 残高が10円未満の場合、以下の動作を行う。
     * ・以下の内容を標準出力する。
     * ・残高が10円未満です。お金を入れてください。
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
     * 残高の値と文字列の標準出力処理を行い、残高を更新する。
     * <p>
     * 親のhangUpメソッドを呼び出す。
     * 以下の内容を標準出力する。
     * ・出力内容：お釣りの「残高」円を返します。
     * 。残高を0にする。
     */
    @Override
    public void hangUp() {
        super.hangUp();
        System.out.println("お釣りの" + balance + "円を返します。");
        balance = 0;
    }

    /**
     * 残高の値を更新し、文字列の標準出力処理を行う。
     * <p>
     * 残高に投入金額を加算し、投入金額と更新後の残高を標準出力する。
     *
     * @param money 投入金額
     */
    public void insertMoney(int money) {
        balance += money;
        System.out.println(money + "円をチャージしました。現在の残高は" + balance + "円です。");
    }
}
