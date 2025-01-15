package practice;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜数字游戏
 */
public class GuessNumber {
    public static void main(String[] args) {
        guess();
    }

    public static void guess() {
        // 生成1-100之间的随机数
        // 方式一
        // Math.random()返回[0,1)的随机小数
        int num = (int)(Math.random() * 100) + 1;
        System.out.println(num);

        // 方式二
        Random random = new Random(); // 得到一个随机数对象
        int luckNumber = random.nextInt(100) + 1;
        System.out.println(luckNumber);

        Scanner sc = new Scanner(System.in);
        // 定义一个死循环让用户一直猜测，直到猜中才结束循环
        while (true) {
            System.out.println("请输入猜测的数字：");
            int guessNumber = sc.nextInt();

            // 判断猜测的数字和随机数是否一致
            if (guessNumber == luckNumber) {
                System.out.println("恭喜你，猜对了！");
                break;
            } else if (guessNumber > luckNumber) {
                System.out.println("猜大了！");
            } else {
                System.out.println("猜小了！");
            }
        }
    }
}
