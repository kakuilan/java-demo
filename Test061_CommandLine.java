//命令行参数的使用
//java Test061_CommandLine.java this is a command line 200 -100
public class Test061_CommandLine {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]: " + args[i]);
        }
    }
}
