import java.io.*;

//自定义异常类,继承Exception类
public class Test080_InsufficientFundsException extends Exception {
    //此处的amount用来存储当出现异常(取出钱多余余额时)所缺乏的钱.
    private double amount;

    public Test080_InsufficientFundsException(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
