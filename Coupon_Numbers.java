package Day_6;

// Coupons Numbers

import java.util.*;
import java.util.Random;
import java.util.Set;

public class Coupon_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Set<Integer> distinctCoupons = new HashSet<>();

        Random random = new Random();

        int totalRandomNumbers = 0;

        while (distinctCoupons.size() < n) {
            int randomCoupon = random.nextInt(n) + 1;

            distinctCoupons.add(randomCoupon);
            totalRandomNumbers++;
        }
        System.out.println("Total random numbers needed to obtain all distinct coupons: " + totalRandomNumbers);
        sc.close();
    }
}
