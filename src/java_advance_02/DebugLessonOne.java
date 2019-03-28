package java_advance_02;

import java.util.ArrayList;
import java.util.List;

public class DebugLessonOne {
    // Lesson Java応用②（デバッグ）
    // ■ 以下のソースコードに潜んでいるバグを修正してください。
    public static void main(String[] args) {
        List<String> dummyStringList = new ArrayList<>();
        dummyStringList.add("LIST_01");
        dummyStringList.add("LIST_02");
        dummyStringList.add("list_03");
        dummyStringList.add("LIST_04");
        dummyStringList.add("LlST_05");

        stringCutter(dummyStringList);
    }

    /**
     * 文字列のリストを引数として受け取り、文字列の値によって以下の動作を行う。
     * ・文字列の先頭4桁が「LIST」の場合、5桁目以後の文字列を標準出力
     * ・文字列の先頭4桁が「LIST」ではない場合、「正しくないデータ」を標準出力
     * <p>
     * 予想結果：
     * 01
     * 02
     * 正しくないデータ
     * 04
     * 正しくないデータ
     *
     * @param stringList 文字列のリスト
     */
    public static void stringCutter(List<String> stringList) {
        for (String str : stringList) {
            if (str.substring(0, 4).equals("LIST")) {
                System.out.println(str.substring(5));
            } else {
                System.out.println("正しくないデータ");
            }
        }
    }
}