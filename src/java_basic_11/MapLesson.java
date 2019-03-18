package java_basic_11;

import java.util.HashMap;
import java.util.Map;

public class MapLesson {
    public static void main(String[] args) {
        // Lesson Java基礎⑪（Java基礎クラス）

        // 【問題】Mapを使ってみましょう。
        // ※　Petクラスを利用します。

        // Activityに使うPetクラスのインスタンスです。
        Pet dog = new Pet("コタロウ");
        Pet cat = new Pet("タマ");
        Pet parrot = new Pet("レモン");

        // ■ 上記のインスタンスを収納する「Map」を宣言してください。
        // ※ キーはStringです。
        Map<String, Pet> pets = new HashMap<String, Pet>();

        // ■ 新しく宣言したリストが空か判定し、その結果を標準出力してください。
        // 出力結果：
        // true
        System.out.println(pets.isEmpty());

        // ■ 宣言したマップにインスタンスを収納してください。
        // Keyは「犬」「猫」「インコ」と設定してください。
        pets.put("犬", dog);
        pets.put("猫", cat);
        pets.put("インコ", parrot);

        // ■ マップが空か判定し、空ではない場合、マップの要素数を標準出力してください。
        // 出力結果：
        // マップのサイズ：3
        if (!pets.isEmpty()){
            System.out.println("マップのサイズ：" +  pets.size());
        }

        // ■ マップから「犬」キーに対応する値を取得し、sleepメソッドを呼び出してください。
        // 実行結果：
        // コタロウはソファーで寝ています。
        pets.get("犬").sleep();

        // ■ マップから「猫」キーに対応する値を削除してください。
        pets.remove("猫");

        // ■ 拡張for文を使って、マップに収納されている全てのインスタンスのnameをキーと一緒に標準出力してください。
        // 実行結果：
        // インコ : レモン
        // 犬 : コタロウ
        for (String key : pets.keySet()) {
            System.out.println(key + " : " + pets.get(key).getName());
        }
    }
}
