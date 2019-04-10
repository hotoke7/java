package java_basic_10;

/**
 * 電気のリモコンを表すクラス。
 */
public class LightRemoteControl implements RemoteControl {

    /**
     * 電気をつけると標準出力する。
     */
    @Override
    public void turnOn() {
        System.out.println("電気をつけました。");
    }

    /**
     * 電気を消すと標準出力する。
     */
    @Override
    public void turnOff() {
        System.out.println("電気を消しました。");
    }
}