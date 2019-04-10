package java_advance_01;

public class OvertimeException extends Exception {
    /**
     * オーバータイムが発生した場合発生する例外
     *
     * @param message -
     */
    OvertimeException(String message) {
        super(message);
    }
}
