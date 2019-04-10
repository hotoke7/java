package java_basic_10;

/**
 * リモコンを表すインターフェース
 */
interface RemoteControl {
    /**
     * 電源をつけることを示す抽象メソッド
     */
    void turnOn();

    /**
     * 電源を消すことを示す抽象メソッド
     */
    void turnOff();
}