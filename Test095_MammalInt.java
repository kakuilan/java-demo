//接口的实现
public class Test095_MammalInt implements Test094_NameOfInterface {
    public void eat() {
        System.out.println("Mammal eats");
    }

    public void travel() {
        System.out.println("Mammal travels");
    }

    public int noOfLegs() {
        return 0;
    }

    public static void main(String[] args) {
        Test095_MammalInt m = new Test095_MammalInt();
        m.eat();
        m.travel();
    }
}
