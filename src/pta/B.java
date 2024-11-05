package pta;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class B {
	static int a[] = new int[100005];
	static int b[]= new int[100005];
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int max=1;
		for(int i=1;i<=n;i++) {
			a[i] = scanner.nextInt();
		}
		for(int i=1;i<=n;i++) {
			int t=0;
			t=Find(i);
			if(t>max) max = t;
		}
		System.out.println(max);
		int flag=0;
		for(int i=1;i<=n;i++) {
			if(b[i]==max) {
				if(flag==0) {
					System.out.print(i);
					flag++;
				}else {
					System.out.print(" "+i);
				}
			}
		}
	}
	public static int Find(int x) {
		if(b[x]!=0) return b[x];
		else if(a[x]==-1) return b[x]=1;
		else {
			return b[x]=Find(a[x])+1;
		}
	}

}
