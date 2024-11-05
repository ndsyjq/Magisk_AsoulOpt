package pta;


import java.util.Scanner;

public class D3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long s=N/3600;
        long f=((N-s*3600)/60);
        long m=(N-s*3600-f*60);
        System.out.println(s%24+8+":"+f+":"+m);

    }
}
