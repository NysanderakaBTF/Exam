package RemoveAll;

public class Tester {
    public static void main(String[] args) {
        LinkedLinst a = new LinkedLinst();
        a.add(1);
        a.add(3);
        a.add(5);
        a.add(7);
        LinkedLinst b = new LinkedLinst();
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(4);
        b.add(5);
        System.out.println(a);
        System.out.println(b);
        b.removeAll(a);
        System.out.println(b);
    }
}
