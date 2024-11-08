package pta;

import java.util.Scanner;

public class C4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 =sc.nextInt();
        double result ;
        if(n>23||n<=7){
            result=n1*0.3109;
        }
        else{
            result=n1*0.5609;
        }
        System.out.printf("%.2f",result);
    }
}
