package java_basic_10;

public class InterfaceLesson {
    public static void main(String[] args) {
        // Java基礎⑩（インターフェース）
        // 【問題】作成したクラスを利用して、リモコンを操作してみましょう。

        // ■ RemoteControlインタフェースで実装したクラスのインスタンスを生成してください。
        RemoteControlForLight remoteControlForLight = new RemoteControlForLight();
        RemoteControlForTv remoteControlForTv = new RemoteControlForTv();
        RemoteControlForSpeaker remoteControlForSpeaker = new RemoteControlForSpeaker();

        // ■ 作成したインスタンスでメソッドを使ってみましょう。
        // 電気とテレビを消して、スピーカーの電源を付けてください。
        // 出力結果：
        // 電気をつけました。
        // テレビの電源を消しました。
        // スピーカーの電源をを消しました。
        remoteControlForLight.turnOn();
        remoteControlForTv.turnOff();
        remoteControlForSpeaker.turnOff();

        // ■ Personクラスのインスタンスを生成してください。
        Person person = new Person();

        // Personクラスのメソッドを使って、電気とテレビの電源を付けてください。
        // 出力結果：
        // 電気を消しました。
        // テレビの電源をつけました。
        // スピーカーの電源をつけました。
        person.pressOffButton(remoteControlForLight);
        person.pressOnButton(remoteControlForTv);
        person.pressOnButton(remoteControlForSpeaker);

        // Personクラスのメソッドを使って、テレビの音量を上げ、スピーカーの音量は下げてください。
        // 出力結果：
        // テレビの音量を上げました。
        // スピーカーの音量を下げました。
        person.pressVolumeUpButton(remoteControlForTv);
        person.pressVolumeDownButton(remoteControlForSpeaker);
    }
}