//枚举类的方法

enum Color2 {
    RED, GREEN, BLUE;
}

public class Test102_EnumMethod {

    public static void main(String[] args) {
        // 调用 values()
        Color2[] arr = Color2.values();

        // 迭代枚举
        for (Color2 col : arr) {
            // 查看索引
            System.out.println(col + " at index " + col.ordinal());
        }

        // 使用 valueOf() 返回枚举常量，不存在的会报错 IllegalArgumentException
        System.out.println(Color2.valueOf("RED"));
        // System.out.println(Color.valueOf("WHITE"));
    }
}
