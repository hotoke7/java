package java_advance_01;

/**
 * 勤務時間が規定時間未満のことを表す例外クラス。
 */
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
