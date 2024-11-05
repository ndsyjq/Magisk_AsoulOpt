package pta;

import java.util.Scanner;
public class C3{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        String v = sc.next();
        String p = sc.next();
        boolean iscooked = false;
        if(v.equals("1") && m >=3){
            iscooked = true;
        }else if (v.equals("2") && m >=4){
            iscooked = true;
        }
        boolean perfect = false;
        if(p.equals("1") && m <=5){
            perfect = true;
        }else if(p.equals("2") && m >=6){
            perfect = true;
        }
        if(iscooked && perfect){
            System.out.println("这豆角太棒了！");
        }else if (!iscooked && perfect){
            System.out.println("这豆角有毒！");
        }else if (iscooked && !perfect){
            System.out.println("不要豆角！");
        }else {
            System.out.println("这豆角有毒！");
        }
    }
}
