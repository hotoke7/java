package java_basic_09;

public class InheritanceLesson {
    // Lesson Java基礎⑨（継承）

    // 前提 以下の3クラスの型が作成された状態
    //親クラス
    //子クラス
    //mainメソッドを記載したMainクラス

    //Activity内容
    //以下の観点を盛り込んだActivityの作成をお願いします。
    //親クラスに複数のメソッドを作成する（最低3つ）
    //親クラスに、引数ありのコンストラクタを作成する
    //子クラスに、親クラスにはないメソッドを作成する（最低1つ）
    //子クラスに、コンストラクタを作成する（superで親クラスのコンストラクタを明示的に呼び出す）
    //子クラスで、親クラス持つ1メソッドをオーバーライドする
    //子クラスで、親クラス持つ1メソッドをオーバーライドする。メソッドの中で、superを使って親クラスの処理を呼び出す。

    public static void main(String[] args) {
        String payPhoneNumber = "080-0000-0000";
        String smartPhoneNumber = "090-1111-1111";

        //Mainクラスで、子クラスのインスタンスを生成する
        PayPhone payPhone = new PayPhone(payPhoneNumber);
        Telephone mobilePhone = new SmartPhone(smartPhoneNumber);

        Telephone publicPhone = payPhone;

        //Mainクラスで、次の4つのメソッドを呼び出す。
        // ①親クラスのメソッド、
        //
        mobilePhone.call(payPhoneNumber);
        publicPhone.answer(smartPhoneNumber);

        // ②子クラスのメソッド、

        SmartPhone smartPhone = (SmartPhone) mobilePhone;
        smartPhone.camera();
        smartPhone.music();

        // ③子クラスでオーバーライドしたメソッド、
        payPhone.call(smartPhoneNumber);
        payPhone.insertMoney(50);

        // ④子クラスでオーバーライドし、superを使って親クラスの処理を呼び出すメソッド
        payPhone.call(smartPhoneNumber);
        payPhone.hangUp();
    }
}
