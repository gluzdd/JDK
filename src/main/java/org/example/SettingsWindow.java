package org.example;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*Добавить на экран компоновщик-сетку с одним столбцом и добавить над
существующей кнопкой следующие компоненты в заданном порядке: JLabel
 с заголовком «Выберите режим игры», сгруппированные в ButtonGroup
 переключаемые JRadioButton с указанием режимов «Человек против
 компьютера» и «Человек против человека», JLabel с заголовком «Выберите
 размеры поля», JLabel с заголовком «Установленный размер поля:», JSlider
 со значениями 3..10, JLabel с заголовком «Выберите длину для победы»,
  JLabel с заголовком «Установленная длина:», JSlider со значениями 3..10.
  */
/* 2 задача
Добавить компонентам интерактивности,
а именно, при перемещении ползунка слайдера
в соответствующих лейблах должны появляться текущие значения слайдеров.
Для этого необходимо добавить
к слайдеру слушателя изменений (как это было сделано для действия кнопки).
 */

/* 3задача
В методе обработчика нажатия кнопки необходимо заменить
     константы в аргументе вызова метода старта игры
     на текущие показания компонентов (какая радио-кнопка
    активна, значение слайдера размеров поля, значение слайдера выигрышной длины).
 4 задача
 Добавить автоматическое регулирование максимального значения у слайдера
 выигрышной длины при изменении значения слайдера размера поля*/
public class SettingsWindow extends JFrame {
    private static final int WINDOW_HEIGHT = 230;
    private static final int WINDOW_WIDTH = 350;


    JButton btnStart = new JButton("Start new game");
    JLabel label = new JLabel("Выберите режим игры");
    JLabel label2 = new JLabel("Выберите размеры поля");
    JLabel label3 = new JLabel("Установлены размеры поля");
    JLabel label4 = new JLabel("Выберите лину для победы");
    JLabel label5 = new JLabel("Установленная длина");
    JRadioButton jrb1 = new JRadioButton("Человек против компа");
    JRadioButton jrb2 = new JRadioButton("Человек против человека");
    ButtonGroup btnGroup = new ButtonGroup();
    JSlider js1 = new JSlider(3,10);
    JSlider js2 = new JSlider(3,10);

    SettingsWindow(GameWindow gameWindow) {
        setLocationRelativeTo(gameWindow);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLayout(new GridLayout(10, 1));

        add(label);
        btnGroup.add(jrb1);
        btnGroup.add(jrb2);
        js1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                label3.setText("Установлены размеры поля " + js1.getValue());
            }
        });
        js2.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                label5.setText("Установленная длина " + js2.getValue());
            }
        });
        add(jrb1);
        add(jrb2);
        add(label2);
        add(label3);
        add(js1);
        add(label4);
        add(label5);
        add(js2);

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameWindow.startNewGame(jrb1.isSelected() ? 0 : 1, js1.getValue(), js1.getValue(), js2.getValue());
                setVisible(false);
            }
        });
        add(btnStart);
    }
}
