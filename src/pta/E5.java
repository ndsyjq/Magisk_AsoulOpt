package pta;

import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0;
        int b=0;
        double avg=0;
        int a1=0;
        int b2=101;
        for (int i = 0; i < n; i++) {
            int c = sc.nextInt();
            int d = sc.nextInt();
            avg=avg+d;
            if(d>b){
                b=d;
                a=c;
            }
            if(d<b2){
                b2=d;
                a1=c;
            }
        }
        System.out.println(a+" "+b);
        System.out.println(a1+" "+b2);
        System.out.printf("%.1f",avg/n);
    }
}
