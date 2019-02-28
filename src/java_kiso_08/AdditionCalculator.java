package java_kiso_08;

public class AdditionCalculator {

    public int addCalc(int[] target) {
        int result = 0;
        for (int i : target) {
            result = result + i;
        }
        return result;
    }
}
