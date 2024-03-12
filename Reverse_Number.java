package Day_6;

import java.util.*;

// Reverse Number

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse = 0, rem;

        while (n != 0) {
            rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n / 10;
        }
        System.out.println("Reverse Number: " + reverse);
        sc.close();
    }
}
