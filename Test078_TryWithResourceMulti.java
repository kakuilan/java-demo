//try-with-resources声明多个资源

import java.io.*;
import java.util.*;

public class Test078_TryWithResourceMulti {
    public static void main(String[] args) throws IOException {
        //使用 Scanner 对象从 java 文件中读取一行并将其写入新的 testWrite.txt 文件中
        //自动关闭资源时，PrintWriter 对象先关闭，然后 Scanner 对象关闭
        try (Scanner scanner = new Scanner(new File("Test001_HelloWorld.java"));
             PrintWriter writer = new PrintWriter(new File("testWrite.txt"))) {
            while (scanner.hasNext()) {
                writer.print(scanner.nextLine());
            }
        }
    }
}
