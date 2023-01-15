package equalsstack;


import java.util.Stack;

public class Checker {
    public static boolean equal(Stack<Integer>a, Stack<Integer>b){
        if (a.size()!=b.size()) return false;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i)!=b.get(i)){
                return false;
            }
        }
        return true;
    }
}
