package RemoveAll;

import FirstLast.ListNode;
public class LinkedLinst {
    private ListNode head;
    private int size;
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
        if (pos==size-1){
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
    public void removeAll(LinkedLinst a){
        int pos = 0;
        ListNode n1 = head;
        ListNode n2 = a.head;
        while (n2!=null && n1 !=null){
            if(n1.data==n2.data){
                n1=n1.next;
                this.remove(pos);
            }else if(n1.data<n2.data){
                pos++;
                n1=n1.next;
            }else if(n2.data<n1.data){
                n2=n2.next;
            }
        }

    }
}
