package main.LMethods;

public class LMethods {
    public int FuncSquare_Ex31(int num) {
        return num * num;
    }

    public double FuncFactorial_Ex32(double N) {
        double fat = 1;
        for (double i = N; i > 1; i--) {
            fat *= i; //fat*=1 -> fat = fat*i
        }
        return fat;
    }

    public double FuncSumSeries_Ex33(double n) {
        double sum = 0;
        for (double i = 1; i <= n; i++) {
            sum += (1 / i); //Again += means that variable is equal to itself + something, like sum+= 1/i means sum = sum + 1 / i
        }
        return sum;
    }

    public int[] FuncMultiplicationTable_Ex34(int N, int[] res) {
        for (int i = 0; i < 10; i++) {
            res[i] = N * (i + 1);
        }
        return res;
    }

    public int FuncOddsSum_Ex35(int n2, int n1) {
        int res = 0;
        for (int i = n1; i <= n2; i++) {
            if (i % 2 > 0) {
                System.out.println(i);
                res += i;
            }
        }
        return res;
    }

    public double FuncSumSeries_Ex36(double N) {
        double sum = 0;
        double fat;
        for (double i = 1; i <= N; i++) {
            sum += 1 / (fat = FuncFactorial_Ex32(i));
            System.out.println(fat);
        }
        return sum;
    }
    public StringBuilder FuncFibonacci_Ex37(int n){
        int term1 = 1;
        int term2 = -1;

        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            int fib = term1 + term2;
            term2 = term1;
            term1 = fib;
            result.append(" ").append(fib); //result +=(" "+fib); but using the right library to convert int to string
        }
        return result;
    }
}


