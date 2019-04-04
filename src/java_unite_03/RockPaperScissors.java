package java_unite_03;

public class RockPaperScissors {
    // Lesson Java一貫③ じゃんけんゲーム③
    // 【問題】以下のソースコードをもとに、RockPaperScissorsクラスを問題に従って変更してください。

    // じゃんけん配列
    // 以下のコードで「グー」「パー」「チョキ」の文字列を配列を宣言します。
    // アクセス修飾子をpublicで設定していますが、修正ができないようにstatic finalを付けました。
    public static final String[] rps = {"グー", "パー", "チョキ"};

    // ■ 「play」メソッドの引数を変更してください。
    // 引数1：ManualRpsPlayer ユーザー
    // 引数2：AutoRpsPlayer コンピューター
    // 返却値：GameRecord ゲームの記録
    public GameRecord play(ManualRpsPlayer you, AutoRpsPlayer computer) {
        // ゲーム結果配列
        // 以下の配列は、ゲームの結果を表す文字列を格納します。
        // GameRecordクラスのインスタンスを宣言するときに、配列の中の文字列を引数として渡します。
        // 各文字列の意味は以下の通りです。
        // 〇：ユーザーの勝ち
        // △：無勝負
        // ×：コンピューターの勝ち
        String[] outcomes = {"〇", "△", "×"};

        System.out.println("以下の選択肢の中で一つを選んでください。");

        for (int i = 0; i < rps.length; i++) {
            System.out.println(i + "：" + rps[i]);
        }

        System.out.println("番号を入力してください：");

        // ■ ユーザーが出す手を決めてください。
        int yourChoice = you.chooseHand();

        // ■ コンピュータが出す手を決めてください。
        int computersChoice = computer.chooseHand();

        // ■ ユーザーの勝ち負けを一時的に保存する変数を宣言してください。
        // 真偽値 ユーザーが勝ったかどうか
        boolean didYouWin;

        // ■じゃんけんの結果によって以下の動作を行う機能を作成してください。
        // 機能詳細：
        //   ユーザーが勝った場合：
        //     ・以下の内容を標準出力及びユーザーの勝利回数を＋1とする。
        //         出力内容：勝ちました！
        //     ・真偽値 ユーザーが勝ったかどうかにtrueを格納する。
        //   コンピューターが勝った場合：
        //     ・以下の内容を標準出力及びコンピューターの勝利回数を＋1とする。
        //         出力内容：負けました…
        //     ・真偽値 ユーザーが勝ったかどうかにfalseを格納する。
        //   無勝負の場合：
        //     ・以下の内容を標準出力する。
        //         出力内容：あいこです。
        //     ・以下の引数で「GameRecord」クラスのインスタンスを宣言して返却する。
        //         引数1：ユーザーが出す手
        //         引数2：コンピュータが出す手
        //         引数3：文字列「△」（文字列の配列「outcomes」より取得）
        if (yourChoice == computersChoice) {
            System.out.println("あいこです。");
            return new GameRecord(rps[yourChoice], rps[computersChoice], outcomes[1]);
        } else {
            if (yourChoice == 0) {
                if (computersChoice == 1) {
                    System.out.println("負けました…");
                    computer.win();
                    didYouWin = false;
                } else {
                    System.out.println("勝ちました！");
                    you.win();
                    didYouWin = true;
                }
            } else if (yourChoice == 1) {
                if (computersChoice == 2) {
                    System.out.println("負けました…");
                    computer.win();
                    didYouWin = false;
                } else {
                    System.out.println("勝ちました！");
                    you.win();
                    didYouWin = true;
                }
            } else {
                if (computersChoice == 0) {
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
        //     以下の引数で「GameRecord」クラスのインスタンスを宣言して返却する。
        //       引数1：ユーザーが出す手
        //       引数2：コンピュータが出す手
        //       引数3：文字列「〇」（文字列の配列「outcomes」より取得）
        //   コンピューターが勝った場合：
        //     以下の引数で「GameRecord」クラスのインスタンスを宣言して返却する。
        //       引数1：ユーザーが出す手
        //       引数2：コンピュータが出す手
        //       引数3：文字列「×」（文字列の配列「outcomes」より取得）
        if (didYouWin) {
            return new GameRecord(rps[yourChoice], rps[computersChoice], outcomes[0]);
        }
        return new GameRecord(rps[yourChoice], rps[computersChoice], outcomes[2]);
    }
}
