package abstractfactory;

import abstractfactory.factory.*;

public class Main {
    public static void main(String[] args) {
        Factory factory = Factory.getFactory(args[0]);

        Link asahi = factory.createLink(("朝日新聞"), "http://www.asahi.com/");
        Tray traynews = factory.createTray("新聞");
        traynews.add(asahi);

        Page page = factory.createPage("Linkpage", "bob");
        page.add(traynews);
        page.output();
    }
}
