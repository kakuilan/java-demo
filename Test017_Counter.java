//类的静态变量
public class Test017_Counter {
    private static int count = 0;

    public Test017_Counter() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Test017_Counter c1 = new Test017_Counter();
        Test017_Counter c2 = new Test017_Counter();
        Test017_Counter c3 = new Test017_Counter();
        System.out.println("目前为止创建的对象数: " + Test017_Counter.getCount());
    }
}
