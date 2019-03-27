package java_basic_09;

public class InheritanceLesson {
    // Lesson Java基礎⑨（継承）
    // 【問題】作成した各クラスを使って、継承の実習を行ってください。

    public static void main(String[] args) {
        // PayPhone、SmartPhoneの電話番号
        String payPhoneNumber = "080-1111-1111";
        String smartPhoneNumber = "080-2222-2222";

        // ■ 各電話番号を使用して、PayPhone、SmartPhoneのインスタンスを生成してください。
        PayPhone payPhone = new PayPhone(payPhoneNumber);
        SmartPhone smartPhone = new SmartPhone(smartPhoneNumber);

        // オーバライドしてない親のメソッド
        // ■ SmartPhoneのインスタンスから「call」メソッドを使用して080-3333-3333に電話をかけてください。
        // 出力結果
        // 080-3333-3333に電話を掛けます。
        smartPhone.call("080-3333-3333");

        // ■ SmartPhoneのインスタンスから「hangUp」メソッドを呼び出して、電話をきってください。
        // 出力結果
        // 電話を取りました。
        smartPhone.hangUp();

        // ■ PayPhoneのインスタンスより「answer」メソッドを呼び出して、電話に出てください。
        // 出力結果
        // 電話を取りました。
        payPhone.answer();

        // ■ PayPhoneのインスタンスより「hangUp」メソッドを呼び出して、電話にきってください。
        // 出力結果
        // 電話を取りました。
        payPhone.hangUp();

        // 子クラスで生成したメソッド
        // ■ SmartPhoneのインスタンスより「takePicture」「playMusic」メソッドを呼び出してください。
        // 出力結果
        // 写真を撮ります。
        // 音楽をかけます。
        smartPhone.takePicture();
        smartPhone.playMusic();

        // 子クラスでオーバーライドしたメソッド
        // ■ PayPhoneのインスタンスより「call」メソッドを使用して080-4444-4444に電話をかけてください。
        // 出力結果
        // 残高が10円未満です。お金を入れてください。
        payPhone.call("080-4444-4444");

        // ■ PayPhoneのインスタンスより「insertMoney」メソッドを呼び出してください。
        // 引数として整数型「50」を渡してください。
        // 出力結果
        // 50円をチャージしました。現在の残高は50円です。
        payPhone.insertMoney(50);

        // 子クラスでオーバーライドしたメソッド
        // ■ PayPhoneのインスタンスより「call」メソッドを使用して080-4444-4444に電話をかけてください。
        // 出力結果
        // 080-4444-4444に電話を掛けました。
        // 残高は40円です。
        payPhone.call("080-4444-4444");

        // 子クラスでオーバーライドしたメソッド
        // 出力結果
        // 電話を切りました。
        // お釣りの40円を返します。
        payPhone.hangUp();

        // アップキャスト
        // ■ 生成したPayPhoneクラスのインスタンスをTelephoneクラスにアップキャストしてください。
        Telephone telephone = payPhone;

        // ■ アップキャストしたインスタンスよりPayPhoneクラスの「call」メソッドを呼び出してください。
        // 出力結果
        // 080-0000-0000に電話を掛けました。
        // 残高は40円です。
        telephone.call("080-4444-4444");

        // ダウンキャスト
        // ■ アップキャストしたインスタンスをまたPayPhoneクラスにダウンキャストしてください。
        PayPhone payPhoneDown = (PayPhone) telephone;

        // ■ ダウンキャストインスタンスよりPayPhoneクラスの「hangUp」メソッドを呼び出してください。
        // 出力結果
        // 電話を切りました。
        // お釣りの40円を返します。
        payPhoneDown.hangUp();
    }
}
