package codeblock;

import java.util.Arrays;

/**
 * 实例代码块
 */
public class CodeBlockDemo2 {
    private String name;
    private String[] direction = new String[4]; // 实例变量

    // 实例代码块：无static修饰。属于对象，每次创建对象时，都会优先执行一次
    // 基本作用：初始化对象的实例资源
    {
        System.out.println("===实例代码块执行了===");
        name = "zhangsan";
        direction[0] = "east";
        direction[1] = "north";
        direction[2] = "south";
        direction[3] = "west";
    }

    public static void main(String[] args) {
        System.out.println("===main方法执行了===");
        new CodeBlockDemo2();
        new CodeBlockDemo2();
        CodeBlockDemo2 codeBlockDemo2 = new CodeBlockDemo2();
        System.out.println(codeBlockDemo2.name);
        System.out.println(Arrays.toString(codeBlockDemo2.direction));
    }
}
