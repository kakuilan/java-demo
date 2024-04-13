//Scanner.nextLine方法读取键盘输入

import java.util.Scanner;

public class Test073_ScannerNextLine {
    public static void main(String[] args) {
        //从键盘接收数据
        Scanner scan = new Scanner(System.in);

        //next方式接收字符串
        System.out.println("nextLine方式接收：");
        //判断是否还有输入
        if (scan.hasNextLine()) {
            String str2 = scan.nextLine();
            System.out.println("输入的数据为：" + str2);
        }

        scan.close();
    }
}
