package java_basic_09;

public class Telephone {
    private String phoneNumber;

    public Telephone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void call(String targetNumber) {
        System.out.println(phoneNumber + "から" + targetNumber + "に電話をかけます。");
    }

    public void answer() {
        System.out.println("電話を取ります。");
    }

    public void hangUp() {
        System.out.println("電話を切ります。");
    }

}

