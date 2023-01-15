package Dublicates;

public class test {
    public static void main(String[] args) {
        LinkedList a = new LinkedList();
        for (int i = 0; i < 10; i++) {
            a.add((int) (Math.random()*10));
        }
        System.out.println(a);
        a.removeDublicates();
        System.out.println(a);
    }
}
