package java_basic_09;

public class Telephone {
    private String phoneNumber;

    public Telephone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void call(String targetNumber) {
        System.out.println(targetNumber + "に電話を掛けました。");
    }

    public void answer() {
        System.out.println("電話を取りました。");
    }

    public void hangUp() {
        System.out.println("電話を切りました。");
    }
}

