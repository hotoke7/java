package java_advance_01;

public class ExceptionLesson {
    public static void main(String[] args) {
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