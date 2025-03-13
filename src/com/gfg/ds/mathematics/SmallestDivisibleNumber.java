package com.gfg.ds.mathematics;

import java.util.Scanner;

public class SmallestDivisibleNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        long result = getSmallestDivNum(number);
        System.out.println(result);
        sc.close();
    }

    public static long gcd(long num1, long num2) {
        if (num1 == 0)
            return num2;
        else
            return gcd(num2 % num1, num1);
    }

    public static long getSmallestDivNum(int n) {
        // code here
        long result = 1;
        for (long i = 2; i <= n; i++) {
            long num1 = result * i;
            long num2 = gcd(result, i);
            result = num1 / num2;
        }
        return result;
    }
}
