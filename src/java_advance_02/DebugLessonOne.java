package java_advance_02;

import java.util.ArrayList;
import java.util.List;

/**
 * Lesson Java応用②（デバッグ）
 * <p>
 * 【問題】
 * 以下のソースコードに潜んでいるバグを修正してください。
 */
public class DebugLessonOne {

    /**
     * 標準出力処理を行う。
     *
     * @param args -
     */
    public static void main(String[] args) {
        List<String> dummyStringList = new ArrayList<>();
        dummyStringList.add("LIST_01");
        dummyStringList.add("LIST_02");
        dummyStringList.add("list_03");
        dummyStringList.add("LIST_04");
        dummyStringList.add("LlST_05");

        // 出力想定：
        // 01
        // 02
        // 不正データ
        // 04
        // 不正データ
        stringCutter(dummyStringList);
    }

    /**
     * 文字列リストの内容に応じて、標準出力処理を行う。
     * <p>
     * ・文字列の先頭4桁が「LIST」の場合、5桁目以後の文字列を標準出力
     * ・文字列の先頭4桁が「LIST」ではない場合、「不正データ」を標準出力
     *
     * @param stringList 処理対象の文字列リスト
     */
    public static void stringCutter(List<String> stringList) {
        for (String str : stringList) {
            if (str.substring(1, 4).equals("LIST")) {
                System.out.println(str.substring(6));
            } else {
                System.out.println("不正データ");
            }
        }
    }
}