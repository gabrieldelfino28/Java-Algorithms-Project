package main;
/*
 * Author: Gabriel Delfino
 * Date: 10/07/2023 (DD/MM/YYYY format)
 * Objective: Solve exercises from the first batch: 16 - 30.
 * Warning: Most of the Variables might be in portuguese, though the input text from the menus is in english.
 */

import main.DSmethods.Dmethods;
import main.DSmethods.liquidWage;

import javax.swing.*;

public class DecisionStructure {

    Dmethods m = new Dmethods(); //Extra Methods and functions will be here.

    public void main() {

        int Menu;
        String Label = """
                Batch 1 - Decision Structure
                0- To exit
                1- Liquid Wage - (16)
                2- Liter Quantity Calculus - (17)
                3- Integer value difference - (18)
                4- Biggest real/double value - (19)
                5- Second degree Equation - (20)
                6- Average Grade - (21)
                7- Values in Ascending order - (22)
                8- 3 Numbers in ascending order and the 4th random - (23)
                9- To see if a number is divisible by 2 and 3 - (24)
                10- Game Start and End Timing - (25)
                11- Verify if biggest value is the multiple of the smaller value - (26)
                12- Average Speed of a Race Circuit - (27)
                13- Price of a Product based on the monthly sales - (28)
                14- Simple Investment system (kinda) - (29)
                15- Age calculation (including leap years) - (30)\s""";
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

        //Calculation
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
            JOptionPane.showMessageDialog(null, "X' value: " + x1 + " X'' values: " + x2);

        } else {
            double x1 = ((-B) + Math.pow(Dt, 0.5)) / (2 * A);
            double x2 = ((-B) - Math.pow(Dt, 0.5)) / (2 * A);
            JOptionPane.showMessageDialog(null, "X' value: " + x1 + " X'' values: " + x2);
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
            num[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + "º | 3 numbers in order and last one random: "));
        }
        m.Ordering_23(num);

    }

    public void Ex_24() {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Inform a value: "));
        m.DivisibleNumber_24(number);
    }

    public void Ex_25() {
        /*
         *  Objetive: Calculate the duration of a generic game, receiving the initial and ending time of the game.
         */

        int horaInicial = Integer.parseInt(JOptionPane.showInputDialog("Inform the initial hour (0 - 24)"));
        int minInicial = Integer.parseInt(JOptionPane.showInputDialog("Inform the initial minutes (0 - 60) "));
        int horaFinal = Integer.parseInt(JOptionPane.showInputDialog("Inform the final hour (0 - 24)"));
        int minFinal = Integer.parseInt(JOptionPane.showInputDialog("Inform the final minutes (0 - 24)"));

        int horaDuracao = m.HourCalculation_25(horaInicial, horaFinal);
        int minDuracao = m.MinuteCalculation_25(minInicial, minFinal);

        if (minDuracao > minInicial) {
            horaDuracao -= 1;
        }

        /*
         * Example/Test
         * 23 : 30  + 00:30 == 00:00 + 00:15 = 00:15 hence 45 mins + 02:00-> 02:45 duration
         * When the game ended 02 : 15
         * When the game started 23 : 15
         * 02 : 45
         */

        JOptionPane.showMessageDialog(null, "Game duration: " + horaDuracao + " hours and " + minDuracao + " minutes.");
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
        double precoInicial = Double.parseDouble(JOptionPane.showInputDialog("Inform the initial price"));
        double valorMensal = Double.parseDouble(JOptionPane.showInputDialog("Inform the monthly value"));
        double precoAtual = m.NewPriceCalculation_28(precoInicial, valorMensal);

        JOptionPane.showMessageDialog(null, "The new price of the product 'x' will be: " + precoAtual);
    }

    public void Ex_29() {
        int tipoInvestimento;
        do {
            tipoInvestimento = Integer.parseInt(JOptionPane.showInputDialog("Inform the type of investment.\n1 - Savings 2 - Fixed Income"));
            if (tipoInvestimento != 1 && tipoInvestimento != 2) {
                JOptionPane.showMessageDialog(null, "Invalid input.");
            }
        } while (tipoInvestimento != 1 && tipoInvestimento != 2);
        double valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Inform the value of the investment"));
        double valorNovo = m.NewValueInvestment_29(tipoInvestimento, valorInvestimento);

        JOptionPane.showMessageDialog(null, "New value after 30 days will be: " + valorNovo);
    }

    public void Ex_30() {

        int dia0 = Integer.parseInt(JOptionPane.showInputDialog("Inform your birthday day"));
        int mes0 = Integer.parseInt(JOptionPane.showInputDialog("Inform your birthday month"));
        int ano0 = Integer.parseInt(JOptionPane.showInputDialog("Inform your birthday year"));

        int dia1 = Integer.parseInt(JOptionPane.showInputDialog("Inform your current day"));
        int mes1 = Integer.parseInt(JOptionPane.showInputDialog("Inform your current month"));
        int ano1 = Integer.parseInt(JOptionPane.showInputDialog("Inform your current year"));

        if (dia1 < dia0) { //If the current day is < than the bday then ...
            mes1 -= 1;
            if (mes1 < 8) { //if it's before August
                if (mes1 == 2) { //if it's Feb
                    if (ano1 % 4 == 0) { //Checking if Fab is in a leap year or not
                        dia1 += 29;
                    } else {
                        dia1 += 28;
                    }
                } else if (mes1 % 2 > 0 || mes1 == 0) { //if it's not feb, then check if it's pairs(evens) or odds
                    dia1 += 31;
                } else {
                    dia1 += 30;
                }
            } else if (mes1 % 2 == 0) {//After august (including august)
                dia1 += 31;//even
            } else {
                dia1 += 30;//odd
            }
        }

        if (mes1 < mes0) {
            ano1 -= 1;
            mes1 += 12;
        }
        int anodiff = ano1 - ano0;
        int mesdiff = mes1 - mes0;
        int diadiff = dia1 - dia0;

        JOptionPane.showMessageDialog(null, "Your age is: " + anodiff + " years, " + mesdiff + " months and " + diadiff + " days.");
    }
}
