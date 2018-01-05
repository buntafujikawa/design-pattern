package strategy;

import java.util.Random;

public class ProbStrategy implements Strategy {
    private Random random;

    private boolean won = false;

    private Hand prevHand;

    public ProbStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        // 省略のため常にランダムという戦略にする
        return Hand.getHand(random.nextInt(3));
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
