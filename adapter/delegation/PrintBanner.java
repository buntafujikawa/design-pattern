// アダプターの役割
public class PrintBanner extends Print {
    private Banner banner;

    public printBanner(String string) {
        this.banner = new Banner(string);
    }

    public void printWeak() {
        banner.showWithParen();
    }

    public void printStrong() {
        banner.showWithAster();
    }
}
