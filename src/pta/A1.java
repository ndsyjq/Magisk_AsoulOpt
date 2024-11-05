package pta;
import java.util.Scanner;
public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a=String.valueOf(n);
        for (int i = 2; i >=0; i--) {
            char b=a.charAt(i);
               if (b=='0'){
                   continue;
               }else if (b!='0'){
                   b='1';
               }
            System.out.print(a.charAt(i));
            }
        }
        }
