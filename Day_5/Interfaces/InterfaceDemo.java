interface Lenovo{
    default void ram() {
        System.out.println("16 gb");
    }
}
interface Hp{
    default void ram() {
        System.out.println("32 gb");
    }
}

public class InterfaceDemo implements Lenovo, Hp{
    public static void main(String[] args) {
        InterfaceDemo demo = new InterfaceDemo();
        demo.ram();
    }
    public void ram(){
        Lenovo.super.ram();
        Hp.super.ram();
    }
}
