//休眠sleep
import java.util.*;

public class Test049 {
    public static void main(String[] args) {
        try {
            System.out.println(new Date() + "\n");
            Thread.sleep(1000 * 3);   // 休眠3秒
            System.out.println(new Date() + "\n");
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
    }
}
