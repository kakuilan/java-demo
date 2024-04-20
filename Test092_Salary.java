//类方法的重写
public class Test092_Salary extends Test091_Employee {
    private double salary; // 全年工资

    public Test092_Salary(String name, String address, int number, double salary) {
        super(name, address, number); //调用父类被重写的方法
        setSalary(salary);
    }

    public void mailCheck() {
        System.out.println("Salary 类的 mailCheck 方法 ");
        System.out.println("邮寄支票给：" + getName()
                + " ，工资为：" + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary >= 0.0) {
            salary = newSalary;
        }
    }

    public double computePay() {
        System.out.println("计算工资，付给：" + getName());
        return salary / 52;
    }
}
