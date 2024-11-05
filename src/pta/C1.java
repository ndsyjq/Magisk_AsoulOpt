package pta;

import java.util.Scanner;

public class C1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int L = sc.nextInt();
        double L1= (double) (N * M + K * L) /(M+L);
        System.out.printf("%.2f",L1);
    }
}
