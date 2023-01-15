package Numbers;

public class Numberfactory {
    public Rational createNumber(NumberTypes types, int real, int imag){
        switch (types){
            case RATIONAL -> {
                return new Rational(real);
            }
            case IMAGINABLE -> {
                return new Imagin(real,imag);
            }
            default -> throw new IllegalArgumentException("Bad argument");
        }
    }
}
