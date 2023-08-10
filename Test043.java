import java.util.Arrays;

//数组
public class Test043 {
    //数组作为函数的参数
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //数组作为函数的返回值
    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }

    public static void main(String[] args) {
        // 数组大小
        int size = 10;

        // 定义数组
        double[] myList = new double[size];
        myList[0] = 5.6;
        myList[1] = 4.5;
        myList[2] = 3.3;
        myList[3] = 13.2;
        myList[4] = 4.0;
        myList[5] = 34.33;
        myList[6] = 34.0;
        myList[7] = 45.45;
        myList[8] = 99.993;
        myList[9] = 11123;

        //将报错: Index 10 out of bounds for length 10
        //myList[10] = 11;

        // 计算所有元素的总和
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += myList[i];
        }
        System.out.println("总和为： " + total);

        //遍历
        double[] myList2 = {1.9, 2.9, 3.4, 3.5};
        for (double element : myList2) {
            System.out.println(element);
        }

        int[] rev = reverse(new int[]{3, 1, 2, 6, 4, 2});
        printArray(rev);

        //二维数组
        String[][] s = new String[2][];
        s[0] = new String[2];
        s[1] = new String[3];
        s[0][0] = new String("Good");
        s[0][1] = new String("Luck");
        s[1][0] = new String("to");
        s[1][1] = new String("you");
        s[1][2] = new String("!");
        System.out.println(Arrays.deepToString(s));

    }
}
