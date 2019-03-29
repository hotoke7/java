package java_advance_01;

public class ExceptionLesson {
    public static void main(String[] args) {
        WorkingHourRule workingHourRule = new WorkingHourRule();
        int[] workingHoursList = {6, 8, 11};

        // Java応用①（例外処理）
        // 【問題】勤務時間を入力すると定時帰りかをチェックする機能があります。
        //         こちらの機能に上記の「workingHoursList」を渡し、正しい動作を行うように実装してください。
        //         出力結果はWikiを参照してください。
        for (int workingHours : workingHoursList) {
            System.out.println(workingHours + "時間勤務の場合：");

            // ■ 「WorkingHourRule」クラスの「checkRegularTime」メソッドに変数「workingHours」を渡して呼び出してください。
            // 「checkRegularTime」メソッドの実行結果に応じて以下の処理を行ってください。
            // ・正常終了した場合
            //   ・文字列「定時帰りです。」を標準出力してください。
            // ・例外「OvertimeException」が発生した場合
            //   ・例外をキャッチして、その情報を表示してください。
            //   ・例外からメッセージを取得し、標準出力してください。
            // ・例外「EarlyLeaveException」が発生した場合
            //   ・例外「OvertimeException」が発生時と同様の処理を行ってください。
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