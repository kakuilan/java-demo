//String字符串类
public class Test041 {

    public static void main(String[] args) {
        //直接创建
        String str = "Runoob";

        //用构造函数创建字符串
        String str2 = new String("Runoob");

        //
        String s1 = "Runoob";              // String 直接创建
        String s2 = "Runoob";              // String 直接创建
        String s3 = s1;                    // 相同引用
        String s4 = new String("Runoob");   // String 对象创建
        String s5 = new String("Runoob");   // String 对象创建

        //String 类有 11 种构造方法，这些方法提供不同的参数来初始化字符串，比如提供一个字符数组参数:
        char[] helloArray = {'r', 'u', 'n', 'o', 'o', 'b'};
        String helloString = new String(helloArray);
        System.out.println(helloString);

        //字符串长度
        String site = "www.runoob.com";
        int len = site.length();
        System.out.println("菜鸟教程网址长度 : " + len);

        //连接字符串
        String string1 = "菜鸟教程网址：";
        System.out.println("1、" + string1 + "www.runoob.com");

        //格式化字符串
        String fs;
        fs = String.format("浮点型变量的值为 " +
                "%f, 整型变量的值为 " +
                " %d, 字符串变量的值为 " +
                " %s", 3.1415, 613, site);
        System.out.println(fs);
    }
}
