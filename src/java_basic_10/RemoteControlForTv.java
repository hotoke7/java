package java_basic_10;

public class RemoteControlForTv implements RemoteControl, VolumeAdjustable {

    @Override
    public void turnOn() {
        System.out.println("テレビの電源をつけました。");
    }

    @Override
    public void turnOff() {
        System.out.println("テレビの電源を消しました。");
    }

    @Override
    public void volumeUp() {
        System.out.println("テレビの音量を上げました。");
    }

    @Override
    public void volumeDown() {
        System.out.println("テレビの音量を上げました。");
    }
}