//接口的继承
public interface Test098_Hockey extends Test097_Football {
    public void homeGoalScored();

    public void visitingGoalScored();

    public void endOfPeriod(int period);

    public void overtimePeriod(int ot);
}
