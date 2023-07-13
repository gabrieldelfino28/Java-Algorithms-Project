package main;
/*
 * Author: Gabriel Delfino
 * Date: 10/07/2023 (DD/MM/YYYY format)
 * Objective: Solve exercises from the first batch: 16 - 30.
 */

import main.DSmethods.Batch_16.liquidWage;

import javax.swing.*;
import java.math.*;

public class DecisionStructure {
    public void main() {

        int Menu;
        do {
            Menu = Integer.parseInt(JOptionPane.showInputDialog("""
                    Batch 1
                    1- Liquid Wage (16)
                    2- Liter Quantity Calculus (17)
                    3- Integer value difference (18)
                    4- Biggest real/double value (19)
                    5- Second degree Equation (20)
                    6- Average Grade (21)
                    7- Values in Ascending order (22)
                    8- (23)
                    9- (24)
                    10- (25)
                    11- (26)
                    12- (27)
                    13- (28)
                    14- (29)
                    15- (30)
                    0- To exit.\s"""));
            switch (Menu) {
                case 0 -> JOptionPane.showMessageDialog(null, "Returning to the main menu.");
                case 1 -> Ex_16();
                case 2 -> Ex_17();
                case 3 -> Ex_18();
                case 4 -> Ex_19();
                case 5 -> Ex_20();
                case 6 -> Ex_21();
                case 7 -> Ex_22();
                case 8 -> Ex_23();
                case 9 -> Ex_24();
                case 10 -> Ex_25();
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
        double tempoPercurso = Double.parseDouble(JOptionPane.showInputDialog("Inform the route timing (hours): "));
        double velocidadeMedia = Double.parseDouble(JOptionPane.showInputDialog("Inform the Average Speed (m/s) : "));

        velocidadeMedia *= 3.6; //converting to km/h
        velocidadeMedia *= tempoPercurso; //multiplying the route time with the km/h
        double quantidadeLitros = velocidadeMedia / 12;

        JOptionPane.showMessageDialog(null, "Liters quantity: " + quantidadeLitros);

    }

    public static void Ex_18() {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Inform the 1st value"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Inform the 2nd value"));

        int dif = Difference_Calculation_18(num1, num2);

        JOptionPane.showMessageDialog(null, "Result of the difference between the largest and smallest value: " + dif);

    }

    private static int Difference_Calculation_18(int n1, int n2) {
        if (n1 > n2) {
            return n1 - n2;
        } else {
            return n2 - n1;
        }
    }

    public static void Ex_19() {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Inform the 1st value"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Inform the 2nd value"));

        double biggestNum = RealLargestNumber(num1, num2);

        JOptionPane.showMessageDialog(null, "Largest value: " + biggestNum);
    }

    private static double RealLargestNumber(double n1, double n2) {
        return Math.max(n1, n2); //Shows the largest value of the variables
    }

    public static void Ex_20() {
        double A = Double.parseDouble(JOptionPane.showInputDialog("Inform the A value"));
        double B = Double.parseDouble(JOptionPane.showInputDialog("Inform the B value"));
        double C = Double.parseDouble(JOptionPane.showInputDialog("Inform the C value"));

        double Dt = Delta(A, B, C);
        System.out.println(Dt);
        if (Dt < 0) {
            JOptionPane.showMessageDialog(null, "No real X (roots) values");
        }

        if (Dt > 0) {
            //X = -b +- sqrt(Dt) / 2*a
            double x1 = ((-B) + Math.pow(Dt, 0.5)) / (2 * A);
            double x2 = ((-B) - Math.pow(Dt, 0.5)) / (2 * A);
            JOptionPane.showMessageDialog(null, "X' value: " + x1 + "X'' values: " + x2);

        } else {

            double x1 = ((-B) + Math.pow(Dt, 0.5)) / (2 * A);
            double x2 = ((-B) - Math.pow(Dt, 0.5)) / (2 * A);
            JOptionPane.showMessageDialog(null, "X' value: " + x1 + "X'' values: " + x2);
        }
    }

    private static double Delta(double a, double b, double c) {
        return (b * b) - (4 * a * c);
    }

    public static void Ex_21() {
        double[] nota = new double[4];
        double media=0;
        for(int i=0;i<4;i++){
            nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Inform the "+(i+1)+" ° grade: "));
            media += nota[i];
        }
        media /= 4;

        JOptionPane.showMessageDialog(null,"The average grade is "+media);
    }


    public static void Ex_22() {

    }

    public static void Ex_23() {

    }

    public static void Ex_24() {

    }

    public static void Ex_25() {

    }

    public static void Ex_26() {

    }

    public static void Ex_27() {

    }

    public static void Ex_28(){}

    public static void Ex_29(){}

    public static void Ex_30(){}
}
