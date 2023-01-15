package StackOnArray;

public class Tester {
    public static void main(String[] args) {
        StackGeneric<Integer> a = new StackGeneric<>();
        System.out.println(a);
        for (int i = 0; i < 20; i++) {
            a.push(i);
            System.out.println(a);
        }
        System.out.println(a.top());
        for (int i = 0; i < 10; i++) {
            System.out.println(a);
            System.out.println(a.pop());

        }
        System.out.println(a);
    }
}
