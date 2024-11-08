package pta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class D4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            a.add(sc.nextInt());
        }
        boolean b = false;
        if (a.contains(0) && a.contains(1)) {
            b = true;
        }
        if (b) {
            if (N > M) {
                int n = 0;
                for (Integer integer : a) {
                    if (integer == 0) {
                        n++;
                    }
                }
                System.out.println("冠军是百灵鸟老师：" + N + "+" + n);
            } else {
                int n = 0;

                for (Integer integer : a) {
                    if (integer == 0) {
                        n++;
                    }
                }
                System.out.println("冠军是小黄莺老师：" + M + "+" + n);
            }
        } else if (a.contains(0)) {
            System.out.println("冠军是百灵鸟老师：" + N + "+" + 3);
        }
        else System.out.println("冠军是小黄莺老师：" + M + "+" + 3);
    }

        }
