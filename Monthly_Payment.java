package Day_6;

import java.util.*;

public class Monthly_Payment {
    public static double calculateMonthlyPaymemnt(int P, int Y, double R) {
        double r = R / (12 * 100);

        int n = 12 * Y;
        double monthlyPayment = (P * r) / (1 - Math.pow((1 + r), (-n)));

        return monthlyPayment;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt();
        int Y = sc.nextInt();
        double R = sc.nextDouble();

        double monthlyPayment = calculateMonthlyPaymemnt(P, Y, R);

        System.out.println("Monthly Payment: " + monthlyPayment);
        sc.close();
    }
}
