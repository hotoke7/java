package java_unite_03;

import java.util.ArrayList;
import java.util.List;

public class GameManager {
    public static void main(String[] args) {
        ManualPlayer you = new ManualPlayer("You");
        AutoPlayer computer = new AutoPlayer("Computer");
        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        List<Score> scores = new ArrayList<>();

        int gameCount = 1;
        System.out.println("じゃんけんゲームを始めます。");

        while (true) {
            System.out.println(gameCount + "回戦");
            rockPaperScissors.play(you, computer);
            boolean isFinished = checkWinCount(you, computer);

            if (isFinished) {
                break;
            }
            gameCount++;
        }
    }

    public static boolean checkWinCount(ManualPlayer you, AutoPlayer computer) {
        int yourWinCount = you.getWinCount();
        int computersWinCount = computer.getWinCount();

        System.out.println("======================================");
        if (yourWinCount == 2) {
            System.out.println(yourWinCount + "：" + computersWinCount + "で勝ちました！");
            return true;
        } else if (computersWinCount == 2) {
            System.out.println(yourWinCount + "：" + computersWinCount + "で負けました…");
            return true;
        }
        return false;
    }
}