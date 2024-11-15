package pta;

import java.util.Scanner;

public class A5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res=0;
        while (n>0){
            if (n % 10 % 2 != 0) {
                res = res + n % 10;
            }
            n=n/10;
        }
        System.out.println(res);
    }
}
