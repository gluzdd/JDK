package lesson2.circles;

import lesson2.circles.Ball;
import lesson2.common.CanvasRepaintListener;
import lesson2.common.Interactable;
import lesson2.common.MainCanvas;
import lesson2.common.Sprite;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame implements CanvasRepaintListener {
    private static final int POS_X = 1200;
    private static final int POS_Y = 200;
    private static final int WINDOW_WIDTH = 600;
    private static final int WINDOW_HEIGHT = 400;
    private final Interactable[] interactables = new Interactable[10];

    private MainWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(POS_X, POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Circles");
        for (int i = 0; i < interactables.length; i++) {
            interactables[i] = new Ball();
        }

        MainCanvas canvas = new MainCanvas(this);
        add(canvas);
        setVisible(true);
    }
    @Override
    public void onDrawFrame(MainCanvas canvas, Graphics g, float deltaTime) {
        update(canvas, deltaTime);
        render(canvas, g);
    }

    private void update(MainCanvas canvas, float deltaTime) {
        for (int i = 0; i < interactables.length; i++) {
            interactables[i].update(canvas, deltaTime);
        }
    }
    private void render(MainCanvas canvas, Graphics g) {
        for (int i = 0; i < interactables.length; i++) {
            interactables[i].render(canvas, g);
        }
    }

    public static void main(String[] args) {
        new lesson2.bricks.MainWindow();
    }
}
