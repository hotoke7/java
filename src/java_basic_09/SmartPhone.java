package java_basic_09;

public class SmartPhone extends Telephone {
    public SmartPhone(String phoneNumber) {
        super(phoneNumber);
    }

    public void takePicture() {
        System.out.println("写真を撮ります。");
    }

    public void playMusic() {
        System.out.println("音楽をかけます。");
    }
}
