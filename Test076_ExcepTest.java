//异常示例

import java.io.*;

public class Test076_ExcepTest {
    public static void main(String[] args) {
        try {
            //声明有两个元素的一个数组，当代码试图访问数组的第四个元素的时候就会抛出一个异常
            int a[] = new int[2];
            System.out.println("Access element three:" + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown:" + e);
        }
        System.out.println("Out of the block");
    }
}
