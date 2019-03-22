package java_advance_02;

import java.util.ArrayList;
import java.util.List;

public class DebugLessonOne {
    // Lesson Java応用②（デバッグ）
    // ■ 以下のソースコードに潜んでいるバグを修正してください。
    public static void main(String[] args) {
        List<String> dummyStringList = new ArrayList<>();
        dummyStringList.add("TEST_324rf3495");
        dummyStringList.add("TEST__002154");
        dummyStringList.add("TEST_0514q3222");
        dummyStringList.add("TEsT_2348057340");
        dummyStringList.add("TEST_2345621");
        dummyStringList.add(" TEST_002154");
        dummyStringList.add("TEST_0iii1541");
        dummyStringList.add("TEST_FF162");
        dummyStringList.add("TEST_0514370");
        dummyStringList.add("tEST_00215134");
        dummyStringList.add("TEST_0021154");
        dummyStringList.add("TEST_340143");
        dummyStringList.add("TEST_05143170");
        dummyStringList.add("TEsT_000234203");
        dummyStringList.add("tEST_002sf15134");
        dummyStringList.add("TEST_002aa1154");
        dummyStringList.add("TEST_342r50143");
        dummyStringList.add("TEST_05143170");
        dummyStringList.add("TEsT_000234203");
        dummyStringList.add("TST_6858223");
        dummyStringList.add("TST_68223");
        dummyStringList.add("T EST_0f120");
        dummyStringList.add("TEST_RRGD54");
        dummyStringList.add("TEST_34iii43");
        dummyStringList.add("TEST_05ll170");

        stringCutter(dummyStringList);
    }

    // 文字列のリストを引数として受け取り、
    // 文字列の先頭が「TEST」の場合、12桁目以後の文字列を出力するメソッド
    public static void stringCutter(List<String> stringList) {
        for (String str : stringList) {
            if (str.length() > 12 && str.substring(0, 4).equals("TEST")) {
                System.out.println(str.substring(12));
            }
        }
    }
}
