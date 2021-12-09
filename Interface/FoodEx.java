interface Food{
    public default void display()
    {
        System.out.println("burger is delicious");
    }
}
interface Food1{
    public default void display()
    {
        System.out.println("pizza is delicious & too much cost ");
    }
}
public class FoodEx implements Food,Food1 {
    public static void main(String args[]) {
        FoodEx Food = new FoodEx();
        Food.display();
    }
    public void display()
    {
        Food.super.display();
        Food1.super.display();
    }
}


