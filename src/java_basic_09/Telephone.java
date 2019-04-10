package java_basic_09;

/**
 * 電話を表すクラス
 */
public class Telephone {
    private String phoneNumber;

    /**
     * 電話番号フィールドに対して、受け取った引数で初期化処理を行う。
     *
     * @param phoneNumber 電話番号
     */
    public Telephone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * 電話をかけたことを表す文字列の標準出力処理を行う。
     *
     * @param targetNumber 相手の電話番号
     */
    public void call(String targetNumber) {
        System.out.println(phoneNumber + "から" + targetNumber + "に電話をかけます。");
    }

    /**
     * 電話を取ることを表す文字列の標準出力処理を行う。
     */
    public void answer() {
        System.out.println("電話を取ります。");
    }

    /**
     * 電話を切ったことを表す文字列の標準出力処理を行う。
     */
    public void hangUp() {
        System.out.println("電話を切ります。");
    }

}

