package enumdemo;

/**
 * 认识枚举类，搞清楚其本质特点
 */
public class EnumTest {
    public static void main(String[] args) {
        EnumDemo enum1 = EnumDemo.X;
        System.out.println(enum1); // X

        EnumDemo enum2 = EnumDemo.Y;
        System.out.println(enum2); // Y

        System.out.println(enum1.name()); // X
        System.out.println(enum2.name()); // Y

        System.out.println(enum1.ordinal()); // 索引 0
        System.out.println(enum2.ordinal()); // 索引 1
    }
}
