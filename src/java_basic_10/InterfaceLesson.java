package java_basic_10;

public class InterfaceLesson {
    /**
     * 処理を実行するためのメインメソッド
     *
     * @param args -
     */
    public static void main(String[] args) {
        // Java基礎⑩（インターフェース）
        // 【問題】作成した各クラスを使って、リモコンを操作してみましょう。

        // ■ RemoteControlインタフェースで実装したクラスのインスタンスを生成してください。
        LightRemoteControl lightRemoteControl = new LightRemoteControl();
        TVRemoteControl tvRemoteControl = new TVRemoteControl();
        SpeakerRemoteControl speakerRemoteControl = new SpeakerRemoteControl();

        // 作成したインスタンスでメソッドを使ってみましょう。
        // 出力結果より、同じメソッドを使ったのに結果が異なることが確認できます。

        // ■ 電気とテレビ、スピーカーの電源をつけてください。
        // 出力結果：
        // 電気をつけました。
        // テレビの電源をつけました。
        // スピーカーの電源をつけました。
        lightRemoteControl.turnOn();
        tvRemoteControl.turnOn();
        speakerRemoteControl.turnOn();

        // ■ 電気とテレビ、スピーカーの電源を消してください。
        // 出力結果：
        // 電気を消しました。
        // テレビの電源を消しました。
        // スピーカーの電源をを消しました。
        lightRemoteControl.turnOff();
        tvRemoteControl.turnOff();
        speakerRemoteControl.turnOff();

        // ■ Personクラスのインスタンスを生成してください。
        Person person = new Person();

        // Personクラスのメソッドを使ってみましょう。
        // 個別のインスタンスからメソッドを呼ぶ時と同じく、振る舞いが変わったことが確認できます。

        // ■ 電気とテレビ、スピーカの電源をつけてください。
        // 出力結果：
        // 電気をつけました。
        // テレビの電源をつけました。
        // スピーカーの電源をつけました。
        person.pressOnButton(lightRemoteControl);
        person.pressOnButton(tvRemoteControl);
        person.pressOnButton(speakerRemoteControl);

        // ■ 電気とテレビ、スピーカの電源を消してください。
        // 出力結果：
        // 電気を消しました。
        // テレビの電源を消しました。
        // スピーカーの電源をを消しました。
        person.pressOffButton(lightRemoteControl);
        person.pressOffButton(tvRemoteControl);
        person.pressOffButton(speakerRemoteControl);

        // Personクラスのメソッドを使って、テレビの音量を上げ、スピーカーの音量は下げてください。
        // 出力結果：
        // テレビの音量を上げました。
        // スピーカーの音量を下げました。
        person.pressVolumeUpButton(tvRemoteControl);
        person.pressVolumeDownButton(speakerRemoteControl);
    }
}