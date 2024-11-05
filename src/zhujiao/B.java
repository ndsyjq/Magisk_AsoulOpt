package zhujiao;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = String.valueOf(a);
        for (int i = 1; i >= 0; i--) {
            char c = b.charAt(i);
            if (i == 1 && c == '0') {
                continue;
            }
            System.out.print(c);
        }
    }
}
