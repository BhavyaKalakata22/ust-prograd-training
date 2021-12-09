
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
 class SquareTest {
     Square square;
     @Test
     public void checkErrorIfSideIsNegetive() {

         assertThrows(IllegalArgumentException.class, () -> new Square(-4));
     }
     @Test
     public void checkErrorIfSideIsZero() {
         assertThrows(IllegalArgumentException.class, () -> new Square(0));
     }
     @Nested
     class AreaTest {
         @Test
         public void checkAreaIsSixteenWhenSideIsFour() {
             square = new Square(4);
             double actualArea = square.area();
             double expectedArea = 16;
             assertEquals(actualArea, expectedArea);
         }
     }
     @Nested
    class TestPerimeter {
        @Test
        public void CheckAreaIsTwentyWhenSideIsFive() {
            square = new Square(5);
            double actualPerimeter = square.perimeter();
            double expectedArea = 20;
            assertEquals(actualPerimeter, expectedArea);
        }
    }
}
