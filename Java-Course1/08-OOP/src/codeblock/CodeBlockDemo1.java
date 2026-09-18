package codeblock;

import java.util.Arrays;

/**
 * 认识代码块，搞清楚代码块的基本作用
 */
public class CodeBlockDemo1 {
    public static String schoolName;
    public static String[] cards = new String[54];

    // 静态代码块：由static修饰，属于类，与类一起优先加载，自动执行一次
    // 基本作用：可以完成对类的静态资源的初始化
    static {
        System.out.println("===静态代码块执行了===");
        schoolName = "北京大学";
        cards[0] = "A";
        cards[1] = "2";
        cards[2] = "3";
    }

    public static void main(String[] args) {
        System.out.println("===main方法执行了===");
        System.out.println(schoolName);
        System.out.println(Arrays.toString(cards)); // 返回数组的内容观察
    }
}
