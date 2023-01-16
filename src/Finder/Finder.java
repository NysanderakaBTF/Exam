package Finder;

import java.util.ArrayList;

public class Finder{
    public static int find(Comparable[] a, Object el){
        for (int i = 0; i < a.length; i++) {
            if(a[i].compareTo(el)==0){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[20];
        for (int i = 0; i < 20; i++) {
            a[i]=i;
        }

        System.out.println(find(a, 9));

    }
}
