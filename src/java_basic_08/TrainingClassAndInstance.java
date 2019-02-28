package java_basic_08;

import java.util.Map;

public class TrainingClassAndInstance {

    public void doTest() {
        // Lesson1
        // 【クラスの作成】
        // ■以下のクラスを作成してください。
        // クラス名：Country
        // ■Countryクラスに国名を表すクラス変数をString型で定義してください。
        // ■Countryクラスに以下のメソッドを作成してください。
        // void setCountryName(String)：引数の文字列を国名としてクラスに保持する。
        // String getCountryName()：クラスに保持している国名を返却する。

        // 【インスタンスの生成】
        // ■Countryクラスのインスタンスを作成してください。
        // ■setCountryNameを呼び出し、国名「Japan」を設定してください。
        // ■getCountryNameを呼び出し、返却値を変数countryNameに格納してください。
        Country country = new Country();
        country.setCountryName("Japan");
        String countryName = country.getCountryName();

        // // 【結果の検証】
        // ■TrainingClassMainクラスを実行して、結果を確かめてください。
        if ("Japan".equals(countryName)) {
            System.out.println("----------おめでとう！Lesson1正解です！----------");
        } else {
            System.out.println("----------残念！Lesson1不正解です！----------");
            return;
        }

        // Lesson2
        // 【クラスの作成】
        // ■以下のクラスを作成してください。
        // クラス名：AdditionCalculator
        // ■AdditionCalculatorクラスに以下のメソッドを作成してください。
        // int addCalc(int[])：引数の数値配列の中身を全てを足して返却する。

        // 【インスタンスの生成】
        // ■AdditionCalculatorクラスのインスタンスを作成してください。
        // ■数値配列を作成し、配列に1,5,10,100を入れてください。
        // ■addCalcメソッドを作成した数値配列を引数に呼び出し、返却値を変数calcResultに格納してください。
        AdditionCalculator calculator = new AdditionCalculator();
        int[] target = {1, 5, 10, 100};
        int calcResult = calculator.addCalc(target);

        // 【結果の検証】
        // ■TrainingClassMainクラスを実行して、結果を確かめてください。
        if (calcResult == 116) {
            System.out.println("----------おめでとう！Lesson2正解です！----------");
        } else {
            System.out.println("----------残念！Lesson2不正解です！----------");
            return;
        }

        // Lesson3
        // 【クラスの作成】
        // ■以下のクラスを作成してください。
        // クラス名：AreaCodeHolder
        // ■AreaCodeHolderクラスに以下のメソッドを作成してください。
        // Map<String, String>getAreaCodes()：市外局番の局番をキー、エリアをバリューとしたMap<String,String>を返却する。
        // 返却するMapは、以下の３つを入れてください。
        // 03:東京、0742：奈良、011：札幌

        // 【インスタンスの生成】
        // ■AreaCodeHolderのインスタンスを生成してください。
        // ■getAreaCodesメソッドを呼び出し、返却値を変数areaCodeに格納してください。
        AreaCodeHolder holder = new AreaCodeHolder();
        Map<String, String> areaCode = holder.getAreaCodes();

        // 【結果の検証】
        // ■TrainingClassMainクラスを実行して、結果を確かめてください。
        String tokyo = areaCode.get("03");
        String nara = areaCode.get("0742");
        String sapporo = areaCode.get("011");
        if ("東京".equals(tokyo) && "奈良".equals(nara) && "札幌".equals(sapporo)) {
            System.out.println("----------おめでとう！Lesson3正解です！----------");
        } else {
            System.out.println("----------残念！Lesson3不正解です！----------");
            return;
        }

        System.out.println("----------おめでとう！全問正解です！----------");
    }
}
