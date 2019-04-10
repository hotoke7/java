package java_basic_11;

import java.util.HashMap;
import java.util.Map;

/**
 * Lesson Java基礎⑪（Java基礎クラス）
 * <p>
 * 【問題】
 * マップを使用して処理を実行してください。
 * 処理にはPetクラスを使用します。
 */
public class MapLesson {
    /**
     * 処理を実行するためのメインメソッド
     *
     * @param args -
     */
    public static void main(String[] args) {
        // ■ Petを格納できるMapを宣言してください。
        // キーの型はStringとしてください。
        Map<String, Pet> pets = new HashMap<>();

        // ■ 宣言したマップが空か判定し、その結果を標準出力してください。
        // 出力結果：
        // true
        System.out.println(pets.isEmpty());

        // Activityに使うPetクラスのインスタンスです。
        Pet kotarou = new Pet("コタロウ", 2);
        Pet tama = new Pet("タマ", 1);
        Pet lemon = new Pet("レモン", 3);

        // ■ 宣言したマップに上記Petクラスのインスタンスを格納してください。
        // Keyは「dog」「cat」「parrot」としてください。
        pets.put("dog", kotarou);
        pets.put("cat", tama);
        pets.put("parrot", lemon);

        // ■ マップが空か判定し、空ではない場合、マップの要素数を標準出力してください。
        // 出力結果：
        // 3
        if (!pets.isEmpty()) {
            System.out.println(pets.size());
        }

        // ■ マップから「dog」キーに対応する値を取得し、intruduceメソッドを呼び出してください。
        // 実行結果：
        // コタロウです。2才です。
        pets.get("dog").intruduce();

        // ■ マップから「cat」キーに対応する値を削除してください。
        pets.remove("cat");

        // ■ 拡張for文を使って、マップに収納されている全てのインスタンスのnameをキーと一緒に標準出力してください。
        // 実行結果：
        // dog : コタロウ
        // parrot : レモン
        for (String key : pets.keySet()) {
            System.out.println(key + " : " + pets.get(key).getName());
        }
    }
}
