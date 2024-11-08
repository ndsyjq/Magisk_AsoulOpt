package pta;

import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       double a = sc.nextDouble();
       double b = sc.nextDouble();
       if (a>=0&&a<=23){
           if (a>=5&&a<22&&b>3){
               System.out.print("共花费");
               System.out.printf("%.2f",(b-3)*2+8);
           }
           else if (a<5||a>=22&&b>3){
                System.out.print("共花费");
               System.out.printf("%.2f",(b-3)*(2*1.3)+8);
           }else {
               System.out.println("共花费8元");
           }
       }else {
           System.out.println("时间错误");
       }
    }
}
