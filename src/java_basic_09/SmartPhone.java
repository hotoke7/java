package java_basic_09;

/**
 * スマートフォンを表すクラス
 */
public class SmartPhone extends Telephone {
    /**
     * 電話番号フィールドに対して、受け取った引数で初期化処理を行う。
     *
     * @param phoneNumber 電話番号
     */
    public SmartPhone(String phoneNumber) {
        super(phoneNumber);
    }

    /**
     * 写真を撮ることを表す文字列の標準出力処理を行う。
     */
    public void takePicture() {
        System.out.println("写真を撮ります。");
    }

    /**
     * 音楽をかけることを表す文字列の標準出力処理を行う。
     */
    public void playMusic() {
        System.out.println("音楽をかけます。");
    }
}
