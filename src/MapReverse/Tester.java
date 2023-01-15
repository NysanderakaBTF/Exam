package MapReverse;


import java.util.HashMap;
import java.util.Map;

public class Tester {
    public static Map<String, Integer> reverse(Map<Integer, String> mmm){
        Map<String, Integer> n = new HashMap<>();
        for (Integer key: mmm.keySet()) {
            if(! n.containsKey(key)){
                n.put(mmm.get(key), key);
            }
        }
        return n;
    }
    public static void main(String[] args) {
        HashMap<Integer, String> m = new HashMap<>();
        for (int i = 0; i <10; i++) {
            m.put(i, Integer.toString(i % 7));
        }
        System.out.println(m);
        HashMap<String, Integer> aaa = (HashMap<String, Integer>) reverse(m);
        System.out.println(aaa);
    }
}
