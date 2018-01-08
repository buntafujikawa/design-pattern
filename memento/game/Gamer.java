package memento.game;

import java.util.*;

public class Gamer {
    private int money;
    private List fruits = new ArrayList();
    private Random random = new Random();
    private static String[] fruitsname = {
        "りんご", "ぶどう", "バナナ","みかん",
    };

    public Gamer(int monery) {
        this.money = monery;
    }

    public int getMoney() {
        return this.money;
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.print("金増える");
        } else if (dice == 2) {
            money /= 2;
            System.out.print("金減る");
        } else if (dice == 6) {
            String f = getFruits();
            System.out.print("フルーツ");
            fruits.add(f);
        } else {
            System.out.print("何もなし");
        }
    }

    // スナップショットをとる
    public Memento createMemento() {
        Memento m = new Memento(money);
        Iterator it = fruits.iterator();

        while (it.hasNext()) {
            String f = (String) it.next();
            if (f.startsWith("美味しい")) {
                m.addFruits(f);
            }
        }
        return m;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }

    public String toString() {
        return "[money = " + money + ", fruits = " + fruits + "]";
    }

    private String getFruits() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "美味しい";
        }
        return prefix + fruitsname[random.nextInt(fruitsname.length)];
    }
}
