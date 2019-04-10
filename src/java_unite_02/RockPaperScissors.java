package java_unite_02;

import java.util.Random;
import java.util.Scanner;

/**
 * じゃんけんクラス。
 * <p>
 * Lesson Java一貫② じゃんけんゲーム②
 * <p>
 * 【問題】
 * playメソッドを完成してください。
 */
public class RockPaperScissors {

    /** ランダム */
    private Random random = new Random();
    /** スキャナ */
    private Scanner scan = new Scanner(System.in);

    // ■ 「play」メソッドに引数を以下の通り追加してください。
    // 引数1：Player ユーザー
    // 引数2：Player コンピューター
    /**
     * じゃんけんを行い、結果を標準出力する。
     *
     * @param you      ユーザー
     * @param computer コンピューター
     */
    public void play() {
        // グー」「パー」「チョキ」の文字列を配列に格納します。
        String[] rps = new String[3];
        rps[0] = "グー";
        rps[1] = "パー";
        rps[2] = "チョキ";

        System.out.println("以下の選択肢の中で一つを選んでください。");

        // 配列を繰り返し、配列の値を標準出力する。
        for (int i = 0; i < rps.length; i++) {
            System.out.println(i + "：" + rps[i]);
        }

        // コンピュータが出す手を決めます。
        int computersChoice = random.nextInt(rps.length);

        System.out.println("番号を入力してください：");

        // ユーザーが出す手を決めます。
        int yourChoice = scan.nextInt();

        System.out.println("あなたの選択 : " + rps[yourChoice]);
        System.out.println("コンピュータの選択 : " + rps[computersChoice]);

        // ■ 以下のコードをもとに、じゃんけんの結果によってプレイヤーインスタンスの値を変更してください。
        // 機能詳細：
        //   ユーザーが勝った場合：
        //     動作：以下の内容を標準出力及びユーザーの勝利回数を＋1とする。
        //     出力内容：勝ちました！
        //   コンピューターが勝った場合：
        //     動作：以下の内容を標準出力及びコンピューターの勝利回数を＋1とする。
        //     出力内容：負けました…
        //   無勝負の場合：
        //     動作：以下の内容を標準出力する。
        //     出力内容：あいこです。
        if (yourChoice == computersChoice) {
            System.out.println("あいこです。");
        } else {
            if (yourChoice == 0) {
                if (computersChoice == 1) {
                    System.out.println("負けました…");


                } else {
                    System.out.println("勝ちました！");


                }
            } else if (yourChoice == 1) {
                if (computersChoice == 2) {
                    System.out.println("負けました…");


                } else {
                    System.out.println("勝ちました！");


                }
            } else {
                if (computersChoice == 0) {
                    System.out.println("負けました…");


                } else {
                    System.out.println("勝ちました！");


                }
            }
        }
    }
}
