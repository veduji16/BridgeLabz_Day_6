package Day_6;

import java.util.*;

// Prime Number
public class Prime_Number {
    private static void checkPrime(int n) {
        int count = 0;
        if (n < 2) {
            System.out.println("Not Prime");
            System.exit(0);
        }

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count > 2) {
            System.out.println("Not Prime Number");
        } else {
            System.out.println("Prime Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        checkPrime(n);
        sc.close();
    }
}
