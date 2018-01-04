package singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if (obj1 == obj2) {
            System.out.println("同じ");
        } else {
            System.out.println("違う");
        }

        System.out.println("End.");
    }
}
