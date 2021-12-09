import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;import java.util.InputMismatchException;
import static org.junit.jupiter.api.Assertions.*;
public class PerimeterSides {
    Perimeter peri;
    @BeforeEach
    public void perim() {
        peri = new Perimeter();
    }
    @Test
    public void checkPerimeterIsFourteenWhenLengthIsFourAndBreadthThree() {
        double actual = peri.len(4, 3);
        double expected = 14;
        assertEquals(actual, expected);
    }

    @Test
    public void checkPerimeterIsTwentyWhenLengthIsThreeAndBreadthSeven() {
        double actual = peri.len(3, 7);
        double expected = 20;
        assertEquals(actual, expected);
    }

    @Test
    public void checkPerimeterIsSixteenWhenLengthIsFiveAndBreadthThree() {
        double actual = peri.len(5, 3);
        double expected = 16;
        assertEquals(actual, expected);
    }

    @Test
    public void checkPerimeterIsTenLengthIsTwoAndBreadthThree() {
        double actual = peri.len(2, 3);
        double expected = 10;
        assertEquals(actual, expected);
    }
    @Test
    public void throwsArithmeticExceptionOnesideIsZero() {
        assertThrows(ArithmeticException.class, () -> peri.len(2, 0));
    }

    @Test
    public void throwsArithmeticExceptionOnesideIsNegetive() {
        assertThrows(ArithmeticException.class, () -> peri.len(2, -2));
    }



}