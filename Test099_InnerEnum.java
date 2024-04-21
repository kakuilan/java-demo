//在类中声明枚举
public class Test099_InnerEnum {
    //枚举
    enum Color {
        RED, GREEN, BLUE;
    }

    public static void main(String[] args) {
        Color cl = Color.RED;
        System.out.println(cl);
    }
}
