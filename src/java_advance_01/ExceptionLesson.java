package java_advance_01;

public class ExceptionLesson {
    public static void main(String[] args) {
        // Java応用①（例外処理）
        // 【問題】ExceptionLessonクラスを実行し、発生する例外に対して例外処理を行ってください。
        ExceptionParty exceptionParty = new ExceptionParty();
        System.out.println(exceptionParty.isEqualToNull());
        System.out.println(exceptionParty.dividedByZero());
        exceptionParty.beyondArray();

        UseOriginalException useOriginalException = new UseOriginalException();

        // ■ checkWorkingHoursメソッドを呼び出し、動作を確認してみましょう。
        // 渡した引数によってNoMoreOverTimeExceptionが送出されることが確認できます。
        useOriginalException.checkWorkingHours(8);
        useOriginalException.checkWorkingHours(9);
    }
}