package loop;

/**
 * 搞清楚循环嵌套的流程
 */
public class ForForDemo {
    public static void main(String[] args) {
        test();
        print99();
    }

    public static void test() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*"); // 不换行打印
            }
            // 打印完一行需要换行
            System.out.println();
        }
    }

    // 打印九九乘法表
    public static void print99() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (j * i) + "\t");
            }
            System.out.println();
        }
    }
}
