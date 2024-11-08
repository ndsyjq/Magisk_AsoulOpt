package pta;

import java.util.Scanner;

public class aaa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int bai=0;
        int huang=0;
       for (int i = 0; i < 3; i++) {
           int c=sc.nextInt();
           if (c==0){
               bai++;
           }else if (c==1){
               huang++;
           }
       }
       if (bai==3){
           System.out.println("冠军是百灵鸟老师："+a+"+"+bai);
       }else if (huang==3){
           System.out.println("冠军是小黄莺老师："+b+"+"+huang);
       }else if (a>b){
           System.out.println("冠军是百灵鸟老师："+a+"+"+bai);
       }else {
           System.out.println("冠军是小黄莺老师："+b+"+"+huang);
       }
    }
}
