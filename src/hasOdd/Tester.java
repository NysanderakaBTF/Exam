package hasOdd;

import java.util.HashSet;
import java.util.Set;

public class Tester {
    public static boolean HasOdd(Set<Integer> a){
        for(int e :a){
            if(e%2==1) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>();
        for (int i = 0; i < 1; i++) {
            a.add(i);
        }
        System.out.println(HasOdd(a));
    }
}
