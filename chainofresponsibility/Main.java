package chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        Support alice = new NoSupport("Alice");
        Support diana = new NoSupport("Diana");
        Support bob = new LimitSupport("Bob", 100);

        // 連鎖の形成
        alice.setNext(diana).setNext(bob);

        for (int i = 0; i < 500; i += 33) {
            alice.support(new Trouble(i));
        }
    }
}
