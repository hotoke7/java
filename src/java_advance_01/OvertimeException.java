package java_advance_01;

/**
 * 勤務時間が規定時間を超過したことを表す例外クラス。
 */
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
