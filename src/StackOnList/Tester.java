package StackOnList;

public class Tester {
    public static void main(String[] args) {
        Stack<Integer> a = new Stack<>();
        for (int i = 0; i < 10; i++) {
            a.push(i);
        }
        System.out.println(a);
        System.out.println(a.pek());
        System.out.println(a.pop());
        System.out.println(a);
    }
}
