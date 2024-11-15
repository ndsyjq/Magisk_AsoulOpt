package pta;

import java.util.Scanner;
public class C5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = 20; i <= 60; i++) {
            for (int j = 20; j <= 60; j++) {
                int c = 100 - i - j;
                if (c >= 20 && c <= 60) {
                    int lirun = (i * 8) + (j * 6) + (c * 4);
                    int shijian = i + (j * 3) + (c * 4);
                    if (lirun == a && shijian == b) {
                        System.out.println(i + " " + j + " " + c);
                        return;
                    }
                }
            }
        }
        System.out.println("没有合适的开课方案");
    }
}
