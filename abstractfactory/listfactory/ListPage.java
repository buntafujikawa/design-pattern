package abstractfactory.listfactory;

import abstractfactory.factory.Page;

public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    public String makeHTML() {
        // 省略
        StringBuffer buffer = new StringBuffer();
        return buffer.toString();
    }
}
