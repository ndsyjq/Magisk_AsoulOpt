package pta;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double e=(b*b)-(4*a*c);
        int e1=0;
        if(e<0) {System.out.print(0+" ");}
        else if (e==0) {
            System.out.println(1+" ");
            e1=1;
        }
        else {
            System.out.print(2+" ");
            e1=2;
        }
        if(e1==1){
        double x1=-b+Math.sqrt(e)/(2*a);
            System.out.println(x1);
        }
        if(e1==2){
            double x1=-b-Math.sqrt(e)/(2*a);
            double x2=-b+Math.sqrt(e)/(2*a);
            System.out.print(x2+" "+x1);
        }
    }
}
