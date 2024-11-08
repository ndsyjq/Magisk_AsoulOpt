package pta;

import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        double n3=n1-n2;
        if(n3>5000){
            n3=(n3-5000)*0.3+300+400;
        } else if (n3>=3000) {
            n3=(n3-3000)*0.2+300;
        }
        else n3=0.1*n3;
        n3=n3+20*n;
        System.out.printf("%.1f", n3);
    }

}
