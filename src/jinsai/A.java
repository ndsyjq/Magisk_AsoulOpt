package jinsai;

import java.util.Scanner;
import java.util.Stack;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i <= N; i++) {
            stack.push(i);
        }
        String [][]day=new String[1000][1000];
        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();
            String x1=sc.next();
            if(x1.equals("RESERVE")){
                int y = sc.nextInt();
                int z = sc.nextInt();
                StringBuilder ans=new StringBuilder();
                ans.append(x1).append(" ").append(y).append(" ").append(z);
//                day[x]=ans.toString();
            }


        }
    }
}
