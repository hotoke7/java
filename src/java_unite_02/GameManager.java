package java_unite_02;

public class GameManager {
    public static void main(String[] args) {
        // Lesson Java一貫② じゃんけんゲーム②
        // 【問題】3回2勝制のじゃんけんゲームを作成してください。
        // Java一貫① じゃんけんゲーム①のコードを適切に利用してください。

        // ■ ユーザーを示す、Playerのインスタンスを作成してください。
        Player you = new Player();

        // ■ コンピューターを示す、Playerのインスタンスを作成してください。
        Player computer = new Player();

        // ■ ゲームの管理を行う、GameManagerのインスタンスを作成してください。
        RockPaperScissors rockPaperScissors = new RockPaperScissors();

        // ■ 以下を標準出力してください。
        // じゃんけんゲームを始めます。
        System.out.println("じゃんけんゲームを始めます。");

        // ■ ユーザーかコンピューター、どちらかが2勝するまでゲームを繰り返してください。
        //    まだ決着がつかなかった場合、カウントを増やしてください。
        while (!rockPaperScissors.play(you, computer)) {
            rockPaperScissors.nextRound();
        }
    }
}
