package visitor;

import java.util.Iterator;

public class ListVisitor extends Visitor {
    private String currentdir = "";

    @Override
    public void visit(File file) { // ファイルを訪問した時に呼ばれる
        System.out.println(currentdir + "/" + file);
    }

    @Override
    public void visit(Directory directory) { // ディレクトリを訪問した時に呼ばれる
        System.out.println(currentdir + "/" + directory);

        String savedir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        Iterator it = directory.iterator();

        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.accept(this);
        }

        currentdir = savedir;
    }
}
