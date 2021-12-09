import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import java.awt.*;
import static org.junit.jupiter.api.Assertions.*;
class TestAreaPerimeter {
    TestRectan rectangle;
    @Nested
    class TestArea{
        @Test
        public void checkAreaIsTenWhenLengthIsTwoAndBreadthIsFive(){
            rectangle=new TestRectan(2,5);
            double actualArea = rectangle.area();
            double expectedArea = 10;
            assertEquals(expectedArea , actualArea);
        }
        @Test
        public void checkAreaIsSixteenWhenLengthIsEightAndBreadthIsTwo(){
            rectangle=new TestRectan(8,2);
            double actualArea = rectangle.area();
            double expectedArea = 16;
            assertEquals(expectedArea , actualArea);
        }
        @Test
        public void checkAreaIsSixWhenLengthIsThreeAndBreadthIsTwo(){
            rectangle=new TestRectan(3,2);
            double actualArea = rectangle.area();
            double expectedArea = 6;
            assertEquals(expectedArea , actualArea);
        }

        @Test
        public void checkAreaIsErrorWhenLengthIsMinusTwoAndBreadthIsFive(){
            assertThrows(IllegalArgumentException.class, () -> new TestRectan(-2,5));
        }
    }
    @Nested
    class TestPerimeter{
        @Test
        public void checkPerimeterIsFourteenWhenLengthIsTwoANdBreadthIsFive(){
            rectangle=new TestRectan(2,5);
            double actualPerimeter = rectangle.perimeter();
            double expectedPerimeter = 14;
            assertEquals(expectedPerimeter , actualPerimeter);
        }
        @Test
        public void checkPerimeterIsEightWhenLengthIsTwoANdBreadthIsTwo(){
            rectangle=new TestRectan(2,2);
            double actualPerimeter = rectangle.perimeter();
            double expectedPerimeter = 8;
            assertEquals(expectedPerimeter , actualPerimeter);
        }
        @Test
        public void checkPerimeterIsTwentyWhenLengthIsThreeANdBreadthIsSeven(){
            rectangle=new TestRectan(3,7);
            double actualPerimeter = rectangle.perimeter();
            double expectedPerimeter = 20;
            assertEquals(expectedPerimeter , actualPerimeter);
        }
        @Test
        public void checkAreaIsErrorWhenLengthIsMinusTwoAndBreadthIsFive(){
            assertThrows(IllegalArgumentException.class, () -> new TestRectan(-2,5));
        }
    }

}