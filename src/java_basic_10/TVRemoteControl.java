package java_basic_10;

/**
 * テレビのリモコンを表すクラス
 */
public class TVRemoteControl implements RemoteControl, VolumeAdjustable {
    /**
     * 抽象メソッド「turnOn」をオーバライドし、文字列の標準出力処理を行う。
     * 出力内容：
     * テレビの電源をつけました。
     */
    @Override
    public void turnOn() {
        System.out.println("テレビの電源をつけました。");
    }

    /**
     * 抽象メソッド「turnOff」をオーバライドし、文字列の標準出力処理を行う。
     * 出力内容：
     * テレビの電源を消しました。
     */
    @Override
    public void turnOff() {
        System.out.println("テレビの電源を消しました。");
    }

    /**
     * 抽象メソッド「volumeUp」をオーバライドし、文字列の標準出力処理を行う。
     * 出力内容：
     * テレビの音量を上げました。
     */
    @Override
    public void volumeUp() {
        System.out.println("テレビの音量を上げました。");
    }

    /**
     * 抽象メソッド「volumeDown」をオーバライドし、文字列の標準出力処理を行う。
     * 出力内容：
     * テレビの音量を下げました。
     */
    @Override
    public void volumeDown() {
        System.out.println("テレビの音量を下げました。");
    }
}