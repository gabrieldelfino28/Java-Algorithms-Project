package main;
/*
 * Author: Gabriel Delfino
 * Date: 10/07/2023 (DD/MM/YYYY format)
 * Objective: Solve exercises from the first batch: 16 - 30.
 */

import main.DSmethods.Batch_16.liquidWage;

import javax.swing.*;

public class DecisionStructure {
    public void main() {

        int Menu = 1;
        do {
            Menu = Integer.parseInt(JOptionPane.showInputDialog("Batch 1\n1- Liquid Wage (16)\n2- (17)\n3- (18)\n4- (19)\n5- (20)"));
            switch (Menu) {
                case 0 -> JOptionPane.showMessageDialog(null, "Returning to the main menu.");
                case 1 -> Ex_16();
                case 2 -> Ex_17();
                case 3 -> Ex_18();
                default -> JOptionPane.showMessageDialog(null, "Invalid input, please try again.");
            }
        } while (Menu != 0);
    }

    public static void Ex_16() {
        liquidWage sal = new liquidWage(); //Abstract class with all the data to calculate a generic Liquid Wage.

        //Inputs
        sal.hourQ = Double.parseDouble(JOptionPane.showInputDialog("Inform the hours quantity"));
        sal.hourV = Double.parseDouble(JOptionPane.showInputDialog("Inform the hours value"));
        sal.discount = Double.parseDouble(JOptionPane.showInputDialog("Inform the discount percentage"));
        sal.desN = Double.parseDouble(JOptionPane.showInputDialog("Inform the descendants quantity"));

        //Calculus
        sal.desN = sal.desN * 100;
        sal.discount = (sal.discount / 100);
        sal.sB = (sal.hourQ * sal.hourV);

        // Final Wage = Brutal Wage - (Brutal Wage * Discount percentage) + Descendants value
        sal.sL = (sal.sB - (sal.sL * sal.desN) + sal.desN);

        JOptionPane.showMessageDialog(null, "The Final value of the Liquid Wage is: " + sal.sL);
    }


    public static void Ex_17() {

    }

    public static void Ex_18() {

    }

}
