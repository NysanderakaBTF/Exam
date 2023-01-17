package test28;

public class Solver {
    public static int sum(int a){
        if (a/10==0)
            return a;
        else
            return a%10+sum(a/10);
    }

    public static void main(String[] args) {
        int a = 101;
        System.out.println(sum(a));
    }
}
