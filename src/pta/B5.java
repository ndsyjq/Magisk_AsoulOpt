package pta;

import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int res=0;
        for (int i = 2; i <= N; i++) {
            boolean a=true;
            for (int j = 2; j <= i/2; j++) {
                if(i%j==0){
                    a=false;
                    break;
                }
            }
            if(a){
                res=res+i;
                System.out.println(i);
            }
        }
        System.out.println(res);
    }
}
