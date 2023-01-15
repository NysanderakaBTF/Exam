package Numbers;

public class Numbertester {
    public static void main(String[] args) {
        Numberfactory f = new Numberfactory();
        Rational a = f.createNumber(NumberTypes.RATIONAL, 1 ,1);
        Rational b =  f.createNumber(NumberTypes.IMAGINABLE, 2,0);
    }
}
