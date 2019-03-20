package java_basic_10;

public class InterfaceLesson {
    public static void main(String[] args) {
        // Java基礎⑩（インターフェース）
        // 【問題】作成した各クラスを使って、リモコンを操作してみましょう。

        // ■ RemoteControlインタフェースで実装したクラスのインスタンスを生成してください。
        RemoteControlForLight remoteControlForLight = new RemoteControlForLight();
        RemoteControlForTv remoteControlForTv = new RemoteControlForTv();
        RemoteControlForSpeaker remoteControlForSpeaker = new RemoteControlForSpeaker();

        // 作成したインスタンスでメソッドを使ってみましょう。
        // 出力結果より、同じメソッドを使ったのに結果が異なることが確認できます。

        // ■ 電気とテレビ、スピーカーの電源をつけてください。
        // 出力結果：
        // 電気をつけました。
        // テレビの電源をつけました。
        // スピーカーの電源をつけました。
        remoteControlForLight.turnOn();
        remoteControlForTv.turnOn();
        remoteControlForSpeaker.turnOn();

        // ■ 電気とテレビ、スピーカーの電源を消してください。
        // 出力結果：
        // 電気を消しました。
        // テレビの電源を消しました。
        // スピーカーの電源をを消しました。
        remoteControlForLight.turnOff();
        remoteControlForTv.turnOff();
        remoteControlForSpeaker.turnOff();

        // ■ Personクラスのインスタンスを生成してください。
        Person person = new Person();

        // Personクラスのメソッドを使ってみましょう。
        // 個別のインスタンスからメソッドを呼ぶ時と同じく、振る舞いが変わったことが確認できます。

        // ■ 電気とテレビ、スピーカの電源をつけてください。
        // 出力結果：
        // 電気をつけました。
        // テレビの電源をつけました。
        // スピーカーの電源をつけました。
        person.pressOnButton(remoteControlForLight);
        person.pressOnButton(remoteControlForTv);
        person.pressOnButton(remoteControlForSpeaker);

        // ■ 電気とテレビ、スピーカの電源を消してください。
        // 出力結果：
        // 電気を消しました。
        // テレビの電源を消しました。
        // スピーカーの電源をを消しました。
        person.pressOffButton(remoteControlForLight);
        person.pressOffButton(remoteControlForTv);
        person.pressOffButton(remoteControlForSpeaker);

        // Personクラスのメソッドを使って、テレビの音量を上げ、スピーカーの音量は下げてください。
        // 出力結果：
        // テレビの音量を上げました。
        // スピーカーの音量を下げました。
        person.pressVolumeUpButton(remoteControlForTv);
        person.pressVolumeDownButton(remoteControlForSpeaker);
    }
}