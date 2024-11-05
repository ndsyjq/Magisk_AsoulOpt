package zhujiao;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a=n*10+m;
        System.out.println(a/16);
        System.out.println(a%16);
    }
}
