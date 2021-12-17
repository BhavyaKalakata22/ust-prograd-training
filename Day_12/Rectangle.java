public class Rectangle {
    public double area(double l,double b) {
        if (l <= 0 || b <= 0 || l == b) {
            throw new ArithmeticException("cannot find area of rectangle");
        }
                return l * b;
            }
        }

