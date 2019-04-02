package java_unite_03;

import java.util.Random;

public class AutoPlayer extends Player implements RPSChoosable {

    private Random random = new Random();

    public AutoPlayer(String name) {
        super(name);
    }

    // ■ コンピュータが出す手を返却します。
    public int chooseHand(String rps[]) {
        int choice = random.nextInt(rps.length);
        System.out.println("コンピュータの選択 : " + rps[choice]);
        return choice;
    }
}
