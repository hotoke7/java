package java_advance_01;

import java.util.Scanner;

public class ExceptionLesson {
    public static void main(String[] args) {
        WorkingHourRule workingHourRule = new WorkingHourRule();
        int workingHours = new Scanner(System.in).nextInt();
        boolean isRegularTime;

        // Java応用①（例外処理）
        // 【問題】WorkingHourRuleクラスのメソッド「isRegularTime」を使ってみましょう。
        // ■ WorkingHourRuleクラスのメソッド「checkRegularTime」を呼び出してください。
        // ・引数として、標準入力を格納した変数「workingHours」を渡してください。
        // ・返却値がtrueの場合、「定時帰りです。」を標準出力してください。

        // ■ 例外処理を行ってください。
        // ・例外処理は「OvertimeException」、「EarlyLeaveException」の各例外別で行ってください。
        // ・例外時は、該当例外の内容を表示してください。
        // ・各例外はメッセージを持っています。例外からメッセージを出力し、以下の文字列と合わせて標準出力してください。
        //   ・OvertimeExceptionの場合：例外メッセージ + 研修中の残業は原則として許容されません。
        //   ・EarlyLeaveExceptionの場合：例外メッセージ + 研修中の早退は原則として許容されません。
        try {
            isRegularTime = workingHourRule.checkRegularTime(workingHours);
            if (isRegularTime) System.out.println("定時帰りです。");
        } catch (OvertimeException e) {
            e.printStackTrace();
            String overtimeMessage = e.getMessage();
            System.out.println(overtimeMessage + "研修中の残業は原則として許容されません。");
        } catch (EarlyLeaveException e) {
            e.printStackTrace();
            String earlyLeaveMessage = e.getMessage();
            System.out.println(earlyLeaveMessage + "研修中の早退は原則として許容されません。");
        }
    }
}