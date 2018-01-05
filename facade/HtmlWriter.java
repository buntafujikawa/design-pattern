package facade;

import java.io.IOException;
import java.io.Writer;

public class HtmlWriter {
    private Writer writer;

    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }

    // 諸々省略
    public void title(String title) throws IOException {
        writer.write("<title>" + title + "</title>");
    }

    public void paragraph(String msg) throws IOException {

    }

    public void link(String href, String caption) throws IOException {

    }

    public void mailto(String mailaddr, String username) throws IOException {

    }

    public void close() throws IOException {

    }
}
