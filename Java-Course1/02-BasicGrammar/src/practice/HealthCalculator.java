package practice;

import java.util.Scanner;

/**
 * 健康计算器
 */
public class HealthCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1.先让用户输入自己的个人信息，身高、体重、性别、年龄
        System.out.println("请输入您的身高（cm）：");
        double height = sc.nextDouble();
        System.out.println("请输入您的体重（kg）：");
        double weight = sc.nextDouble();
        System.out.println("请输入您的性别（男/女）：");
        String sex = sc.next();
        System.out.println("请输入您的年龄：");
        int age = sc.nextInt();

        double bmi = calcBMI(height, weight);
        System.out.println("您的BMI值是：" + bmi);

        double bmr = calcBMR(height, weight, sex, age);
        System.out.println("您的BMR值是：" + bmr);

        if (bmi < 18.5) {
            System.out.println("您的体重过低");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("您的体重处于正常范围");
        } else if (bmi > 24.9 && bmi <= 29.9) {
            System.out.println("您的体重超重");
        } else {
            System.out.println("您已达到肥胖");
        }
    }

    // 2.根据个人情况，计算BMI指数
    public static double calcBMI(double height, double weight) {
        return weight / (height * height * 0.0001);
    }

    // 3.根据个人信息，计算BMR指数
    public static double calcBMR(double height, double weight, String sex, int age) {
        double bmr = 0;
        if ("男".equals(sex)) {
            bmr = 88.362 + (13.397 * weight + 4.799 * height - 5.677 * age);
        } else {
            bmr = 447.593 + (9.247 * weight + 3.098 * height - 4.330 * age);
        }
        return bmr;
    }
}
