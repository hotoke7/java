package java_advance_01;

public class ExceptionLesson {
    public static void main(String[] args) {
        WorkingHourRule workingHourRule = new WorkingHourRule();
        int[] workingHoursList = {6, 8, 11};

        // Java応用①（例外処理）
        // 【問題】勤務時間を入力すると定時帰りかをチェックする機能を作成してください。
        // 機能の実行テストには、上記の「workingHoursList」を使用します。
        // 「workingHoursList」の長さ分繰り返しを行い、その結果を確認します。
        // 出力結果はWikiを参照してください。
        for (int workingHours : workingHoursList) {
            System.out.println(workingHours + "時間勤務の場合：");

            // ■ WorkingHourRuleクラスの「checkRegularTime」メソッドを呼び出してください。
            // ・引数として、変数「workingHours」を渡してください。
            // ・「checkRegularTime」メソッドを呼び出した後に、「定時帰りです。」を標準出力してください。

            // ■ 「checkRegularTime」メソッドによって発生する例外に対して、例外処理を行ってください。
            // ・例外処理は「OvertimeException」、「EarlyLeaveException」の各例外別で行ってください。
            // ・例外時は、該当例外の内容を表示してください。
            // ・各例外はメッセージを持っています。例外からメッセージを取得し、標準出力してください。
            try {
                workingHourRule.checkRegularTime(workingHours);
                System.out.println("定時帰りです。");
            } catch (OvertimeException e) {
                e.printStackTrace();
                String overtimeMessage = e.getMessage();
                System.out.println(overtimeMessage);
            } catch (EarlyLeaveException e) {
                e.printStackTrace();
                String earlyLeaveMessage = e.getMessage();
                System.out.println(earlyLeaveMessage);
            }
            System.out.println("===================================");
        }
    }
}