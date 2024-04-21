//枚举类的成员

enum Color3 {
    RED, GREEN, BLUE;

    // 构造函数
    private Color3() {
        System.out.println("Constructor called for : " + this.toString());
    }

    public void colorInfo() {
        System.out.println("Universal Color");
    }
}

public class Test103_EnumMember {
    public static void main(String[] args) {
        Color3 cl = Color3.RED;
        System.out.println(cl);
        cl.colorInfo();
    }
}
