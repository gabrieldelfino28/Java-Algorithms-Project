package main;
/*
 * Author: Gabriel Delfino
 * Date: 10/07/2023 (DD/MM/YYYY format)
 * Objective: Resumir todos os exercícios num único projeto. (Resume all of the activities one unique project folder.)
 * Warning: Some variables might be in portuguese and project built in Java 17.
 */

import javax.swing.*;

public class Main {
    static int optionMenu;
    static int confirmOption;

    public static void main(String[] Args) {

        DecisionStructure batch_1 = new DecisionStructure();
        do {
            optionMenu = Integer.parseInt(JOptionPane.showInputDialog("Main Menu of Exercises\n1- Decision structures\n2- Loop structures\n3- Arrays\n4- Simple ATM (Automatic Teller Machine) \n9- Exit"));
            switch (optionMenu) {
                case 1:
                    batch_1.main();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    break;
                case 9:
                    ConfirmDialog();
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid input, please try again.");
                    break;
            }
        } while (optionMenu != 9);
    }

    static void ConfirmDialog() {
        do {
            confirmOption = Integer.parseInt(JOptionPane.showInputDialog("Do you indeed wish to exit the application?\n1- Yes | 2- No"));
            switch (confirmOption) {
                case 1 -> {
                    JOptionPane.showMessageDialog(null, "Exiting...");
                    System.exit(0);
                }
                case 2 -> {
                    confirmOption = 1;
                    optionMenu = 0;
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Invalid input, please try again.");
                    optionMenu = 0;
                }
            }
        } while (confirmOption != 1);
    }
}
