import java.util.InputMismatchException;
import java.lang.String;
public class Perimeter {
    public double len(double l,double b) {
        if (l <= 0 || b <= 0 || l == b ) {
            throw new ArithmeticException("can't find area of rectangle");
        }

        return 2*(l + b);
    }
}



