package equalsstack;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack<Integer> a = new Stack<>();
        Stack<Integer> b =  new Stack<>();
        for (int i = 0; i < 10; i++) {
            a.push(i);
            b.push(i);
        }
        System.out.println(Checker.equal(a,b));
    }
}
