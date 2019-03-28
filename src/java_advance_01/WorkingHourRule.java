package java_advance_01;

public class WorkingHourRule {

    // checkRegularTimeメソッド
    // 引数として渡された勤務時間によって、以下の処理を行う。
    // - 勤務時間が8時間超過の場合：OverTimeExceptionをメッセージと共に送出する。
    // - 勤務時間が8時間未満の場合：EarlyLeaveExceptionをメッセージと共に送出する。
    // - 勤務時間が8時間の場合：「定時帰りです。」を標準出力する。
    // 引数：workingHours 勤務時間（整数）
    // 返却値：boolean true
    // 例外1：NoMoreOvertimeException 勤務時間が正規勤務時間より大きくて、オーバータイムが発生した場合
    // 例外2：EarlyLeaveException     勤務時間が正規勤務時間より少なくて、早退が発生した場合
    public boolean checkRegularTime(int workingHours) throws OvertimeException, EarlyLeaveException {
        int officeHours = 8;
        if (workingHours > officeHours) {
            int overtime = workingHours - officeHours;
            throw new OvertimeException(overtime + "時間残業です。");
        } else if (workingHours < officeHours) {
            int earlyLeave = officeHours - workingHours;
            throw new EarlyLeaveException(earlyLeave + "時間早帰りです。");
        }
        return true;
    }
}
