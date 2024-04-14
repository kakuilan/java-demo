//此类模拟银行账户

import java.io.*;

public class Test081_CheckingAccount {
    //balance为余额,number为卡号
    private double balance;

    private int number;

    public Test081_CheckingAccount(int number) {
        this.number = number;
    }

    //方法:存钱
    public void deposit(double amount) {
        balance += amount;
    }

    //方法:取钱
    public void withdraw(double amount) throws Test080_InsufficientFundsException {
        if (amount <= balance) {
            balance -= amount;
        } else {
            double needs = amount - balance;
            throw new Test080_InsufficientFundsException(needs);
        }
    }

    //方法:返回余额
    public double getBalance() {
        return balance;
    }

    //方法:返回卡号
    public int getNumber() {
        return number;
    }
}
