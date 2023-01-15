package Shapers;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        ShapeFactory fa = new ShapeFactory();
        Shape s = fa.createShape(ShapeType.CIRCLE);
    }
}
