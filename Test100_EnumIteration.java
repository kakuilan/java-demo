//迭代枚举元素

enum Color {
    RED, GREEN, BLUE;
}

public class Test100_EnumIteration {
    public static void main(String[] args) {
        for (Color myVar : Color.values()) {
            System.out.println(myVar);
        }
    }
}
