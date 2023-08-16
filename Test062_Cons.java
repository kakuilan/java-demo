//构造函数
class Test062_MyClass {
    int x;
    int y;

    // 以下是带参数的构造函数
    Test062_MyClass(int i) {
        x = i;
    }

    // 不带参数的构造函数
    Test062_MyClass() {
        y = 25;
    }
}

public class Test062_Cons {
    public static void main(String[] args) {
        Test062_MyClass t1 = new Test062_MyClass(10);
        Test062_MyClass t2 = new Test062_MyClass(20);
        Test062_MyClass t3 = new Test062_MyClass();
        System.out.println(t1.x + " " + t2.x + " " + t3.y);
    }
}
