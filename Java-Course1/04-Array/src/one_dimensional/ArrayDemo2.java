package one_dimensional;

import java.util.Scanner;

/**
 * 掌握数组的定义方式二：动态初始化数组
 */
public class ArrayDemo2 {
    public static void main(String[] args) {
        inputScore();
    }

    private static void inputScore() {
        // 1.定义一个数组存储8名学生的成绩
        // 定义数组时先不存入具体的元素值，只确定数组存储的数据类型和数组的长度
        double[] scores = new double[8];

        // 2.录入8名学生的成绩，存入到数组
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的成绩：");
            scores[i] = sc.nextDouble();
        }

        // 3.遍历数组，统计总分、最高分、最低分
        double allScore = scores[0];
        double maxScore = scores[0];
        double minScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            double score = scores[i];
            allScore += score;

            if (score > maxScore) {
                maxScore = score;
            }

            if (score < minScore) {
                minScore = score;
            }
        }

        System.out.println("平均分：" + allScore / scores.length);
        System.out.println("最高分：" + maxScore);
        System.out.println("最低分：" + minScore);
    }
}
