package com.practice.demo.training.polymorphismandinterface;

public class TrainingPolymorphismAndInterface {

    public void doTest() {
        // Lesson
        // 【Snackインターフェースと、実装クラスの作成】
        // ■インターフェースクラス、Snackを作成してください。
        //   Snackインターフェースには、String getSnackName()を定義してください。
        // ■Snackインターフェースの実装クラスとして、KinokonoYamaクラスを実装してください。
        //   getSnackNameでは、「きのこの山」と返却してください。
        // ■Snackインターフェースの実装クラスとして、TakenokonoSatoクラスを実装してください。
        //   getSnackNameでは、「たけのこの里」と返却してください。

        // 【SnackFactoryインターフェースと、実装クラスの作成】
        // ■インターフェースクラス、SnackFactoryを作成してください。
        //   SnackFactoryには、Snack createSnack()を定義してください。
        // ■SnackFactoryインターフェースの実装クラスとして、KinokonoYamaFactoryクラスを実装してください。
        //   createSnackではKinokonoYamaのインスタンスを生成して返却してください。
        // ■SnackFactoryインターフェースの実装クラスとして、TakenokonoSatoFactoryクラスを実装してください。
        //   createSnackではTakenokonoSatoのインスタンスを生成して返却してください。

        // 【Factoryクラスのインスタンス生成】
        // ■SnackFactory型の変数kinokoFactoryに、KinokonoYamaFactoryのインスタンスを生成して代入してください。
        // ■SnackFactory型の変数takenokoFactoryに、TakenokonoSatoFactoryのインスタンスを生成して代入してください。
        SnackFactory kinokoFactory = new KinokonoYamaFactory();
        SnackFactory takenokoFactory = new TakenokonoSatoFactory();

        // 【Factoryクラスのメソッド呼び出し】
        // ■kinokoFactoryのcreateSnackを呼び出し、返却値をSnack型の変数kinokoに代入してください。
        // ■takenokoFactoryのcreateSnackを呼び出し、返却値をSnack型の変数takenokoに代入してください。
        Snack kinoko = kinokoFactory.createSnack();
        Snack takenoko = takenokoFactory.createSnack();

        // 【Snackクラスのメソッド呼び出し】
        // ■kinokoのgetSnackNameを呼び出し、、返却値を変数kinokoNameに代入してください。
        // ■takenokoのgetSnackNameを呼び出し、、返却値を変数takenokoNameに代入してください。
        String kinokoName = kinoko.getSnackName();
        String takenokoName = takenoko.getSnackName();

        // 【結果の検証】
        // ■PolymorphismMainクラスを実行して、結果を確かめてください。
        if ("きのこの山".equals(kinokoName) && "たけのこの里".equals(takenokoName)) {
            System.out.println("----------おめでとう！Lesson正解です！----------");
        } else {
            System.out.println("----------残念！Lesson不正解です！----------");
        }
    }
}
