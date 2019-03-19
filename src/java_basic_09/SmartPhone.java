package java_basic_09;

public class SmartPhone extends Telephone {
    public SmartPhone(String phoneNumber) {
        super(phoneNumber);
    }

    public void camera() {
        System.out.println("写真を撮ります。");
    }

    public void music() {
        System.out.println("音楽を聴きます。");
    }
}
