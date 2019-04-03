package java_unite_03;

import java.util.Random;

public class AutoRpsPlayer extends Player implements RPSChoosable {
    private Random random = new Random();

    AutoRpsPlayer(String name) {
        super(name);
    }

    // ■ コンピュータが出す手を返却します。
    public int chooseHand() {
        RpsStringArrays rpsStringArrays = new RpsStringArrays();
        String[] rps = rpsStringArrays.getRps();

        int choice = random.nextInt(rps.length);
        System.out.println("コンピュータの選択 : " + rps[choice]);
        return choice;
    }
}
