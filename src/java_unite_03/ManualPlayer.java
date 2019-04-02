package java_unite_03;

import java.util.Scanner;

public class ManualPlayer extends Player implements RPSChoosable {

    private Scanner scan = new Scanner(System.in);

    public ManualPlayer(String name) {
        super(name);
    }

    // ■ ユーザーが出す手を返却してください。
    public int chooseHand(String[] rps) {
        int choice = scan.nextInt();
        System.out.println("あなたの選択 : " + rps[choice]);
        return choice;
    }
}
