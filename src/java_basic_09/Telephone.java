package java_basic_09;

public class Telephone {
    private String phoneNumber;

    public Telephone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void call(String targetNumber) {
        System.out.println(targetNumber + "に電話を掛けます。");
    }

    public void answer(String oppsiteNumber) {
        System.out.println(oppsiteNumber + "から電話が来ました。電話を受けます。");
    }

    public void hangUp() {
        System.out.println("電話を切ります。");
    }
}

