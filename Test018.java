//默认访问修饰符-不使用任何关键字

class Test018_MyClass {  // 默认访问修饰符

    int x = 10;  // 默认访问修饰符

    void display() {  // 默认访问修饰符
        System.out.println("Value of x is: " + x);
    }
}

public class Test018 {
    public static void main(String[] args) {
        Test018_MyClass obj = new Test018_MyClass();
        obj.display();  // 访问 MyClass 中的默认访问修饰符变量和方法
    }
}
