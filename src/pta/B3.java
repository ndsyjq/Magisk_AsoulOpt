package pta;

import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean d=false;
        if(a>=2000&&a<=2008){
            if(b>=1&&b<=12){
                    if(b%2==0&&b!=2){
                        if(c>=1&&c<=30){
                            d=true;
                        }
                    }
                    if(b%2!=0){
                        if(c>=1&&c<=31){
                            d=true;
                        }
                    }
                    else {
                        if(a==2000||a==2004||a==2008){
                            if(c>=1&&c<=29){
                                d=true;
                            }
                        }
                        else {
                            if(c>=1&&c<=28){
                                d=true;
                            }
                        }
                    }
            }
        }
        if(d){
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }
    }
}
