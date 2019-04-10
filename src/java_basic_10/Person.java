package java_basic_10;

/**
 * 人を表すクラス。
 */
public class Person {

    /**
     * turnOnを実行する。
     *
     * @param remoteControl RemoteControlの具象クラス
     */
    public void pressOnButton(RemoteControl remoteControl) {
        remoteControl.turnOn();
    }

    /**
     * turnOffを事項する。
     *
     * @param remoteControl RemoteControlの具象クラス
     */
    public void pressOffButton(RemoteControl remoteControl) {
        remoteControl.turnOff();
    }

    /**
     * volumeUpを実行する。
     *
     * @param volumeAdjustable VolumeAdjustableの具象クラス
     */
    public void pressVolumeUpButton(VolumeAdjustable volumeAdjustable) {
        volumeAdjustable.volumeUp();
    }

    /**
     * volumeDownを実行する。
     *
     * @param volumeAdjustable VolumeAdjustableの具象クラス
     */
    public void pressVolumeDownButton(VolumeAdjustable volumeAdjustable) {
        volumeAdjustable.volumeDown();
    }
}
