import java.io.*;

public class Test006_EmployeeTest {
    public static void main(String[] args) {
        /* 使用构造器创建两个对象 */
        Test005_Employee empOne = new Test005_Employee("RUNOOB1");
        Test005_Employee empTwo = new Test005_Employee("RUNOOB2");

        // 调用这两个对象的成员方法
        empOne.empAge(26);
        empOne.empDesignation("高级程序员");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("菜鸟程序员");
        empTwo.empSalary(500);
        empTwo.printEmployee();
    }
}
