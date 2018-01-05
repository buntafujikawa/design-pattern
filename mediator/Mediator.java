package mediator;
// 相談役のインターフェース

public interface Mediator {
    // 管理するメンバーの生成
    public abstract void createColleagues();

    // いわゆる相談の部分
    public abstract void colleagueChanged();
}
