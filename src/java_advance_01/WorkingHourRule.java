package java_advance_01;

/**
 * 勤務時間の超過・未満を判断するクラス。
 */
public class WorkingHourRule {

    /**
     * 勤務時間が早退か残業かをチェックする。
     *
     * <p>
     * チェックの仕様は以下の通り。
     * - 勤務時間が8時間の場合：処理終了
     * - 勤務時間が8時間超過の場合：OverTimeExceptionを送出
     * - 勤務時間が8時間未満の場合：EarlyLeaveExceptionを送出
     *
     * @param workingHours 勤務時間
     * @throws OvertimeException   残業が発生した場合
     * @throws EarlyLeaveException 早退が発生した場合
     */
    public void checkRegularTime(int workingHours) throws OvertimeException, EarlyLeaveException {
        int officeHours = 8;
        if (workingHours > officeHours) {
            int overtime = workingHours - officeHours;
            throw new OvertimeException(overtime + "時間残業です。");
        } else if (workingHours < officeHours) {
            int earlyLeave = officeHours - workingHours;
            throw new EarlyLeaveException(earlyLeave + "時間早帰りです。");
        }
    }
}
