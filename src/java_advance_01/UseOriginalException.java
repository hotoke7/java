package java_advance_01;

public class UseOriginalException {
    // Java応用①（例外処理）
    // 【問題】条件によって例外を発生するメソッド作成してください。
    // ■ 以下の動作をするメソッドを作成してください
    // 引数1：整数型　勤務時間
    // 動作：入力された勤務時間に応じて以下の動作を行う。
    // ・勤務時間が8時間を超過する場合：NoMoreOverTimeExceptionを送出する。
    // ・勤務時間が8時間以下の場合：以下の文字列を標準出力する。
    //   ・ワークライフバランスが実現されました。
    // 返却値：なし
    public void checkWorkingHours(int workingHours) {
        if (workingHours > 8) {
            throw new NoMoreOvertimeException();
        }
        System.out.println("ワークライフバランスが実現されました。");
    }
}
