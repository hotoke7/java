package ConditionalBranch;

public class ConditionalBranch {
    public static void main(String[] args) {

        // Lesson 条件分岐
        // 【問題】2019/2020年のうるう年の判定をしてください。
        // 出力結果：
        // 2019年は、うるう年ではありません。
        // 2020年は、うるう年です。


        //Answer if文
        int year;
        year = 2019;
        if (year % 4 == 0) {
            System.out.println(year + "年は、うるう年です！");
        }
        else {
            System.out.println(year + "年は、うるう年ではありません！");
        }
        year = 2020;
        if (year % 4 == 0) {
            System.out.println(year + "年は、うるう年です！");
        }
        else {
            System.out.println(year + "年は、うるう年ではありません！");
        }

        //Answer  switch文
        year = 2019;
        // year = 2020;
        switch (year % 4){
            case 0 :
                System.out.println(year + "年は、うるう年です。");
                break;
            default:
                System.out.println(year + "年は、うるう年ではありません。");
        }


    }
}
