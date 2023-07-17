package main.DSmethods.Batch_16;

import javax.swing.*;

public class Dmethods {
    public double Speed_LiquidQuantity_17(double tP, double vM) {
        vM *= 3.6; //converting to km/h
        vM *= tP; //multiplying the route time with the km/h
        return vM / 12;
    }

    public int Difference_Calculation_18(int n1, int n2) {
        if (n1 > n2) {
            return n1 - n2;
        } else {
            return n2 - n1;
        }
    }

    public double RealLargestNumber_19(double n1, double n2) {
        return Math.max(n1, n2); //Shows the largest value of the variables
    }

    public double Delta_20(double a, double b, double c) {
        return ((b * b) - (4 * a * c));
    }

    public int[] AscendingOrder_22(int[] ord, int n1, int n2) {
        if (n1 > n2) {
            ord[0] = n2;
            ord[1] = n1;
        } else if (n1 < n2) {
            ord[0] = n1;
            ord[1] = n2;
        }
        return ord;
    }

    public void Ordering_23(int[] n) {
        if (n[3] > n[2]) {
            JOptionPane.showMessageDialog(null, "Order: " + n[0] + n[1] + n[2] + n[3]);
        }
        if (n[3] > n[1]) {
            JOptionPane.showMessageDialog(null, "Order: " + n[0] + n[1] + n[3] + n[2]);
        }
        if (n[3] > n[0]) {
            JOptionPane.showMessageDialog(null, "Order: " + n[0] + n[3] + n[1] + n[2]);
        }
        if (n[3] < n[0]) {
            JOptionPane.showMessageDialog(null, "Order: " + n[3] + n[0] + n[1] + n[2]);
        }

    }

    public void DivisibleNumber_24(int n) {
        if (n % 2 == 0 && n % 3 == 0) {
            JOptionPane.showMessageDialog(null, "This number: " + n + " is divisible by 2 and 3");
        } else {
            if (n % 2 == 0) {
                JOptionPane.showMessageDialog(null, "This number: " + n + " is only divisible by 2");
            }
            if (n % 3 == 0) {
                JOptionPane.showMessageDialog(null, "This number: " + n + " is only divisible by 3");
            } else {
                JOptionPane.showMessageDialog(null, "This number: " + n + " is not divisible by 2 nor 3");
            }
        }
    }

    public int HourCalculation_25(int hI, int hF) {
        if (hI < hF) {
            return hF - hI;
        } else {
            return (24 - hI) + hF;
        }
    }

    public int MinuteCalculation_25(int minInicial, int minFinal) {
        if (minInicial <= minFinal) {
            return minFinal - minInicial;
        } else {
            return (60 - minInicial) + minFinal;
        }
    }


    public void Ordering_26(int n1, int n2) {

        if (n1 > n2) {
            if (n1 % n2 == 0) {
                JOptionPane.showMessageDialog(null, "The Largest (" + n1 + ") is the multiple of the Smallest (" + n2 + ").");
            } else {
                JOptionPane.showMessageDialog(null, "The Largest (" + n1 + ") is NOT the multiple of the Smallest (" + n2 + ").");
            }
        }

        if (n2 > n1) {
            if (n2 % n1 == 0) {
                JOptionPane.showMessageDialog(null, "The Largest (" + n2 + ") is the multiple of the Smallest (" + n1 + ").");
            } else {
                JOptionPane.showMessageDialog(null, "The Largest (" + n2 + ") is NOT the multiple of the Smallest (" + n1 + ").");
            }
        }
    }

    public double AverageSpeed_27(double nV, double eC, double T) {
        T *= 60;
        return (nV * eC / T) * (3.6);
    }

    public double NewPriceCalculation_28(double pI, double vM) {
        if (vM < 500 && pI > 30) {
            return pI * 1.10; //10% more
        }
        if ((vM >= 500 && vM < 1000) && (pI >= 30 && pI < 80)) {
            return pI * 1.15; //15% more
        }
        if (vM >= 1000 && pI >= 80) {
            return pI * 0.95;
        }
        return pI;
    }

    public double NewValueInvestment_29(int tI, double vI) {
        switch (tI) {
            case 1 -> {
                return vI * 1.03;
            }
            case 2 -> {
                return vI * 1.05;
            }
        }
        return vI;
    }

}
