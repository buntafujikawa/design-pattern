package strategy;

// こちらも簡素化
public class Player {
    private String name;
    private Strategy strategy;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand() {
        return strategy.nextHand();
    }

    public void win() {
        strategy.study(true);
    }

    public void lose() {
        strategy.study(false);
    }
}
