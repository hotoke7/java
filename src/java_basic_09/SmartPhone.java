package java_basic_09;

public class SmartPhone extends Telephone {
    public SmartPhone(String phoneNumber) {
        super(phoneNumber);
    }

    public void takePictures() {
        System.out.println("写真を撮りました。");
    }

    public void listenToTheMusic() {
        System.out.println("音楽をかけました。");
    }
}
