package innerclass;

// 外部类
public class OuterClass1 {
    public static String schoolName = "北京大学";
    private int age;

    public static void test() {
        System.out.println("test方法执行了");
    }

    public void run() {
        System.out.println("run方法执行了");
    }

    // 成员内部类：无static修饰，属于外部类的对象持有
    public class InnerClass1 {
        private String name;

        public InnerClass1() {
        }

        public InnerClass1(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void show() {
            System.out.println("show方法执行了");
            // 成员内部类中可以直接访问外部类的静态成员
            System.out.println(schoolName);
            // 成员内部类中可以直接调用外部类的静态方法
            test();
            // 也可以直接访问外部类的实例成员
            System.out.println(age);
            // 也可以调用外部类的实例方法
            run();

            System.out.println(this); // 自己的对象
            System.out.println(OuterClass1.this); // 寄生的外部类对象
        }
    }
}
