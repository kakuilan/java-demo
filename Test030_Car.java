//instanceof 运算符
class Test030_Vehicle {
}

public class Test030_Car extends Test030_Vehicle {
    public static void main(String[] args) {
        Test030_Car a = new Test030_Car();
        boolean result = a instanceof Test030_Vehicle;
        System.out.println(result);
    }
}
