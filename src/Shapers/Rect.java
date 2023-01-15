package Shapers;

public class Rect extends Shape{
    private int a, b;
    @Override
    public double area(){
        return a*b;
    }

    public Rect() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
