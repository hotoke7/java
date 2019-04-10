package java_basic_10;

/**
 * 人を表すクラス
 */
public class Person {

    /**
     * RemoteControlインターフェースのメソッド「turnOn」を実行する。
     *
     * @param remoteControl RemoteControlインターフェースを実装したクラスのインスタンス
     */
    public void pressOnButton(RemoteControl remoteControl) {
        remoteControl.turnOn();
    }

    /**
     * RemoteControlインターフェースのメソッド「turnOff」を実行する。
     *
     * @param remoteControl RemoteControlインターフェースを実装したクラスのインスタンス
     */
    public void pressOffButton(RemoteControl remoteControl) {
        remoteControl.turnOff();
    }

    /**
     * VolumeAdjustableインターフェースのメソッド「volumeUp」を実行する。
     *
     * @param volumeAdjustable VolumeAdjustableインターフェースを実装したクラスのインスタンス
     */
    public void pressVolumeUpButton(VolumeAdjustable volumeAdjustable) {
        volumeAdjustable.volumeUp();
    }

    /**
     * VolumeAdjustableインターフェースのメソッド「volumeDown」を実行する。
     *
     * @param volumeAdjustable VolumeAdjustableインターフェースを実装したクラスのインスタンス
     */
    public void pressVolumeDownButton(VolumeAdjustable volumeAdjustable) {
        volumeAdjustable.volumeDown();
    }
}
