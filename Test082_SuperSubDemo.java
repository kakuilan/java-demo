//子类构造器
public class Test082_SuperSubDemo {
    public static void main(String[] args) {
        System.out.println("------SubClass 类继承------");
        Test084_SubClass sc1 = new Test084_SubClass();
        Test084_SubClass sc2 = new Test084_SubClass(100);

        System.out.println("------SubClass2 类继承------");
        Test085_SubClass2 sc3 = new Test085_SubClass2();
        Test085_SubClass2 sc4 = new Test085_SubClass2(150);
    }
}
