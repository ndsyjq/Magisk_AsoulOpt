package pra1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


public class MyQueue {
    public static void main(String[] args) {
       int a;
       int b=1000000;
       int c=10000000;
       int d=1000000;
       while (b<c){
           a=b;
           List<Integer> list=new ArrayList<>();
           for (int i = 0; i < 7; i++) {
               list.add(a%10);
               a=a/10;
           }
           list=list.reversed();
           while (list.getLast()<=b){
               int b1=0;
               for (int i = list.size()-7; i < list.size(); i++) {
                    b1+=list.get(i);
               }
               list.add(b1);
               if(b1==b) d=b;
           }
           b++;
       }
        System.out.println(d);
    }
}
