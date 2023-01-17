package reverseHalf;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueHalfReverser {
    public static void reverseHalf(Queue<Integer> queue){
        Stack<Integer> st = new Stack<>();
        if(queue.size()%2==0) {
            for (int i = 0; i < queue.size(); i += 1) {
                if (i % 2 != 0) {
                    st.push((Integer) queue.toArray()[queue.size() - i]);
                } else {
                    st.push((Integer) queue.toArray()[i]);
                }
            }
            queue.clear();
            int a = st.size();
            for (int i = 0; i <a; i++) {
                queue.offer(st.elementAt(i));
            }
        }else {
            for (int i = 0; i < queue.size(); i += 1) {
                if (i % 2 == 0) {
                    st.push((Integer) queue.toArray()[queue.size() - i-1]);
                } else {
                    st.push((Integer) queue.toArray()[i]);
                }
            }
            queue.clear();
            int a = st.size();
            for (int i = 0; i <a; i++) {
                queue.offer(st.pop());
            }
        }
    }

    public static void main(String[] args) {
        Queue<Integer> a = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            a.offer(i);
        }
        System.out.println(a);
        reverseHalf(a);
        System.out.println(a);
    }
}
