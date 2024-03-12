package Day_6;

// import java.util.*;

// public class Day_Of_Week {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the day: ");
//         int d = sc.nextInt();

//         System.out.print("Enter the month: ");
//         int m = sc.nextInt();

//         System.out.print("Enter the year: ");
//         int y = sc.nextInt();

//         int y0 = y - (14 - m) / 12;
//         int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
//         int m0 = m + 12 * ((14 - m) / 12) - 2;
//         int d0 = (d + x + 31 * m0 / 12) % 7;

//         System.out.println(
//                 "Day of the week (0 = Sunday, 1 = Monday, 3 = Tuesday, 4 = Wednesday, 5 = Thursday, 6 = Friday, 7 = Saturday): "
//                         + d0);
//         sc.close();
//     }
// }

// Using Command-line arguments

public class Day_Of_Week {
    public static void main(String[] args) {
        int d = Integer.parseInt(args[0]);

        int m = Integer.parseInt(args[1]);

        int y = Integer.parseInt(args[2]);

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;

        System.out.println(
                "Day of the week (0 = Sunday, 1 = Monday, 2 = Tuesday, 3 = Wednesday, 4 = Thursday, 5 = Friday, 6 = Saturday): "
                        + d0);
    }
}
