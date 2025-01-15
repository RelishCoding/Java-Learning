package branch;

import java.util.Scanner;

/**
 * 搞清楚switch分支结构的应用和写法，理解其执行流程
 */
public class SwitchDemo1 {
    public static void main(String[] args) {
        test();
    }

    // 根据男女性别的不同，推荐不同的书本信息给其观看
    public static void test() {
        System.out.println("请输入您的性别：");
        Scanner sc = new Scanner(System.in);
        String sex = sc.next();

        switch (sex) {
            case "男":
                System.out.println("推荐《Java从入门到精通》");
                break;
            case "女":
                System.out.println("推荐《从您的全世界路过》");
                break;
            default:
                System.out.println("没有推荐");
        }
    }
}
