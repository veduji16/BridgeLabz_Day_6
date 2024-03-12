package Day_6;

import java.util.*;

public class Binary {

    // Convert the integer to binary
    public static void toBinaryString(int n) {
        int binaryNumber[] = new int[1000];

        int i = 0;
        while (n > 0) {
            binaryNumber[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binaryNumber[j]);
        }
    }

    // Swap the Nibbles
    private static int swapNibbles(int n) {
        int nibble1 = (n & 0x0F) << 4;
        int nibble2 = (n & 0x0F) >> 4;
        return nibble1 | nibble2;
    }

    // Function to check is a number is a power of 2

    private static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("Decimal: " + n);
        System.out.print("Binary: ");
        toBinaryString(n);
        System.out.println();

        int swappedNum = swapNibbles(n);
        System.out.println("Number after swapping nibbles: " + swappedNum);

        boolean isPowerOfTwo = isPowerOfTwo(swappedNum);
        System.out.println("Is the resultant number a power of 2? " + isPowerOfTwo);
    }
}