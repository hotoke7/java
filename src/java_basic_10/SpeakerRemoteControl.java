package java_basic_10;

/**
 * スピーカーのリモコンを表すクラス
 */
public class SpeakerRemoteControl implements RemoteControl, VolumeAdjustable {
    /**
     * 抽象メソッド「turnOn」をオーバライドし、文字列の標準出力処理を行う。
     * 出力内容：
     * スピーカーの電源をつけました。
     */
    @Override
    public void turnOn() {
        System.out.println("スピーカーの電源をつけました。");
    }

    /**
     * 抽象メソッド「turnOff」をオーバライドし、文字列の標準出力処理を行う。
     * 出力内容：
     * スピーカーの電源をを消しました。
     */
    @Override
    public void turnOff() {
        System.out.println("スピーカーの電源をを消しました。");
    }

    /**
     * 抽象メソッド「volumeUp」をオーバライドし、文字列の標準出力処理を行う。
     * 出力内容：
     * スピーカーの音量を上げました。
     */
    @Override
    public void volumeUp() {
        System.out.println("スピーカーの音量を上げました。");
    }

    /**
     * 抽象メソッド「volumeDown」をオーバライドし、文字列の標準出力処理を行う。
     * 出力内容：
     * スピーカーの音量を下げました。
     */
    @Override
    public void volumeDown() {
        System.out.println("スピーカーの音量を下げました。");
    }
}
