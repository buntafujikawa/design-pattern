package factorymethod;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("bob1");
        Product card2 = factory.create("bob2");
        Product card3 = factory.create("bob3");

        card1.use();
        card2.use();
        card3.use();
    }
}
