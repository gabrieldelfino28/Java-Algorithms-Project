package main;
/*
 * Author: Gabriel Delfino
 * Date: 10/07/2023 (DD/MM/YYYY format)
 * Objective: Resumir todos os exercícios num único projeto. (Resume all of the activities one unique project folder.)
 * Warning: Some variables might be in portuguese and project built in Java 17.
 */

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    JButton button1, button2, button3, button4, button5;
    JLabel text;

    public Main() {
        super("Menu :)");
        Container screen = getContentPane();
        setLayout(null);
        text = new JLabel("Main Menu of Exercises");
        text.setBounds(20, 0, 250, 30);
        text.setFont(new Font("Tahoma", Font.BOLD, 12));
        screen.add(text);

        button1 = new JButton("1- Decision Structures");
        button1.setBounds(20, 30, 200, 28);
        screen.add(button1);
        button1.addActionListener(e -> {
            DecisionStructure batch_1 = new DecisionStructure();
            batch_1.main();
        });

        button2 = new JButton("2- Loop Structures");
        button2.setBounds(20, 70, 200, 28);
        screen.add(button2);
        button2.addActionListener(e -> {
            LoopStructure batch_2 = new LoopStructure();
            batch_2.main();
        });

        button3 = new JButton("3- Arrays (Matrix and Vectors)");
        button3.setBounds(20, 110, 200, 28);
        screen.add(button3);
        button3.addActionListener(e -> {
            JOptionPane.showMessageDialog(null,"WIP");
        });

        button4 = new JButton("4- Recursive");
        button4.setBounds(20, 150, 200, 28);
        screen.add(button4);
        button4.addActionListener(e -> {
            JOptionPane.showMessageDialog(null,"WIP");
        });

        button5 = new JButton("Exit");
        button5.setBounds(20, 220, 200, 28);
        screen.add(button5);
        button5.addActionListener(e -> ConfirmDialog());
        setVisible(true);
        setResizable(false);
        setSize(250, 300);
        setLocationRelativeTo(null);
    }

    static int confirmOption;

    public static void main(String[] Args) {
        Main app = new Main();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*
         * "Main Menu of Exercises\n1- Decision structures\n2- Loop structures\n3- Arrays\n4- Recursive"
         */
    }

    static void ConfirmDialog() {
        do {
            confirmOption = JOptionPane.showConfirmDialog(null, "Do you indeed wish to exit the application?");
            // 0=yes, 1=no 2=cancel
            switch (confirmOption) {
                case 0 -> {
                    JOptionPane.showMessageDialog(null, "Exiting... :(");
                    System.exit(0);
                }
                case 1 -> JOptionPane.showMessageDialog(null, "Okie :)");

            }
        } while (confirmOption != 1);
    }
}
