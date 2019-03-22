package java_advance_01;

public class ExceptionParty {
    // Java応用①（例外処理）
    // 【問題】ExceptionPartyクラスの各メソッドでは例外が発生しています。
    // 指示に従い、各メソッドにて例が処理を行ってください。

    // ■ 例外発生時、以下の文字列を返却してください。
    // Hello, null!
    public String isEqualToNull() {
        String hello = "Hello";
        String greeting;

        try {
            if (hello.equals(null)) {
                greeting = "Hello, world!";
            } else {
                greeting = "Goodbye, world!";
            }
        } catch (NullPointerException e) {
            greeting = "Hello, null!";
        }
        return greeting;
    }

    // ■ 例外発生時、-1を返却してください。
    public int dividedByZero() {
        int result;

        try {
            result = 4 / 0;
        } catch (ArithmeticException e) {
            result = -1;
        }
        return result;
    }

    // ■ 例外発生時、以下の文字列を標準出力してください。
    // 配列のインデックスは0からです。
    public void beyondArray() {
        int[] maxThreeArray = {1, 2, 3};

        try {
            System.out.println(maxThreeArray[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("配列のインデックスは0からです。");
        }
    }
}