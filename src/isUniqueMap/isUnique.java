package isUniqueMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class isUnique {
    public static boolean check(Map<String, String> a){
        HashSet<String> q = new HashSet<>(a.keySet());
        for (String i: a.values()) {
            int l = 0;
            for (String o:a.values()) {
                if(i.equals(o)){
                    l++;
                }
            }
            if(l>1)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Map<String, String>  a = new HashMap<>();
        a.put("New", "Alla");
        a.put("MMMm", "LLL");
        System.out.println(check(a));
    }
}
