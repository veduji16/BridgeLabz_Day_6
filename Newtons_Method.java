package Day_6;

import java.util.*;

public class Newtons_Method {

    private static double sqrt(double c) {
        if (c < 0) {
            return Double.NaN;
        }
        double t = c;
        double epsilon = 1e-15;

        while (Math.abs(t - c / t) > epsilon * t) {
            t = 0.5 * (t + c / t);
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextInt();

        double result = sqrt(c);
        System.out.println("Square root of " + c + " is appoximately: " + result);
        sc.close();
    }
}