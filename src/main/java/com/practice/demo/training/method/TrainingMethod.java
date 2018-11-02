package com.practice.demo.training.method;

import java.util.ArrayList;
import java.util.List;

public class TrainingMethod {

    public void doTest() {
        // Lesson1
        // 【メソッドの作成】
        // ■「こんばんわ」と文字列を返すメソッドをこのクラス内に作成してください。

        // 【メソッドの呼び出し】
        // ■メソッドを呼び出し、返却値を変数lesson1に格納してください。
        String lesson1 = getHello();

        // 【結果の検証】
        // ■TrainingMethodMainクラスを実行して、結果を確かめてください。
        if ("こんばんわ".equals(lesson1)) {
            System.out.println("----------おめでとう！Lesson1正解です！----------");
        } else {
            System.out.println("----------残念！Lesson1不正解です！----------");
            return;
        }

        // Lesson2
        // 【メソッドの作成】
        // ■数値を１つ引数に取れるメソッドをこのクラス内に作成し、引数に10を加えて返却出来るようにしてください。

        // 【メソッドの呼び出し】
        // ■lesson2_1を引数にして作成したメソッドを呼び出し、返却された値をlesson2_2に格納してください。
        int lesson2_1 = 10;
        int lesson2_2 = addTen(lesson2_1);
        // ■TrainingMethodMainクラスを実行して、結果を確かめてください。
        if (lesson2_2 == 20) {
            System.out.println("----------おめでとう！Lesson2正解です！----------");
        } else {
            System.out.println("----------残念！Lesson2不正解です！----------");
            return;
        }

        // Lesson3
        // 【メソッドの作成】
        // ■数値を１つ引数に取れるメソッドをこのクラス内に作成し、受け取った引数が10以上ならtrue,10未満ならfalseを返却してください。

        // 【メソッドの呼び出し】
        // ■変数Lesson3_1を引数にしてメソッドを呼び出し、返却された値をlesson3_2に格納してください。
        int lesson3_1 = 10;
        boolean lesson3_2 = judgeOver10(lesson3_1);

        // 【結果の検証】
        // ■TrainingMethodMainクラスを実行して、結果を確かめてください。
        if (lesson3_2) {
            System.out.println("----------おめでとう！Lesson3正解です！----------");
        } else {
            System.out.println("----------残念！Lesson3不正解です！----------");
            return;
        }

        // Lesson4
        // 【メソッドの作成】
        // ■数値を2つ引数に取れるメソッドをこのクラス内に作成し、受け取った引数を乗算して返却してください。

        // 【メソッドの呼び出し】
        // ■変数Lesson4_1,4_2を引数にしてメソッドを呼び出し、返却された値をlesson4_3に格納してください。
        int lesson4_1 = 10;
        int lesson4_2 = 5;
        int lesson4_3 = multiple(lesson4_1,lesson4_2);

        // 【結果の検証】
        // ■TrainingMethodMainクラスを実行して、結果を確かめてください。
        if (lesson4_3 == 50) {
            System.out.println("----------おめでとう！Lesson4正解です！----------");
        } else {
            System.out.println("----------残念！Lesson4不正解です！----------");
            return;
        }

        // Lesson5
        // 【メソッドの作成】
        // ■文字列型の可変長引数（引数の個数が不定）を受け取れるメソッドをこのクラス内に作成してください。
        //   受け取った引数を全て数値型に変換し、足したものを数値型として返却してください。

        // 【メソッドの呼び出し】
        // ■変数lesson5_1,5_2,5_3を引数にしてメソッドを呼び出し、返却された値をlesson5_4に格納してください。
        String lesson5_1 = "5";
        String lesson5_2 = "10";
        String lesson5_3 = "100";
        int lesson5_4 = variableArgument(lesson5_1, lesson5_2, lesson5_3);

        // 【結果の検証】
        // ■TrainingMethodMainクラスを実行して、結果を確かめてください。
        if (lesson5_4 == 115) {
            System.out.println("----------おめでとう！Lesson5正解です！----------");
        } else {
            System.out.println("----------残念！Lesson5不正解です！----------");
            return;
        }

        // Lesson6
        // 【メソッドの作成】
        // ■List<String>を引数に受け取れるメソッドをこのクラス内に作成してください。
        //   受け取ったListの要素を全て文字列連結し、文字列型として返却してください。

        // 【メソッドの呼び出し】
        // ■変数lesson6_1,6_2,6_3を全てListに格納し引数にしてメソッドを呼び出し、返却された値をlesson6_4に格納してください。
        String lesson6_1 = "あいう";
        String lesson6_2 = "え";
        String lesson6_3 = "お";
        List<String> list = new ArrayList<>();
        list.add(lesson6_1);
        list.add(lesson6_2);
        list.add(lesson6_3);
        String lesson6_4 = concatString(list);

        // 【結果の検証】
        // ■TrainingMethodMainクラスを実行して、結果を確かめてください。
        if ("あいうえお".equals(lesson6_4)) {
            System.out.println("----------おめでとう！Lesson6正解です！----------");
        } else {
            System.out.println("----------残念！Lesson6不正解です！----------");
            return;
        }
        System.out.println("----------おめでとう！全問正解です！----------");

    }

    private String getHello() {
        return "こんばんわ";
    }

    private int addTen(int target) {
        return target + 10;
    }

    private boolean judgeOver10(int target) {
        if (target >= 10) {
            return true;
        }
        return false;
    }

    private int multiple(int a, int b) {
        return a * b;
    }

    private int variableArgument(String... values) {
        int result = 0;
        for (String value : values) {
            result = result + Integer.valueOf(value);
        }
        return result;
    }

    private String concatString(List<String> concatTarget) {
        String result = "";
        for (String tar:concatTarget) {
            result = result + tar;
        }
        return result;
    }

}
