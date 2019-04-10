package java_advance_01;

/**
 * 早退を示す例外。
 */
public class EarlyLeaveException extends Exception {

    /**
     * コンストラクタ。
     *
     * @param message -
     */
    EarlyLeaveException(String message) {
        super(message);
    }
}
