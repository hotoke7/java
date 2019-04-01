package java_basic_11;

import java.util.ArrayList;
import java.util.List;

public class ListLesson {
    public static void main(String[] args) {
        // Lesson Java基礎⑪（Java基礎クラス）

        // 【問題】リストを使ってみましょう。
        // ※　Petクラスを利用します。

        // ■ Petのインスタンスを収納する「ArrayList」を宣言してください。
        List<Pet> pets = new ArrayList<>();

        // ■ 新しく宣言したリストが空か判定し、その結果を標準出力してください。
        // 出力結果：
        // true
        System.out.println(pets.isEmpty());

        // Activityに使うPetクラスのインスタンスです。
        Pet dog = new Pet("コタロウ", 2);
        Pet cat = new Pet("タマ", 1);

        // ■ 作成したリストに上記のインスタンスを追加してください。
        pets.add(dog);
        pets.add(cat);

        // ■ リストが空か判定し、空ではない場合、リストの要素数を標準出力してください。
        // 出力結果：
        // 2
        if (!pets.isEmpty()) {
            System.out.println(pets.size());
        }

        // ■ 拡張for文を使って、リストに収納されている全てのインスタンスでintruduceメソッドを呼び出してください。
        // 実行結果：
        // コタロウです。2才です。
        // タマです。1才です。
        for (Pet pet : pets) {
            pet.intruduce();
        }
    }
}
