package pta;

import java.util.Scanner;

public class C1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 100; i++) {
            if(i%2!=0&&i%3!=0&&i%5!=0) System.out.println(i);
        }
    }
}
