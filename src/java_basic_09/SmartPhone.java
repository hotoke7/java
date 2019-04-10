package java_basic_09;

/**
 * スマートフォンを表すクラス。
 */
public class SmartPhone extends Telephone {

    /**
     * コンストラクタ。
     * <p>
     * 電話番号を初期化する。
     *
     * @param phoneNumber 電話番号
     */
    public SmartPhone(String phoneNumber) {
        super(phoneNumber);
    }

    /**
     * 写真を撮ると標準出力処理を行う。
     */
    public void takePicture() {
        System.out.println("写真を撮ります。");
    }

    /**
     * 音楽をかけると標準出力処理を行う。
     */
    public void playMusic() {
        System.out.println("音楽をかけます。");
    }
}
