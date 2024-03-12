package Day_6;

import java.util.*;

public class Vending_Machine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the change in Rs: ");
        int change = sc.nextInt();

        int notes[] = { 1000, 500, 100, 50, 10, 5, 2, 1 };

        System.out.println("Minimum number of notes needed: ");
        for (int note : notes) {
            int count = change / note;
            if (count > 0) {
                System.out.println(note + " Rs notes: " + count);
                change = change % note;
            }
        }
        sc.close();
    }
}
