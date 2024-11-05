package pta;

import java.util.Scanner;

public class D1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        double h=((2*k-1)*15.0)/(n+m);
        System.out.printf("%.1f",h);
    }
}
