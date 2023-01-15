package Dublicates;
import FirstLast.ListNode;
public class LinkedList {
    protected ListNode head;
    protected int size;
    public void add(int a){
        if (size==0){
            head=new ListNode(a);
            size++;
        }
        else {
            ListNode cur = head;
            while (cur.next!=null){
                cur=cur.next;
            }
            cur.next = new ListNode(a);
            size++;
        }
    }
    public void remove(int pos){
        if(size==0){return;}
        if (pos==0){
            head = head.next;
            size--;
            return;
        }
        if (pos==size-2){
            ListNode cur = head;
            while (cur.next.next!=null){
                cur=cur.next;
            }
            cur.next=null;
            size--;
        }
        ListNode cur = head;
        for (int i = 0; i < pos-1; i++) {
            cur=cur.next;
        }
        size--;
        cur.next=cur.next.next;
    }
    public String toString(){
        StringBuilder a= new StringBuilder();
        ListNode cur = head;
        for (int i = 0; i < size; i++) {
            if (cur!=null) {
                a.append(cur.data).append(" ");
                cur = cur.next;
            }
        }
        return a.toString();
    }

    public void removeDublicates(){
        boolean is_u = false;
        ListNode cur = head;
        ListNode cc = head;
        while (cur!=null){
            int k = 0;
            int n = cur.data;
            cc = head;
            for (int i = 0; i < size; i++) {
                if (cc!=null) {
                    if (cur.data == cc.data) {
                        k++;
                    }
                    cc = cc.next;
                }
            }
            if (k>1){
                int qqq = 0;
                cc = head;
                for (int i = 0; i < size; i++) {
                    if (cur.data==cc.data){
                        qqq++;
                        if(qqq>1){
                            remove(i);
                            break;
                        }

                    }
                    cc=cc.next;
                }
            }else{
                cur = cur.next;
            }
        }
    }

}
