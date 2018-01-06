package composite;

// ディレクトリエントリを表現するもの
public abstract class Entry {
    public abstract String getName();

    public abstract int getSize();

    // ファイルに対してaddをしてしまった場合にthrowされる
    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
