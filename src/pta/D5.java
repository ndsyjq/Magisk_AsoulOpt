package pta;

import java.util.Arrays;
import java.util.Scanner;

public class D5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []a=new int[30];
        for (int i = 0; i < 30; i++) {
            a[i]=sc.nextInt();
            if(i==9){
                a[i]=0;
            }
        }
        double sum=0;
        for (int i = 0; i < 30; i++) {
            sum+=a[i];
        }
        Arrays.sort(a);
        System.out.print(a[29]+" "+a[1]+" ");
        System.out.printf("%.2f",sum/29);
    }
}
