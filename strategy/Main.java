package strategy;

public class Main {
    public static void main(String[] args) {
        int seed1 = Integer.parseInt(args[0]);
        int seed2 = Integer.parseInt(args[1]);

        Player player1 = new Player("Taro", new WinnerStrategy(seed1));
        Player player2 = new Player("Hana", new ProbStrategy(seed2));

        Hand nextHand1 = player1.nextHand();
        Hand nextHand2 = player2.nextHand();

        if (nextHand1.isStrongerThan(nextHand2)) {
            System.out.println("player1");
            player1.win();
            player2.lose();
        } else if (nextHand2.isStrongerThan(nextHand1)) {
            System.out.println("player2");
            player1.lose();
            player2.win();
        } else {
            System.out.println("even");
        }
    }
}
