package SptitStack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Tester {
    private static boolean allpos(Queue<Integer>a){
        for (int i = 0; i < a.size(); i++) {
            if(a.element()<0)
                return false;
            a.add(a.remove());
        }
        return true;
    }
    public static void split(Stack<Integer> a){
        Queue<Integer> q = new LinkedList<>();
        while (!a.empty()){
            q.add(a.pop());
        }
        while (!allpos(q)){
            if(q.element()<0){
                a.push(q.remove());
            }else{
                q.add(q.remove());
            }
        }
        while (!q.isEmpty()){
            a.push(q.remove());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> a = new Stack<>();
        a.push(-1);
        a.push(10);
        a.push(2);
        a.push(5);
        a.push(-13);
        a.push(-38);
        a.push(2);
        System.out.println(a);
        split(a);
        System.out.println(a);
    }
}
