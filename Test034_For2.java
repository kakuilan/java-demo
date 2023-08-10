//增强 for 循环
public class Test034_For2 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        //遍历数组
        for (int x : numbers) {
            System.out.print(x);
            System.out.print(",");
        }
        System.out.print("\n");
        String[] names = {"James", "Larry", "Tom", "Lacy"};
        for (String name : names) {
            System.out.print(name);
            System.out.print(",");
        }
    }
}
