package jinsai;

import java.util.HashMap;
import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
        Scanner star = new Scanner(System.in);
        int n = star.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < s.length; i++) {
            s[i] = star.next();
        }
        int[] ac = new int[30];
        for (int i = 0; i < s.length; i++) {
            int len = s[i].length();
            ac[len]++;
        }
        long mod = 1000000007;
        long ans = 1;
        for (int j : ac) {
            if (j != 0) {
                ans *= jc(j, mod);
                ans %= mod;
            }
        }
        System.out.println(ans%mod);
    }
    static long jc(int n,long mod){
        long res = 1;
        while (n>=1){
            res*=n;
            n--;
            res%=mod;
        }
        return res%mod;
    }
}
