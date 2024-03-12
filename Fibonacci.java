package Day_6;

import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c, count = 10;
        System.out.print(a + " " + b);

        for (int i = 2; i < count; ++i) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        sc.close();
    }
}
