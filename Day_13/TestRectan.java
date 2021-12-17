public class TestRectan {
    double length;
    double breadth;
    TestRectan(double length, double breadth){
        if(length<=0 || breadth<=0){
            throw new IllegalArgumentException("Length and breadth should not be less than or equal to zero");
        }
        this.length = length;
        this.breadth = breadth;
    }
    public double area(){
        return length * breadth;
    }
    public double perimeter(){

        return 2 * (length+breadth);
    }
}