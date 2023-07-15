package main;
/*
 * Author: Gabriel Delfino
 * Date: 10/07/2023 (DD/MM/YYYY format)
 * Objective: Solve exercises from the first batch: 16 - 30.
 * Warning: Most of the Variables might be in portuguese, though the input text from the menus is in english.
 */

import main.DSmethods.Batch_16.Dmethods;
import main.DSmethods.Batch_16.liquidWage;

import javax.swing.*;

public class DecisionStructure {

    Dmethods m = new Dmethods(); //Extra Methods and functions will be here.

    public void main() {

        int Menu;
        String Label = """
                Batch 1 - Decision Structure
                0- To exit
                1- Liquid Wage (16)
                2- Liter Quantity Calculus (17)
                3- Integer value difference (18)
                4- Biggest real/double value (19)
                5- Second degree Equation (20)
                6- Average Grade (21)
                7- Values in Ascending order (22)
                8- 3 Numbers in ascending order and the 4th random (23)
                9- To see if a number is divisible by 2 and 3 (24)
                10- Game Start and End Timing (25)
                11- Verify if biggest value is the multiple of the smaller value (26)
                12- (27)
                13- (28)
                14- (29)
                15- (30)\s""";
        do {
            Menu = Integer.parseInt(JOptionPane.showInputDialog(Label));
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
                case 11 -> Ex_26();
                case 12 -> Ex_27();
                case 13 -> Ex_28();
                case 14 -> Ex_29();
                case 15 -> Ex_30();
                default -> JOptionPane.showMessageDialog(null, "Invalid input, please try again.");
            }
        } while (Menu != 0);

    }

    public void Ex_16() {
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


    public void Ex_17() {
        double tempoPercurso = Double.parseDouble(JOptionPane.showInputDialog("Inform the route timing (hours): "));
        double velocidadeMedia = Double.parseDouble(JOptionPane.showInputDialog("Inform the Average Speed (m/s) : "));
        double quantidadeLitros = m.Speed_LiquidQuantity_17(tempoPercurso, velocidadeMedia);

        JOptionPane.showMessageDialog(null, "Liters quantity: " + quantidadeLitros);

    }

    public void Ex_18() {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Inform the 1st value"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Inform the 2nd value"));
        int dif = m.Difference_Calculation_18(num1, num2);

        JOptionPane.showMessageDialog(null, "Result of the difference between the largest and smallest value: " + dif);

    }

    public void Ex_19() {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Inform the 1st value"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Inform the 2nd value"));

        double biggestNum = m.RealLargestNumber_19(num1, num2);

        JOptionPane.showMessageDialog(null, "Largest value: " + biggestNum);
    }

    public void Ex_20() {
        double A = Double.parseDouble(JOptionPane.showInputDialog("Inform the A value"));
        double B = Double.parseDouble(JOptionPane.showInputDialog("Inform the B value"));
        double C = Double.parseDouble(JOptionPane.showInputDialog("Inform the C value"));

        double Dt = m.Delta_20(A, B, C);
        System.out.println(Dt);
        if (Dt < 0) {
            JOptionPane.showMessageDialog(null, "No real X (roots) values found");
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

    public void Ex_21() {
        double[] nota = new double[4];
        double media = 0;
        for (int i = 0; i < 4; i++) {
            nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Inform the " + (i + 1) + " ° grade: "));
            media += nota[i];
        }
        media /= 4; //media = media /4;
        JOptionPane.showMessageDialog(null, "The average grade is " + media);
    }


    public void Ex_22() {
        int number1 = Integer.parseInt(JOptionPane.showInputDialog("Inform the first number: "));
        int number2 = Integer.parseInt(JOptionPane.showInputDialog("Inform the second number: "));
        int[] order = new int[2];

        order = m.AscendingOrder_22(order, number1, number2); //Ordering Function

        JOptionPane.showMessageDialog(null, "Ascending order: " + order[0] + " " + order[1]);
    }

    public void Ex_23() {
        int[] num = new int[4];
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + " | 3 numbers in order and last one random: "));
        }

        m.Ordering_23(num);

    }

    public void Ex_24() {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Inform a value: "));
        m.DivisibleNumber_24(number);

    }

    public void Ex_25() {

    }

    public void Ex_26() {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Inform a value: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Inform a value: "));

        m.Ordering_26(num1, num2);
    }

    public void Ex_27() {
        double numVoltas = Double.parseDouble(JOptionPane.showInputDialog("Inform the turns quantity"));
        double extensaoCircuito = Double.parseDouble(JOptionPane.showInputDialog("Inform the circuit extension (in meters)"));
        double tempo = Double.parseDouble(JOptionPane.showInputDialog("Inform the duration of the race (in minutes)"));

        double velocidadeMedia = m.AverageSpeed_27(numVoltas, extensaoCircuito, tempo);
        JOptionPane.showMessageDialog(null, "The Average speed (km/h) is " + velocidadeMedia);

    }

    public void Ex_28() {
    }

    public void Ex_29() {
    }

    public void Ex_30() {
    }
}
