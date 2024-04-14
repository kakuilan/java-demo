// SubClass2 类继承
public class Test085_SubClass2 extends Test083_SuperClass {
    private int n;

    Test085_SubClass2() {
        super(300); //手动调用父类中带有参数的构造器
        System.out.println("SubClass2");
    }

    public Test085_SubClass2(int n) {
        //自动调用父类的无参数构造器
        System.out.println("SubClass2(int n):" + n);
        this.n = n;
    }
}
