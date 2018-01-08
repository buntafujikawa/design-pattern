package state;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements ActionListener, Context {
    private TextField textClock = new TextField(60);
    private TextArea textScreen = new TextArea(10, 60);
    private Button buttonUse = new Button("金庫使用");
    private Button buttonAlarm = new Button("非常ベル");
    private Button buttonPhone = new Button("通常通話");
    private Button buttonExit = new Button("終了");

    private State state = DayState.getInstance();

    public SafeFrame(String title) {
        // 表示部分を省略

        buttonUse.addActionListener(this);
        buttonAlarm.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);
    }

    // ボタンが押されたら
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == buttonUse) {
            // 昼間と夜間でstateのインスタンスが違う
            state.doUse(this);
        } else if (actionEvent.getSource() == buttonAlarm) {
            state.doAlarm(this);
        } else if (actionEvent.getSource() == buttonPhone) {
            state.doPhone(this);
        } else if (actionEvent.getSource() == buttonExit) {
            System.exit(0);
        } else {
            System.out.println("?");
        }
    }

    // 時刻の設定
    @Override
    public void setClock(int hour) {
        // ログと表示は省略
        state.doClock(this, hour);
    }

    // 状態変化
    @Override
    public void changeState(State state) {
        this.state = state;
    }

    // 警備センター呼び出し
    @Override
    public void callSecurityCenter(String msg) {
        textScreen.append("call!" + msg + "\n");
    }

    // 警備センター記録
    @Override
    public void recordLog(String msg) {
        textScreen.append("record..." + msg + "\n");
    }
}
