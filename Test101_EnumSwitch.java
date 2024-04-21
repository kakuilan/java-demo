//在 switch 中使用枚举类
enum Color1 {
    RED, GREEN, BLUE;
}

public class Test101_EnumSwitch {
    public static void main(String[] args) {
        Color1 myVar = Color1.BLUE;

        switch(myVar) {
            case RED:
                System.out.println("红色");
                break;
            case GREEN:
                System.out.println("绿色");
                break;
            case BLUE:
                System.out.println("蓝色");
                break;
        }
    }
}
