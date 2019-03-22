package java_advance_01;

public class UseOriginalException {
    public void checkWorkingHours(int workingHours) {
        if (workingHours > 8) {
            throw new NoMoreOvertimeException();
        }
        System.out.println("ワークライフバランスが実現されました。");
    }
}
