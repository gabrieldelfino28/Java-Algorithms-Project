package main.DSmethods.Batch_16;

public class liquidWage {
    public double hourQ;
    public double hourV;
    public double discount;
    public double desN;
    public double sB;
    public double sL;

    public liquidWage() {
        this(0, 0, 0, 0, 0, 0);
    }

    public liquidWage(double hourQuantity, double hourV, double discountP, double descendantsN, double bruteWage, double finalWage) {
        this.hourQ = hourQuantity;
        this.hourV = hourV;
        this.discount = discountP;
        this.desN = descendantsN;
        this.sB = bruteWage;
        this.sL = finalWage;
    }
}
