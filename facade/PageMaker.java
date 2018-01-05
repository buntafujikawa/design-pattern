package facade;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {
    }

    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            Properties mailprop = Database.getProperties("maildata");
            String username = mailprop.getProperty(mailaddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));

            writer.title("Welcome to " + username + "'s page!");
            // 諸々省略

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
