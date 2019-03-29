package java_advance_01;

public class WorkingHourRule {

    /**
     * 引数として渡された勤務時間の値によって、以下の処理を行う。
     * - 勤務時間が8時間の場合：「定時帰りです。」を標準出力
     * - 勤務時間が8時間超過の場合：OverTimeExceptionをメッセージと共に送出
     * - 勤務時間が8時間未満の場合：EarlyLeaveExceptionをメッセージと共に送出
     *
     * @param workingHours 勤務悲観（整数）
     * @throws OvertimeException   勤務時間が正規勤務時間より大きくて、オーバータイムが発生した場合
     * @throws EarlyLeaveException 勤務時間が正規勤務時間より少なくて、早退が発生した場合
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
