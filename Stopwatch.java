package Day_6;

import java.util.*;

public class Stopwatch {

    private static String formatTime(long milliseconds) {
        long seconds = milliseconds / 1000;
        long remainingMilliseconds = milliseconds % 1000;
        return seconds + " seconds " + remainingMilliseconds + " milliseconds";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("...Stopwatch Program...");
        System.out.println("Press Enter to start the Stopwatch...");
        sc.nextLine();

        long startTime = System.currentTimeMillis();

        System.out.println("Stopwatch started. Press Enter to stop...");
        sc.nextLine();

        long endTime = System.currentTimeMillis();

        long elapsedTime = endTime - startTime;

        System.out.println("Elapsed time: " + formatTime(elapsedTime));
        sc.close();
    }
}
