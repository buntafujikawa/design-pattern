package decorator;

public abstract class Border extends Display {
    // borderが囲む中身のこと
    // StringDisplay以外にもBorderクラスのサブクラスの可能性もある
    protected Display display;

    protected Border(Display display) {
        this.display = display;
    }
}
