package pta;

import java.util.ArrayList;
import java.util.Random;

public class R {
 int []a = new int[6];
    public void F(){
        for (int i = 0; i < 6; i++) {
            a[i] = 1;
        }
        Random r = new Random();
        int a1=r.nextInt(6);
        a[a1] = 0;
    }
    public void G(){
        if(a[0]==0){
            System.out.println("ji");
        }
        else {
            int a1[]=new int[a.length-1];
            for (int i = 1; i < a.length; i++) {
                a1[i-1] = a[i];
            }
            a=a1;
            System.out.println("huo");
        }
    }
}
