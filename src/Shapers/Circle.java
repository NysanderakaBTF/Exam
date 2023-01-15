package Shapers;

public class Circle extends Shape{
    private int rad;

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    public Circle() {
    }

    @Override
    public double area(){
        return Math.PI*rad*rad;
    }

}
