package ArrayListList;

public class Test {
    public static void main(String[] args) {
        Lisy a = new Lisy();
        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        System.out.println(a);
        a.insert(0,100000);
        System.out.println(a);
    }
}
