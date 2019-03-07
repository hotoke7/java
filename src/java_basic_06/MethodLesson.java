package java_basic_06;

public class MethodLesson {
    // Lesson Java基礎⑥（メソッド）
    // メソッドを宣言する
    // メソッドに引数を入れ、戻り値を取得する
    // 戻り値をコンソールに出力する

    // 【問題】果物を入れたらとりあえずペンを刺すメソッドを作成し、その結果を出力してください。

    // 出力結果：
    // Apple pen!
    // Pineapple pen!
    // Pen-Pineapple-Apple-Pen!

    // 案１．インスタンス
    // ■ 果物を引数として一つもらったらペンを指して返すメソッドを作成してください。
    private String addPen(String fruit) {
        return fruit + " pen!";
    }

    // ■ 果物を引数として二つもらったらペンを指して返すメソッドを作成してください。
    private String addPen(String fruit1, String fruit2) {
        return "Pen-" + fruit1 + "-" + fruit2 + "-pen!";
    }

    //==============================================================================

    // 案２．Static
    // ■ 果物を引数として一つもらったらペンを指して返すメソッドを作成してください。
    private static String addPen2(String fruit) {
        return fruit + " pen!";
    }

    // ■ 果物を引数として二つもらったらペンを指して返すメソッドを作成してください。
    private static String addPen2(String fruit1, String fruit2) {
        return "Pen-" + fruit1 + "-" + fruit2 + "-pen!";
    }

    public static void main(String[] args) {
        // ■ メソッドに入れる果物を二つ宣言してください。
        String apple = "Apple";
        String pineapple = "Pineapple";

        // 案３　ローカルクラス
        class Ppap {
            // ■ 果物を引数として一つもらったらペンを指して返すメソッドを作成してください。
            private String addPen3(String fruit) {
                return fruit + " pen!";
            }

            // ■ 果物を引数として二つもらったらペンを指して返すメソッドを作成してください。
            private String addPen3(String fruit1, String fruit2) {
                return "Pen-" + fruit1 + "-" + fruit2 + "-pen!";
            }
        }


        // 案１ インスタンス
        System.out.println("インスタンス");

        // 宣言したメソッドを使用する為には、インスタンスを宣言する必要があります。
        // こちらは、次の講義で詳しく説明します。
        MethodLesson methodLesson = new MethodLesson();

        // ■ 予想した結果が出るように、作成したメソッドの結果を出力してください。
        // Hint：MethodLessonクラス内で宣言したメソッドを使うには、メソッドの前に「MethodLesson.」を付けないといけません。
        // ex) MethodLesson.メソッド
        System.out.println(methodLesson.addPen(apple));
        System.out.println(methodLesson.addPen(pineapple));
        System.out.println(methodLesson.addPen(apple, pineapple));

        //==============================================================================

        // 案２ Static
        System.out.println("Static");

        System.out.println(addPen2(apple));
        System.out.println(addPen2(pineapple));
        System.out.println(addPen2(apple, pineapple));

        //==============================================================================

        // 案３ ローカルクラス
        System.out.println("ローカルクラス");

        Ppap ppap = new Ppap();
        System.out.println(ppap.addPen3(apple));
        System.out.println(ppap.addPen3(pineapple));
        System.out.println(ppap.addPen3(apple, pineapple));

        //==============================================================================

        // 案４ 別クラス
        System.out.println("別クラス");

        // 宣言したメソッドを使用する為には、メソッドを書いたクラスのインスタンスを宣言する必要があります。
        // クラスやインスタンスに関しては、次の講義で詳しく説明します。
        YourMethod yourMethod = new YourMethod();

        // ■ 予想した結果が出るように、作成したメソッドの結果を出力してください。
        // Hint：YourMethodクラスで宣言したメソッドを使うには、メソッドの前に「yourMethod.」を付けないといけません。
        // ex) yourMethod.メソッド
        System.out.println(yourMethod.addPen(apple));
        System.out.println(yourMethod.addPen(pineapple));
        System.out.println(yourMethod.addPen(apple, pineapple));

    }
}
