package abstractfactory.listfactory;

import abstractfactory.factory.Tray;

public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>");
        buffer.append(caption);
        buffer.append("<ul>");
        // 省略
        buffer.append("</ul>");
        buffer.append("</li>");

        return buffer.toString();
    }
}
