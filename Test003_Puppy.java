public class Test003_Puppy {
    public Test003_Puppy(String name) {
        //这个构造器仅有一个参数：name
        System.out.println("小狗的名字是 : " + name);
    }

    public static void main(String[] args) {
        // 下面的语句将创建一个Puppy对象
        Test003_Puppy myPuppy = new Test003_Puppy("tommy");
    }
}
