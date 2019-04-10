package java_unite_03;

import java.util.HashMap;
import java.util.Map;

/**
 * じゃんけんクラス。
 * <p>
 * Lesson Java一貫② じゃんけんゲーム②
 * <p>
 * 【問題】
 * playメソッドを完成してください。
 */
public class RockPaperScissors {
    // Lesson Java一貫③ じゃんけんゲーム③
    // 【問題】RockPaperScissorsクラスを問題に従って変更してください。

    /**
     * じゃんけんMap
     */
    public static final Map<Integer, String> rps = new HashMap<Integer, String>() {
        {
            put(1, "グー");
            put(2, "パー");
            put(3, "チョキ");
        }
    };

    // ■ 「play」メソッドの引数を変更してください。

    /**
     * じゃんけんを行い、結果を標準出力する。
     *
     * @param you      ユーザー
     * @param computer コンピューター
     * @return ゲーム結果
     */
    public GameRecord play(ManualRpsPlayer you, AutoRpsPlayer computer) {

        // ゲーム結果Map
        Map<String, String> gameResults = new HashMap<String, String>() {
            {
                // ユーザーの勝ち
                put("win", "〇");  // ユーザーの勝ち
                put("draw", "△"); // ドロー
                put("lose", "×"); //コンピューターの勝ち
            }
        };

        // 選択肢の表示
        System.out.println("以下の選択肢の中で一つを選んでください。");
        for (Integer key : rps.keySet()) {
            System.out.println(key.toString() + "：" + rps.get(key));
        }
        System.out.println("番号を入力してください：");

        // ■ ユーザーのじゃんけんの手を取得してください。
        int yourChoice = you.chooseHand();
        // ■ コンピュータのじゃんけんの手を取得してください。
        int computersChoice = computer.chooseHand();

        // 勝敗フラグ
        boolean didYouWin;

        // ■じゃんけんの結果によって以下の動作を行う機能を作成してください。
        // 機能詳細：
        //   ユーザーの勝利：
        //     ・ユーザが勝利した旨を標準出力し、ユーザの勝利回数を+1する。
        //     ・勝敗フラグにtrueを格納する。
        //
        //   コンピューターの勝利：
        //     ・コンピュータが勝利した旨を標準出力し、コンピュータの勝利回数を+1する。
        //     ・勝敗フラグにfalseを格納する。
        //
        //   あいこ：
        //     ・あいこの旨を標準出力する。
        //     ・あいこに該当するGameRecordクラスのインスタンスを生成して返却する。
        if (yourChoice == computersChoice) {
            System.out.println("あいこです。");
            return new GameRecord(rps.get(yourChoice), rps.get(computersChoice), gameResults.get("draw"));
        } else {
            if (yourChoice == 1) {
                if (computersChoice == 2) {
                    System.out.println("負けました…");
                    computer.win();
                    didYouWin = false;
                } else {
                    System.out.println("勝ちました！");
                    you.win();
                    didYouWin = true;
                }
            } else if (yourChoice == 2) {
                if (computersChoice == 3) {
                    System.out.println("負けました…");
                    computer.win();
                    didYouWin = false;
                } else {
                    System.out.println("勝ちました！");
                    you.win();
                    didYouWin = true;
                }
            } else {
                if (computersChoice == 1) {
                    System.out.println("負けました…");
                    computer.win();
                    didYouWin = false;
                } else {
                    System.out.println("勝ちました！");
                    you.win();
                    didYouWin = true;
                }
            }
        }

        // ■ ユーザーの勝ち負けによって、以下の値を返却してください。
        // 機能詳細：
        //   ユーザーが勝った場合：
        //     ユーザーの勝利に該当するGameRecordクラスのインスタンスを生成して返却する。
        //
        //   コンピューターが勝った場合：
        //     コンピュータの勝利に該当するGameRecordクラスのインスタンスを生成して返却する。
        if (didYouWin) {
            return new GameRecord(rps.get(yourChoice), rps.get(computersChoice), gameResults.get("win"));
        }
        return new GameRecord(rps.get(yourChoice), rps.get(computersChoice), gameResults.get("lose"));
    }
}
