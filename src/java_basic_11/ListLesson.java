package java_basic_11;

import java.util.ArrayList;
import java.util.List;

public class ListLesson {
    public static void main(String[] args) {
        // Lesson Java基礎⑪（Java基礎クラス）

        // 【問題】Listを使ってみましょう。
        // ※　Petクラスを利用します。

        // Activityに使うPetクラスのインスタンスです。
        Pet dog = new Pet("コタロウ");
        Pet cat = new Pet("タマ");

        // ■ 上記のインスタンスを収納する「ArrayList」を宣言してください。
        List<Pet> pets = new ArrayList<Pet>();

        // ■ 新しく宣言したリストが空か判定し、その結果を標準出力してください。
        // 出力結果：
        // true
        System.out.println(pets.isEmpty());

        // ■ 作成したListに上記のインスタンスを追加してください。
        pets.add(dog);
        pets.add(cat);

        // ■ リストが空か判定し、リストが空ではない場合、リストの要素数を標準出力してください。
        // 出力結果：
        // リストのサイズ：2
        if (!pets.isEmpty()){
            System.out.println("リストのサイズ：" +  pets.size());
        }

        // ■ 拡張for文を使って、リストに収納されている全てのインスタンスでsleepメソッドを呼び出してください。
        // 実行結果：
        // コタロウはソファーで寝ています。
        // タマはソファーで寝ています。
        for (Pet pet : pets) {
            pet.sleep();
        }
    }
}

