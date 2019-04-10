package java_basic_10;

/**
 * スピーカーのリモコンを表すクラス。
 */
public class SpeakerRemoteControl implements RemoteControl, VolumeAdjustable {

    /**
     * 電源をつけると標準出力する。
     */
    @Override
    public void turnOn() {
        System.out.println("スピーカーの電源をつけました。");
    }

    /**
     * 電源を消すと標準出力する。
     */
    @Override
    public void turnOff() {
        System.out.println("スピーカーの電源をを消しました。");
    }

    /**
     * 音量を上げると標準出力する。
     */
    @Override
    public void volumeUp() {
        System.out.println("スピーカーの音量を上げました。");
    }

    /**
     * 音量を下げると標準出力する。
     */
    @Override
    public void volumeDown() {
        System.out.println("スピーカーの音量を下げました。");
    }
}
