package java_basic_10;

public class RemoteControlForSpeaker implements RemoteControl, VolumeAdjustable {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("スピーカーの電源をつけました。");
    }

    @Override
    public void turnOff() {
        System.out.println("スピーカーの電源をを消しました。");
    }

    @Override
    public void volumeUp() {
        System.out.println("スピーカーの音量を上げました。");
    }

    @Override
    public void volumeDown() {
        System.out.println("スピーカーの音量を下げました。");
    }
}
