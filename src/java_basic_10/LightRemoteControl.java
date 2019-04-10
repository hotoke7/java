package java_basic_10;

/**
 * 電気のリモコンを表すクラス
 */
public class LightRemoteControl implements RemoteControl {
    /**
     * 抽象メソッド「turnOn」をオーバライドし、文字列の標準出力処理を行う。
     * 出力内容：
     * 電気をつけました。
     */
    @Override
    public void turnOn() {
        System.out.println("電気をつけました。");
    }

    /**
     * 抽象メソッド「turnOff」をオーバライドし、文字列の標準出力処理を行う。
     * 出力内容：
     * 電気を消しました。
     */
    @Override
    public void turnOff() {
        System.out.println("電気を消しました。");
    }
}