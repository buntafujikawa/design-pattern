package proxy;

public class Printer implements Printable {
    private String name;

    public Printer() {
        heavyJob("Printerのインスタンスを生成中");
    }

    public Printer(String name) {
        this.name = name;

    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        System.out.println(string);
    }

    // Printerクラスのインスタンス生成にとても時間がかかると言う前提
    private void heavyJob(String msg) {
        System.out.println(msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println("完了");
    }
}
