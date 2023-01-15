package FirstLast;

public class LinkedIntList {
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
    public void firstLast(){
        ListNode prelast = head;
        if (size>1) {
            while (prelast.next.next != null) {
                prelast = prelast.next;
            }
            ListNode last = prelast.next;
            prelast.next = head;
            last.next = head.next;
            head.next=null;
            head = last;

        }
    }
}
