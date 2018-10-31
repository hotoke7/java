package com.practice.demo.training.method;

public class TrainingMethod {

    public void doTest() {
        // Lesson1
        // その１：「こんばんわ」と文字列を返すメソッドを作成してください。
        // その２：メソッドを呼び出し、返却値を変数lesson1に格納してください。
        // その３：TrainingMethodMainクラスを実行して、結果を確かめてください。
        String lesson1 = getHello();
        if ("こんばんわ".equals(lesson1)) {
            System.out.println("----------おめでとう！Lesson1正解です！----------");
        } else {
            System.out.println("----------残念！Lesson1不正解です！----------");
            return;
        }

        // Lesson2
        // その１：数値を１つ引数に取れるメソッドを作成し、引数に10を加えて返却出来るようにしてください。
        // その２：lesson2_1を引数にして作成したメソッドを呼び出し、返却された値をlesson2_2に格納してください。
        // その３:TrainingMethodMainクラスを実行して、結果を確かめてください。
        int lesson2_1 = 10;
        int lesson2_2 = addTen(lesson2_1);
        if (lesson2_2 == 20) {
            System.out.println("----------おめでとう！Lesson2正解です！----------");
        } else {
            System.out.println("----------残念！Lesson2不正解です！----------");
            return;
        }

        // Lesson3
        // その１：数値を１つ引数に取れるメソッドを作成し、受け取った引数が10以上ならtrue,10未満ならfalseを返却してください。
        // その２：変数Lesson3_1を引数にしてメソッドを呼び出し、返却された値をlesson3_2に格納してください。
        // その３:TrainingMethodMainクラスを実行して、結果を確かめてください。
        int lesson3_1 = 10;
        boolean lesson3_2 = judgeOver10(lesson3_1);
        if (lesson3_2) {
            System.out.println("----------おめでとう！Lesson3正解です！----------");
        } else {
            System.out.println("----------残念！Lesson3不正解です！----------");
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


}
