package loop;

import java.util.Scanner;

/**
 * for循环求和的案例
 */
public class ForDemo2 {
    public static void main(String[] args) {
        System.out.println("请输入变量 n：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("1到" + n + "的和为：" + sum(n));
    }

    public static int sum(int n) {
        // 初始化一个变量来存储累加和
        int sum = 0;

        // 循环结构
        for (int i = 0; i < n; i++) {
            sum += i;
        }

        // 循环结束后返回结果
        return sum;
    }
}
