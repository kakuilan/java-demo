// SubClass 类继承
public class Test084_SubClass extends Test083_SuperClass {
    private int n;

    Test084_SubClass() {
        //自动调用父类的无参数构造器
        System.out.println("SubClass");
    }

    public Test084_SubClass(int n) {
        super(200); //手动调用父类中带有参数的构造器
        System.out.println("SubClass(int n):" + n);
        this.n = n;
    }

}
