package java_advance_01;

public class UseOriginalException {
    // Java応用①（例外処理）
    // 【問題】条件によって例外を発生するメソッド作成してください。
    public void checkWorkingHours(int workingHours) {
        if (workingHours > 8) {
            throw new NoMoreOvertimeException();
        }
        System.out.println("ワークライフバランスが実現されました。");
    }
}
