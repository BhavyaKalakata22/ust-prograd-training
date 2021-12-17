class AbstractDemo{

    public static void main(String[] args) {
        Mobile apple = new Apple();
        Mobile samsung =  new Samsung();
        apple.brand();
        apple.price();
        samsung.brand();
        samsung.price();
    }

}
class Apple extends Mobile{
    void brand(){
        System.out.println("Apple");
    }
    void price(){
        System.out.println(100000);
    }
}

class Samsung extends Mobile{
    void brand(){
        System.out.println("Samsung");
    }
    void price(){
        System.out.println(75999);
    }
}

abstract class Mobile{
    abstract void brand();
    abstract void price();
}