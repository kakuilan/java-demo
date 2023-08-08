//import 语句使用,下面的命令行将会命令编译器载入 java_installation/java/io 路径下的所有类

import java.io.*;

public class Test005_Employee {
    String name;
    int age;
    String designation;
    double salary;

    // Employee 类的构造器
    public Test005_Employee(String name) {
        this.name = name;
    }

    // 设置age的值
    public void empAge(int empAge) {
        age = empAge;
    }

    /* 设置designation的值*/
    public void empDesignation(String empDesig) {
        designation = empDesig;
    }

    /* 设置salary的值*/
    public void empSalary(double empSalary) {
        salary = empSalary;
    }

    /* 打印信息 */
    public void printEmployee() {
        System.out.println("名字:" + name);
        System.out.println("年龄:" + age);
        System.out.println("职位:" + designation);
        System.out.println("薪水:" + salary);
    }
}
