package ArrayListList;


import Dublicates.LinkedList;
import FirstLast.ListNode;

import java.awt.*;

public class Lisy extends LinkedList {
    public int get_on_pos(int pos){
        ListNode l = this.head;
        if(pos>=size || pos<0) throw new IndexOutOfBoundsException();
        for (int i = 0; i < pos; i++) {
            l = l.next;
        }
        return l.data;
    }
    public void insert(int pos, int el){
        ListNode n = new ListNode(el);
        ListNode l = this.head;
        if(pos>size || pos<0) throw new IndexOutOfBoundsException();
        if(pos == 0){
            n.next=head;
            head=n;
            return;
        }
        for (int i = 0; i < pos-1; i++) {
            l = l.next;
        }
        n.next=l.next;
        l.next=n;
        size++;
    }
}
