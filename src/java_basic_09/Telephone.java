package java_basic_09;

/**
 * 電話を表すクラス。
 */
public class Telephone {
    private String phoneNumber;

    /**
     * コンストラクタ。
     *
     * 電話番号を初期化する。
     *
     * @param phoneNumber 電話番号
     */
    public Telephone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * 電話をかけると標準出力処理を行う。
     *
     * @param targetNumber 相手の電話番号
     */
    public void call(String targetNumber) {
        System.out.println(phoneNumber + "から" + targetNumber + "に電話をかけます。");
    }

    /**
     * 電話を取ると標準出力処理を行う。
     */
    public void answer() {
        System.out.println("電話を取ります。");
    }

    /**
     * 電話を切ると標準出力処理を行う。
     */
    public void hangUp() {
        System.out.println("電話を切ります。");
    }

}

