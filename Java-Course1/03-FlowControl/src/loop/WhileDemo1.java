package loop;

/**
 * 认识while循环的写法，搞清楚其执行流程
 */
public class WhileDemo1 {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        int i = 0;
        while (i < 3) {
            System.out.println("Hello World!");
            i++;
        }
        System.out.println(i); // 3
    }
}
