package pta;

import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int n1=0;
        while (true){
            int a=sc.nextInt();
            if(a>=0) {
                if (a % 3 == 0 && a % 5 == 0 && a % 7 == 0) {
                    n++;
                    n1 += a;
                }
            }
            else break ;

        }
        System.out.println(n+" "+n1);
    }
}
