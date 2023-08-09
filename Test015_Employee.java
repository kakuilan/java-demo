//成员变量

import java.io.*;

public class Test015_Employee {
    // 这个成员变量对子类可见
    public String name;
    // 私有变量，仅在该类可见
    private double salary;

    //在构造器中对name赋值
    public Test015_Employee(String empName) {
        name = empName;
    }

    //设定salary的值
    public void setSalary(double empSal) {
        salary = empSal;
    }

    // 打印信息
    public void printEmp() {
        System.out.println("名字 : " + name);
        System.out.println("薪水 : " + salary);
    }

    public static void main(String[] args) {
        Test015_Employee empOne = new Test015_Employee("RUNOOB");
        empOne.setSalary(1000.0);
        empOne.printEmp();
    }
}
