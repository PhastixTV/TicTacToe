package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.OptionalDataException;

public class Gui {

    JFrame frame;
    Draw draw;
    JButton btnReset;

    static JButton btn[] = new JButton[9];
    static int state[] = new int[9];
    static int player = 0;
    static int gewinner = 0;

    public Gui() {
        frame = new JFrame();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setTitle("TicTacToe");

        for(int i = 0; i<btn.length; i++){
            btn[i] = new JButton();
            btn[i].setVisible(true);
            btn[i].addActionListener(new ActionHandler());
            btn[i].setFocusPainted(false);
            btn[i].setContentAreaFilled(false);
            btn[i].setBorder(null);
            frame.add(btn[i]);
        }

        ButtonPlacement.place();

        btnReset = new JButton("Reset");
        btnReset.setBounds(675, 500, 100, 40);
        btnReset.setVisible(true);
        btnReset.setBackground(new Color(51, 102, 153));
        btnReset.setForeground(Color.WHITE);
        btnReset.setFocusPainted(false);
        btnReset.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                Funktion.reset();

            }
        });

        frame.add(btnReset);

        draw = new Draw();
        draw.setBounds(0, 0, 800, 600);
        draw.setVisible(true);
        frame.add(draw);

        frame.setVisible(true);
    }
}
