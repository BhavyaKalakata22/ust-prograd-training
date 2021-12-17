import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculatorTest {
    private Calculator calc;
    @BeforeEach
    public void setup() {
        calc = new Calculator();
    }
    @Nested
    public class TestingAddFunction {
        @BeforeEach
        public void setup() {
            calc = new Calculator();
        }
        @Test
        public void additionThreePlusFiveEqualsEight() {
            double answer = calc.add(3, 5);
            double expected = 8;
            assertEquals(answer, expected);
        }

        @Test
        public void additionFivePlusFiveEqualsTen() {
            double answer = calc.add(5, 5);
            double expected = 10;
            assertEquals(answer, expected);
        }

        @Test
        public void additionFivePlusZeroEqualsFive() {
            double answer = calc.add(5, 0);
            double expected = 5;
            assertEquals(answer, expected);
        }
    }

    @Nested
    public class TestingSubtractionFunction {
        @BeforeEach
        public void setup() {
            calc = new Calculator();
        }
        @Test
        public void subtractionFiveMinusZeroEqualsFive() {
            double answer = calc.sub(5, 0);
            double expected = 5;
            assertEquals(answer, expected);
        }
        @Test
        public void subtractionFiveMinusTwoEqualsThree() {
            double answer = calc.sub(5, 2);
            double expected = 3;
            assertEquals(answer, expected);
        }
        @Test
        public void subtractionEightMinusThreeEqualsFive() {
            double answer = calc.sub(8, 3);
            double expected = 5;
            assertEquals(answer, expected);
        }
        @Test
        public void subtractionEightMinusTenEqualsNegativeTwo() {
            double answer = calc.sub(8, 10);
            double expected = -2;
            assertEquals(answer, expected);
        }
    }
    @Nested
    public class TestingMultiplyFunction {
        @BeforeEach
        public void setup() {
            calc = new Calculator();
        }
        @Test
        public void MultiplyTwoAndFiveEqualsTen() {
            double answer = calc.mul(2, 5);
            double expected = 10;
            assertEquals(answer, expected);
        }
        @Test
        public void MultiplyTwoAndTwoEqualsFour() {
            double answer = calc.mul(2, 2);
            double expected = 4;
            assertEquals(answer, expected);
        }
        @Test
        public void MultiplyFiveAndFourTwenty() {
            double answer = calc.mul(5, 4);
            double expected = 20;
            assertEquals(answer, expected);
        }
        @Nested
        public class TestingDivisonFunction {
            @BeforeEach
            public void setup() {
                calc = new Calculator();
            }
            @Test
            public void divisionFourDivideTwoEqualsTwo() {
                double answer = calc.div(4, 2);
                double expected = 2;
                assertEquals(answer, expected);
            }

             //  @Test
             // public void throwsExceptionWhenDividedByZero(){
             //Assertions.assertThrows(ArithmeticException.class, ()-> calc.div(10,2));
            // }
        }
    }
}
