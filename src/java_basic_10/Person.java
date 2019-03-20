package java_basic_10;

public class Person {
    public void pressOnButton(RemoteControl remoteControl) {
        remoteControl.turnOn();
    }

    public void pressOffButton(RemoteControl remoteControl) {
        remoteControl.turnOff();
    }

    public void pressVolumeUpButton(VolumeAdjustable volumeAdjustable) {
        volumeAdjustable.volumeUp();
    }

    public void pressVolumeDownButton(VolumeAdjustable volumeAdjustable) {
        volumeAdjustable.volumeDown();
    }
}
