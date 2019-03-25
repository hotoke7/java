package java_basic_10;

public class LightRemoteControl implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("電気をつけました。");
    }

    @Override
    public void turnOff() {
        System.out.println("電気を消しました。");
    }
}