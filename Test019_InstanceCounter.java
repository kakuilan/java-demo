//static 修饰符
public class Test019_InstanceCounter {
    private static int numInstances = 0;

    protected static int getCount() {
        return numInstances;
    }

    private static void addInstance() {
        numInstances++;
    }

    Test019_InstanceCounter() {
        Test019_InstanceCounter.addInstance();
    }

    public static void main(String[] arguments) {
        System.out.println("Starting with " +
                Test019_InstanceCounter.getCount() + " instances");
        for (int i = 0; i < 500; ++i) {
            new Test019_InstanceCounter();
        }
        System.out.println("Created " +
                Test019_InstanceCounter.getCount() + " instances");
    }
}
