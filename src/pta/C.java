package pta;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {


        R r1 = new R();
        r1.F();
        R r2 = new R();
        r2.F();
        R r3 = new R();
        r3.F();
        R r4 = new R();
        r4.F();
        R r5 = new R();
        r5.F();
        R r6 = new R();
        r6.F();
        R r7 = new R();
        r7.F();
        while (true){
            Random rand = new Random();
        int a = rand.nextInt(6);
        switch (a) {
            case 0:
                System.out.println("10");
                break;
            case 1:
                System.out.println("J");
                break;
            case 2:
                System.out.println("Q");
                break;
            case 3:
                System.out.println("K");
                break;
            case 4:
                System.out.println("A");
                break;
                case 5:
                    System.out.println("2");
                    break;
//                    case 6:
//                        System.out.println("3");
//                        break;
//                        case 7:
//                            System.out.println("4");
//                            break;
        }
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            switch (x){
                case 1:r1.G();break;
                case 2:r2.G();break;
                case 3:r3.G();break;
                case 4:r4.G();break;
                case 5:r5.G();break;
                case 6:r6.G();break;
                case 7:r7.G();break;
            }
        }
    }
}
