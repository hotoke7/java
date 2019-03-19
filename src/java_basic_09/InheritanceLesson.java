package java_basic_09;

public class InheritanceLesson {
    // Lesson Java基礎⑨（継承）
    // 【問題】作成した各クラスを使って、継承の実習を行ってください。

    public static void main(String[] args) {
        // Telephoneクラスのメソッドを呼び出すときに使く電話番号です。
        // 頻繁に使う為、変数を作成しておきました。
        String phoneNumber = "080-0000-0000";

        // ■ 子クラス（PayPhone、SmartPhone）のインスタンスを生成してください。
        PayPhone payPhone = new PayPhone(phoneNumber);
        SmartPhone smartPhone = new SmartPhone(phoneNumber);

        // オーバライドしてない親のメソッド
        // ■ SmartPhoneのインスタンスより「call」メソッドを呼び出してください。
        // 出力結果
        // 080-0000-0000に電話を掛けました。
        smartPhone.call(phoneNumber);

        // ■ PayPhoneのインスタンスより「answer」メソッドを呼び出してください。
        // 出力結果
        // 電話を取りました。
        payPhone.answer();

        // 子クラスで生成したメソッド
        // ■ SmartPhoneのインスタンスより「takePictures」「listenToTheMusic」メソッドを呼び出してください。
        // 出力結果
        // 写真を撮りました。
        // 音楽をかけました。
        smartPhone.takePictures();
        smartPhone.listenToTheMusic();

        // 子クラスでオーバーライドしたメソッド
        // ■ PayPhoneのインスタンスより「call」メソッドを呼び出してください。
        // 出力結果
        // 残高が10円未満です。お金を入れてください。
        payPhone.call(phoneNumber);

        // ■ PayPhoneのインスタンスより「insertMoney」メソッドを呼び出してください。
        // 引数として整数型「50」を渡してください。
        // 出力結果
        // 50円をチャージしました。現在の残高は50円です。
        payPhone.insertMoney(50);

        // 子クラスでオーバーライドし、親クラスの処理を呼び出すメソッド
        // アップキャスト
        // ■ 生成したPayPhoneクラスのインスタンスをTelephoneクラスにアップキャストしてください。
        Telephone payPhoneUp = payPhone;

        // ■ アップキャストしたインスタンスよりPayPhoneクラスの「call」メソッドを呼び出してください。
        // 出力結果
        // 080-0000-0000に電話を掛けました。
        // 残高は40円です。
        payPhoneUp.call(phoneNumber);

        // ダウンキャスト
        // ■ アップキャストしたインスタンスをまたPayPhoneクラスにダウンキャストしてください。
        PayPhone payPhoneDown = (PayPhone) payPhoneUp;

        // ■ ダウンキャストインスタンスよりPayPhoneクラスの「hangUp」メソッドを呼び出してください。
        // 出力結果
        // 電話を切りました。
        // お釣りの40円を返します。
        payPhoneDown.hangUp();
    }
}
