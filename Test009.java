//常量和字面量
public class Test009 {

    public static void main(String[] args) {
        //常量
        final double PI = 3.1415927;

        byte a = 68;
        char b = 'A';

        int decimal = 100; //十进制
        int octal = 0144; //以0开头的八进制整数

        //以0x开头的十六进制整数
        int hexVal1 = 0x13;
        int hexVal2 = 0Xaf;
        //二进制整数
        int binVal1 = 0b11010100;
        int binVal2 = 0B01101001;

        //字符和字符串
        char str = '\u0001';
        String str2 = "\u0001";

        System.out.println(PI);
        System.out.println(a);
        System.out.println(b);
        System.out.println(decimal);
        System.out.println(octal);
        System.out.println(hexVal1);
        System.out.println(hexVal2);
        System.out.println(binVal1);
        System.out.println(binVal2);
        System.out.println(str);
        System.out.println(str2);
    }

}
