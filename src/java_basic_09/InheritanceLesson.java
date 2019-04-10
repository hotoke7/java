package java_basic_09;

public class InheritanceLesson {
    // Lesson Java基礎⑨（継承）
    // 【問題】作成した各クラスを使って、継承の実習を行ってください。

    /**
     * 処理を実行するためのメインメソッド
     *
     * @param args -
     */
    public static void main(String[] args) {
        // PayPhone、SmartPhoneの電話番号
        String payPhoneNumber = "080-1111-1111";
        String smartPhoneNumber = "080-2222-2222";

        // ■ 各電話番号を使用して、PayPhone、SmartPhoneのインスタンスを生成してください。
        PayPhone payPhone = new PayPhone(payPhoneNumber);
        SmartPhone smartPhone = new SmartPhone(smartPhoneNumber);

        // ---------------------オーバライドしてない親のメソッドの呼び出し---------------------
        // ■ SmartPhoneのインスタンスの「call」メソッドを使用して080-3333-3333に電話をかけてください。
        // 【出力結果】
        // 080-2222-2222から080-3333-3333に電話をかけます。
        smartPhone.call("080-3333-3333");

        // ■ SmartPhoneのインスタンスの「hangUp」メソッドを呼び出して、電話をきってください。
        // 【出力結果】
        // 電話を切ります。
        smartPhone.hangUp();

        // ---------------------子クラスで作成したメソッドの呼び出し---------------------
        // ■ SmartPhoneのインスタンスの「takePicture」メソッドを呼び出して、写真を撮ってください。
        // 【出力結果】
        // 写真を撮ります。
        smartPhone.takePicture();

        // ■ SmartPhoneのインスタンスの「playMusic」メソッドを呼び出して、音楽をかけてください。
        // 【出力結果】
        // 音楽をかけます。
        smartPhone.playMusic();

        // ---------------------子クラスでオーバーライドしたメソッドの呼び出し---------------------
        // ■ PayPhoneのインスタンスの「call」メソッドを使用して080-4444-4444に電話をかけてください。
        // 【出力結果】
        // 残高が10円未満です。お金を入れてください。
        payPhone.call("080-4444-4444");

        // ■ PayPhoneのインスタンスの「insertMoney」メソッドを呼び出して、50円チャージしてください。
        // 【出力結果】
        // 50円をチャージしました。現在の残高は50円です。
        payPhone.insertMoney(50);

        // ■ PayPhoneのインスタンスの「call」メソッドを使用して080-4444-4444に電話をかけてください。
        // 【出力結果】
        // 080-1111-1111から080-4444-4444に電話をかけます。
        payPhone.call("080-4444-4444");

        // ■ PayPhoneのインスタンスの「hangUp」メソッドを呼び出して、電話をきってください。
        // 【出力結果】
        // 電話を切ります。
        // お釣りの40円を返します。
        payPhone.hangUp();

        // ---------------------アップキャストしたインスタンスのメソッド呼び出し---------------------
        // ■ PayPhoneのインスタンスの「insertMoney」メソッドを呼び出して、30円チャージしてください。
        // 【出力結果】
        // 30円をチャージしました。現在の残高は30円です。
        payPhone.insertMoney(30);

        // ■ 生成したPayPhoneクラスのインスタンスをTelephoneクラスにアップキャストしてください。
        Telephone telephone = payPhone;

        // ■ アップキャストしたインスタンスの「call」メソッドを使用して、080-4444-4444に電話をかけてください。
        // 【出力結果】
        // 080-1111-1111から080-4444-4444に電話をかけます。
        telephone.call("080-4444-4444");

        // ---------------------ダウンキャストしたインスタンスのメソッド呼び出し---------------------
        // ■ アップキャストしたインスタンスをPayPhoneクラスにダウンキャストしてください。
        PayPhone payPhoneDown = (PayPhone) telephone;

        // ■ ダウンキャストインスタンスのPayPhoneクラスの「hangUp」メソッドを呼び出してください。
        // 【出力結果】
        // 電話を切ります。
        // お釣りの20円を返します。
        payPhoneDown.hangUp();
    }
}
