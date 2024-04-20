//类的多态
public class Test090_Polymorphic {
    public static void main(String[] args) {
        show(new Test088_Cat()); //以Cat对象调用show方法
        show(new Test088_Cat()); //以Dog对象调用show方法

        Test087_Animal a = new Test088_Cat(); //向上转型
        a.eat(); //调用的是Cat的eat
        Test088_Cat c = (Test088_Cat) a; //向下转型
        c.work(); //调用的是Cat的work
    }

    public static void show(Test087_Animal a) {
        a.eat();
        //类型判断
        if (a instanceof Test088_Cat) { //猫做的事情
            Test088_Cat c = (Test088_Cat) a;
            c.work();
        } else if (a instanceof Test089_Dog) { //狗做的事情
            Test089_Dog c = (Test089_Dog) a;
            c.work();
        }
    }
}
