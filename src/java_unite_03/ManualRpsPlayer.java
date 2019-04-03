package java_unite_03;

import java.util.Scanner;

public class ManualRpsPlayer extends Player implements RPSChoosable {
    private Scanner scan = new Scanner(System.in);

    public ManualRpsPlayer(String name) {
        super(name);
    }

    // ■ ユーザーが出す手を返却してください。
    public int chooseHand() {
        RpsStringArrays rpsStringArrays = new RpsStringArrays();
        String[] rps = rpsStringArrays.getRps();

        int choice = scan.nextInt();
        System.out.println(getName() + "の選択 : " + rps[choice]);
        return choice;
    }
}
