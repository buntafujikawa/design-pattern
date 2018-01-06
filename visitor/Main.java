package visitor;

public class Main {
    public static void main(String[] args) {
        try {
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory usrdir = new Directory("usr");
            Directory yuki = new Directory("yuki");

            rootdir.add(bindir);
            rootdir.add(usrdir);
            bindir.add(new File("vi", 10000));

            rootdir.accept(new ListVisitor());

            usrdir.add(yuki);
            yuki.add(new File("diary.html", 100));

            rootdir.accept(new ListVisitor());
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
