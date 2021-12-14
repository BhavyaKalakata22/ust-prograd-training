public class FlippedCoin {
    double head;
    double tail;
    public double whenProbabilityIsNegative(double probability) {
        if (probability < 0) {
            throw new IllegalArgumentException("Probability can't be negative");
        }
        return 0;
    }

    public double probabilityOfHead(){
        return head= 0.5;
    }

    public double probabilityOfTail(){
        return tail=0.5;
    }

    public double probabilityOfTwoEvents(){
        return probabilityOfHead() * probabilityOfTail();
    }

    public double probabilityOfNotGettingTwoEventsTogether(){
        return 1 - probabilityOfTwoEvents();
    }

    public double probabilityOfGettingEitherTwoEvents(){
        return probabilityOfHead() + probabilityOfTail() - probabilityOfTwoEvents();
    }
}



