package java_advance_01;

/**
 * 残業を示す例外。
 */
public class OvertimeException extends Exception {
    /**
     * コンストラクタ。
     *
     * @param message -
     */
    OvertimeException(String message) {
        super(message);
    }
}
