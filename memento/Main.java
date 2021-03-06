package memento;

import memento.game.*;

// ゲームを行う主人公を表現している

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);

        // mementoクラスはgameパッケージの中からしか見れないので、Gamerクラスにスナップショットを撮ってもらう必要が有る
        Memento memento = gamer.createMemento();

        for (int i = 0; i < 100; i++) {
            System.out.println("====" + i);
            System.out.println("現状:" + gamer);

            gamer.bet();

            System.out.println("所持金は" + gamer.getMoney() + "円になりました。");

            // Mementoの取り扱いの決定
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("現在の状態を保存");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("減ったので以前の状態にする");
                gamer.restoreMemento(memento);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

            System.out.println("");
        }
    }
}
