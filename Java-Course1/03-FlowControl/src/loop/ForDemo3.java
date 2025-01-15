package loop;

import java.util.Scanner;

/**
 * for循环求奇数和
 */
public class ForDemo3 {
    public static void main(String[] args) {
        System.out.println("请输入变量 n：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("1到" + n + "的奇数和为：" + sum1(n));
        System.out.println("1到" + n + "的奇数和为：" + sum2(n));
    }

    public static int sum1(int n) {
        int sum = 0;

        // 循环1-n的全部数字
        for (int i = 1; i <= n; i++) {
            // 判断当前数字是否是奇数
            if (i % 2 == 1) {
                // 如果是奇数，累加到sum中
                sum += i;
            }
        }

        return sum;
    }

    public static int sum2(int n) {
        int sum = 0;
        // 循环1-n的全部数字
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
}
