package java_basic_10;

/**
 * テレビのリモコンを表すクラス。
 */
public class TVRemoteControl implements RemoteControl, VolumeAdjustable {

    /**
     * 電源をつけると標準出力する。
     */
    @Override
    public void turnOn() {
        System.out.println("テレビの電源をつけました。");
    }

    /**
     * 電源を消すと標準出力する。
     */
    @Override
    public void turnOff() {
        System.out.println("テレビの電源を消しました。");
    }

    /**
     * 音量を上げると標準出力する。
     */
    @Override
    public void volumeUp() {
        System.out.println("テレビの音量を上げました。");
    }

    /**
     * 音量を下げると標準出力する。
     */
    @Override
    public void volumeDown() {
        System.out.println("テレビの音量を下げました。");
    }
}