import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class FlippedCoinTest {
    FlippedCoin coinToss= new FlippedCoin();
    @Nested // heads=tail
    public class HeadsIsEqualToTails{
        @Test
        public void checkIfProbabilityOfHeadsAndTailsIsPointFive(){
            assertEquals(coinToss.probabilityOfHead(),coinToss.probabilityOfTail());
        }
    }
    @Nested //  probability of two events occurring together
    public class TwoCoinEventsOccurringTogether{
        @Test
        public void checkIfProbabilityOfHeadIsPointTwoFive(){
            assertEquals(0.25,coinToss.probabilityOfTwoEvents());
        }
        @Test
        public void checkIfProbabilityOfTailIsPointTwoFive(){
            assertEquals(0.25,coinToss.probabilityOfTwoEvents());
        }
        @Test
        public void checkIfProbabilityOfHeadAndProbabilityOfTailIsPointTwoFive(){
            assertEquals(0.25,coinToss.probabilityOfTwoEvents());
        }

        @Test
        public void checkIfProbabilityOfTailAndProbabilityOfHeadIsPointTwoFive(){
            assertEquals(0.25,coinToss.probabilityOfTwoEvents());
        }

    }

    @Nested // probability of an event not occurring
    public class TwoCoinsEventsWereNotOccurringTogether{
        @Test
        public void checkIfProbabilityOfTwoCoinSEventsNotOccurringTogether(){
            assertEquals(0.75, coinToss.probabilityOfNotGettingTwoEventsTogether());
        }
    }

    @Nested // probability of either two events occurring
    public class EitherOfTwoCoinEventsOccurring{
        @Test
        public void checkIfProbabilityOfEitherTwoCoinsEventsOccurring(){
            assertEquals(0.75,coinToss.probabilityOfGettingEitherTwoEvents());
        }

        @Test
        public void throwsIllegalArgumentExceptionWhenProbabilityIsNegative(){
            assertThrows(IllegalArgumentException.class, () -> coinToss.whenProbabilityIsNegative(-1.6));
        }
    }
}
