package Shapers;

public class ShapeFactory {
    public Shape createShape(ShapeType type){
        Shape s = null;
        switch (type){
            case CIRCLE -> s = new Circle();
            case RECTANGLE -> s = new Rect();
        }
        return s;
    }
}
