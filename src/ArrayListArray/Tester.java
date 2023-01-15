package ArrayListArray;

public class Tester {
    public static void main(String[] args) {
        MyArrayList<Integer> a = new MyArrayList<>();
        System.out.println(a);
        for (int i = 0; i < 35; i++) {
            a.insert(i, i);
        }
        System.out.println(a);

        System.out.println(a.getCapacity());
        System.out.println(a.getSize());
        a.delete(5);
        System.out.println(a);
        a.insert(7, 888);
        System.out.println(a);
    }
}
