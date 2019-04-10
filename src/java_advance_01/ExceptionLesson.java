package java_advance_01;

/**
 * Lesson Java応用①（例外処理）
 * <p>
 * 【問題】
 * 勤務時間を入力すると定時帰りかをチェックする機能があります。
 * その機能を使用し、想定する挙動となるよう実装をしてください。
 * 出力結果はWikiを参照してください。
 */
public class ExceptionLesson {

    /**
     * 整数の内容に応じて、標準出力処理または例外処理を行う。
     *
     * @param args -
     */
    public static void main(String[] args) {
        WorkingHourRule workingHourRule = new WorkingHourRule();
        int[] workingHoursList = {6, 8, 11};

        for (int workingHours : workingHoursList) {
            System.out.println(workingHours + "時間勤務の場合：");

            // ■ 「WorkingHourRule」クラスの「checkRegularTime」メソッドの引数にworkingHoursを渡して呼び出してください。
            // checkRegularTimeの実行結果に応じて、以下の処理を行ってください。
            // ・正常終了した場合
            //   ・「定時帰りです。」を標準出力する
            // ・例外「OvertimeException」が発生した場合
            //   ・例外をキャッチして、その情報を表示する
            //   ・例外からメッセージを取得し、標準出力する
            // ・例外「EarlyLeaveException」が発生した場合
            //   ・例外「OvertimeException」が発生時と同様の処理を行う
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