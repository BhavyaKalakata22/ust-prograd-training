import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;
public class RectangleTest {
    Rectangle rectangle;
        @BeforeEach
        public void rect() {
            rectangle = new Rectangle();
        }
        @Test
        public void checkAreaIsFourtyWhenLengthIsFiveAndBreadthEight() {
            double result = rectangle.area(5, 8);
            double expected = 40;
            assertEquals(result, expected);
        }
        @Test
        public void checkAreaIsSixteenWhenLengthIsTwoAndBreadthEight() {
            double result = rectangle.area(2, 8);
            double expected = 16;
            assertEquals(result, expected);
        }
        @Test
        public void checkAreaIsTenWhenLengthIsFiveAndBreadthTwo() {
            double result = rectangle.area(5, 2);
            double expected = 10;
            assertEquals(result, expected);
        }
        @Test
        public void checkAreaIsWhSixenLengthIsTwoAndBreadthThree() {
            double result = rectangle.area(2, 3);
            double expected = 6;
            assertEquals(result, expected);
        }
        @Test
        public void throwsArithmeticExceptionOnesideIsZero(){
            assertThrows(ArithmeticException.class,()->rectangle.area(2,0));
        }
        @Test
          public void throwsArithmeticExceptionOnesideIsNegetive(){
        assertThrows(ArithmeticException.class,()->rectangle.area(2,-2));
    }



}

