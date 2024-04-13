//Scanner读取整型或浮点

import java.util.Scanner;

public class Test074_ScannerNumber {
    public static void main(String[] args) {
        //从键盘接收数据
        Scanner scan = new Scanner(System.in);

        int i = 0;
        float f = 0.0f;

        System.out.print("输入整数：");
        //判断输入的是否整数
        if (scan.hasNextInt()) {
            //接收整数
            i = scan.nextInt();
            System.out.println("整数数据：" + i);
        } else {
            //输入错误的信息
            System.out.println("输入的不是整数！");
        }

        System.out.print("输入小数：");
        //判断输入的是否小数
        if (scan.hasNextFloat()) {
            //接收小数
            f = scan.nextFloat();
            System.out.println("小数数据：" + f);
        } else {
            //输入错误的信息
            System.out.println("输入的不是小数！");
        }
    }
}
