package command;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame implements ActionListener, MouseMotionListener, WindowListener {

    // 履歴はMainのインスタンスとDrawCanvasのインスタンスで共有されている
    private MacroCommand history = new MacroCommand();

    private DrawCanvas canvas = new DrawCanvas(400, 400, history);

    private JButton clearButton = new JButton("clear");

    public Main(String title) {
        super(title);

        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);
        clearButton.addActionListener(this);

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);

        Box mainBox = new Box(BoxLayout.Y_AXIS);
        buttonBox.add(buttonBox);
        buttonBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        show();
    }

    // ActionListener用
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == clearButton) {
            history.clear();
            canvas.repaint();
        }
    }

    // MouseMonitorListener用
    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        Command cmd = new DrawCommand(canvas, mouseEvent.getPoint());
        history.append(cmd);
        cmd.execute();
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {}

    // WindowListener用
    @Override
    public void windowClosing(WindowEvent windowEvent) {
        System.exit(0);
    }

    @Override
    public void windowOpened(WindowEvent windowEvent) {}

    @Override
    public void windowClosed(WindowEvent windowEvent) {}

    @Override
    public void windowIconified(WindowEvent windowEvent) {}

    @Override
    public void windowDeiconified(WindowEvent windowEvent) {}

    @Override
    public void windowActivated(WindowEvent windowEvent) {}

    @Override
    public void windowDeactivated(WindowEvent windowEvent) {}

    public static void main(String[] args) {
        new Main("Command Pattern Sample");
    }
}