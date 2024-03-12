package Day_6;

import java.util.*;

public class Temperature_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose conversion: ");
        System.out.println("1. Farenheit to Celcius: ");
        System.out.println("2. Celcius to Farenheit: ");
        System.out.print("Enter your choice(1 or 2): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Enter the temperature in Fahrenheit: ");
            double temp = sc.nextDouble();
            double calculate = (temp - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + calculate);
        } else if (choice == 2) {
            System.out.println("Enter the temperature in Celcius: ");
            double temp = sc.nextDouble();
            double calculate = (temp * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + calculate);
        } else {

            System.out.println("Invalid choice. Please select 1 or 2. ");
        }
        sc.close();
    }
}
