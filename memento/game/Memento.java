package memento.game;

// Gamerの状態を表現するクラス

import java.util.ArrayList;
import java.util.List;

public class Memento {
    int money;
    ArrayList fruits;

    public int getMoney() {
        return money;
    }

    // 同一パッケージのクラスからしか使うことができない
    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList();
    }

    void addFruits(String fruit) {
        fruits.add(fruit);
    }

    List getFruits() {
        return (List) fruits.clone();
    }
}
