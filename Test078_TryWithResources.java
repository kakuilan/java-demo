//try-with-resources示例

import java.io.*;

public class Test078_TryWithResources {
    public static void main(String[] args) {
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader("Test001_HelloWorld.java"))) {
            while ((line = br.readLine()) != null) {
                System.out.println("Line =>" + line);
            }
        } catch (IOException e) {
            System.out.println("IOException in try block =>" + e.getMessage());
        }
    }
}
