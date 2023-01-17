package guavaSort;

import java.util.*;

public class Tester {
    public static void sort(String[] a){
        TreeMap<String, Integer> n = new TreeMap<>();
        for (int i = 0; i < a.length; i++) {
            if (n.containsKey(a[i])){
                n.put(a[i], n.get(a[i])+1);
            }else{
                n.put(a[i], 1);
            }
        }
        int pos = 0;
        for (Map.Entry<String, Integer> set : n.entrySet()) {
            for (int i = 0; i < set.getValue(); i++) {
                a[pos] = set.getKey();
                pos++;
            }

        }
    }

    public static void main(String[] args) {
        String[] a = new String[10];
        a[0] = "OINONB";
        a[1] = "QAef";
        a[2] = "AAA";
        a[3] = "nojwnw";
        a[4] = "OUIHUobu";
        a[5] = "qqqqq";
        a[6] = "312r32";
        a[7] = "KJHBIJUBIPB";
        a[8] = "ONnnn";
        a[9] = "OINONB";
        System.out.println(Arrays.toString(a));
        sort(a);
        System.out.println(Arrays.toString(a));

    }
}
