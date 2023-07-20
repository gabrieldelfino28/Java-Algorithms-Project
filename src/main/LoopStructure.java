package main;

import main.LMethods.LMethods;

import javax.swing.*;
import java.lang.*;

public class LoopStructure {

    LMethods m = new LMethods();

    public void main() {
        int Menu;
        String Label = """
                Batch 2 - Loop Structure
                0- To exit
                1- Number squares 10 to 15 - (31)
                2- Factorial - (32)
                3- Sum of Numbers Sequence (1 + 1/n) - (33)
                4- Multiplication Table - (34)
                5- Sum of Odds between two values - (35)
                6- Sum of Numbers Sequence (1 + 1/n!) - (36)
                7- Fibonacci Sequence- (37)
                8- L - (38)
                9- L - (39)
                10- L - (40)
                11- L - (41)
                12- L - (42)
                13- L - (43)
                14- L - (44)
                15- L (45)
                \s""";
        do {
            Menu = Integer.parseInt(JOptionPane.showInputDialog(Label));
            switch (Menu) {
                case 0 -> JOptionPane.showMessageDialog(null, "Returning to the main menu.");
                case 1 -> Ex_31();
                case 2 -> Ex_32();
                case 3 -> Ex_33();
                case 4 -> Ex_34();
                case 5 -> Ex_35();
                case 6 -> Ex_36();
                case 7 -> Ex_37();
                case 8 -> Ex_38();
                case 9 -> Ex_39();
                case 10 -> Ex_40();
                case 11 -> Ex_41();
                case 12 -> Ex_42();
                case 13 -> Ex_43();
                case 14 -> Ex_44();
                case 15 -> Ex_45();
                default -> JOptionPane.showMessageDialog(null, "Invalid input, please try again.");
            }
        } while (Menu != 0);
    }

    public void Ex_31() {
        /*
         * Objective: Calculation of the square of numbers between 10 and 15 (Interval) With function.
         */
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Inform an interval\ninform the 1st number:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Inform an interval\ninform the 2nd number:"));
        for (int i = num1; i <= num2; i++) {
            int square = m.FuncSquare_Ex31(i);
            JOptionPane.showMessageDialog(null, "Square of the number: " + i + " is " + square);
            System.out.println(square);
        }

    }

    public void Ex_32() {
        /*
         * Objective: Calculation of the factorial of any number typed by the user, with function.
         * WARNING: Factorial of numbers above 16, goes memory overflow and the results are showed as negative numbers or 0.
         */
        double num = Integer.parseInt(JOptionPane.showInputDialog("Factorial\nInform a number"));
        double fat = m.FuncFactorial_Ex32(num);

        JOptionPane.showMessageDialog(null, "Factorial of " + num + " is " + fat);
    }

    public void Ex_33() {
        /*
         * Objective: Receive a number and calculate a sum of number series -> 1 + 1/2 + 1/3 + ... + 1/N.
         */
        double num = Double.parseDouble(JOptionPane.showInputDialog("Inform a limit"));
        double sum = m.FuncSumSeries_Ex33(num);
        JOptionPane.showMessageDialog(null, "Sum of 1 + ... 1/" + num + "\nResult: " + sum);
    }

    public void Ex_34() {
        /*
         * Objective: Receive a number and show the multiplication table related to it -> N * 1 = x ... N * 10 = x
         * Here I used an integer Array to receive all the multiplication results, to show all the results at once
         * to the user, instead of opening 10 dialogue messages showing the result.
         */
        int[] res = new int[10];
        int num = Integer.parseInt(JOptionPane.showInputDialog("Inform a value: "));

        res = m.FuncMultiplicationTable_Ex34(num, res);

        JOptionPane.showMessageDialog(null, "Results of " + num +
                "\n" + num + " x 1 = " + res[0] +
                "\n" + num + " x 2 = " + res[1] +
                "\n" + num + " x 3 = " + res[2] +
                "\n" + num + " x 4 = " + res[3] +
                "\n" + num + " x 5 = " + res[4] +
                "\n" + num + " x 6 = " + res[5] +
                "\n" + num + " x 7 = " + res[6] +
                "\n" + num + " x 8 = " + res[7] +
                "\n" + num + " x 9 = " + res[8] +
                "\n" + num + " x 10 = " + res[9]);

    }

    public void Ex_35() {
        /*
         * Objective: Receive two numbers, and show the sum of the odds between these two.
         */
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Inform the 1st value: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Inform the 2nd value: "));
        int sum;

        if (num2 > num1) {
            sum = m.FuncOddsSum_Ex35(num2, num1);
        } else {
            sum = m.FuncOddsSum_Ex35(num1, num2);
        }

        JOptionPane.showMessageDialog(null, "The result of the sum of odds is " + sum);
    }

    public void Ex_36() {
        /*
         * Objective: Receive a value (N) and calculate a sum of series -> 1/1! + ... + 1/N! (Division + Factorial)
         */

        double num = Integer.parseInt(JOptionPane.showInputDialog("Inform a limit for the sum"));
        double sum = m.FuncSumSeries_Ex36(num);

        JOptionPane.showMessageDialog(null, "Sum results: " + sum);
    }

    public void Ex_37() {
        /*
         * Objective: Fibonacci sequence
         */

        int num = Integer.parseInt(JOptionPane.showInputDialog("Inform a limit for Fibonacci"));

        StringBuilder fibonacci = m.FuncFibonacci_Ex37(num);
        JOptionPane.showMessageDialog(null,"Fibonacci sequence: "+fibonacci);
    }

    public void Ex_38() {
        /*
         * Objective: Fibonacci series
         */


    }

    public void Ex_39() {
        /*
         * Objective: Fibonacci series
         */
    }

    public void Ex_40() {
        /*
         * Objective: Fibonacci series
         */
    }

    public void Ex_41() {
        /*
         * Objective: Fibonacci series
         */
    }

    public void Ex_42() {
        /*
         * Objective: Fibonacci series
         */
    }

    public void Ex_43() {
        /*
         * Objective: Fibonacci series
         */
    }

    public void Ex_44() {
        /*
         * Objective: Fibonacci series
         */
    }

    public void Ex_45() {
        /*
         * Objective: Fibonacci series
         */
    }
}
