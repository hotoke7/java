package java_basic_10;

public class InterfaceLesson {
    public static void main(String[] args) {
        // Java基礎⑩（インターフェース）
        // 【問題】作成した自動販売機クラスを利用して、自動販売機から物を購入してみましょう。

        //    前提
        //    以下のインターフェース・クラスの型が作成された状態
        //            インターフェース
        //            インターフェースを実装したクラスA
        //            インターフェースを実装したクラスB
        //            mainメソッドを記載したMainクラス
        //    Activity内容
        //    以下の観点を盛り込んだActivityの作成をお願いします。
        //    インターフェースに抽象メソッドを作成する
        //    インターフェースを実装したクラスAで、抽象メソッドをオーバーライドする
        //    インターフェースを実装したクラスBで、抽象メソッドをオーバーライドする
        //            mainメソッドからクラスAとクラスBの処理を呼び出す

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