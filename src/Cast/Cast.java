package Cast;

public class Cast {
    public static void main(String[] args) {
        //小数から整数へキャスト
        System.out.println((int)10.8);
        //演算結果をキャスト(小数点切捨て)
        System.out.println((int)(13800 * 1.08));
        //数値をchar型へキャスト
        int a = 97;
        System.out.println((char)a);
    }

}
