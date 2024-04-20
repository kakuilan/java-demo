//虚函数
public class Test093_VirtualDemo {
    public static void main(String[] args) {
        Test092_Salary s = new Test092_Salary("员工A", "北京", 3, 3600.00);
        Test091_Employee e = new Test092_Salary("员工B", "上海", 2, 2400.00);

        System.out.println("使用Salary的引用调用 mailCheck--");
        s.mailCheck();

        System.out.println("使用Employee的引用调用 mailCheck--");
        e.mailCheck();
    }
}
