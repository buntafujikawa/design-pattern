package adapter;

import adapter.delegation.*;

// adapterを使用して文字列表示する
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
