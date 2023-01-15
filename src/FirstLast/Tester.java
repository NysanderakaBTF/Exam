package FirstLast;

public class Tester {
    public static void main(String[] args) {
        LinkedIntList a = new LinkedIntList();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        System.out.println(a);
        a.firstLast();
        System.out.println(a);
        a.remove(4);
        System.out.println(a);
    }
}
