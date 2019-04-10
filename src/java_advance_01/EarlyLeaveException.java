package java_advance_01;

public class EarlyLeaveException extends Exception {
    /**
     * 早退が発生した場合発生する例外。
     *
     * @param message -
     */
    EarlyLeaveException(String message) {
        super(message);
    }
}
