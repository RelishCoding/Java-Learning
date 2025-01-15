package loop;

/**
 * 掌握for循环的书写，搞清楚其执行流程
 */
public class ForDemo1 {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        for (int i = 0; i < 3; i++) {
            System.out.println("HelloWorld");
        }
        // System.out.println(i); // 报错

        System.out.println("------------");

        for (int i = 1; i < 9; i+=2) {
            System.out.println("hello world");
        }
    }
}
