package branch;

/**
 * 搞清楚switch的注意事项，穿透性的应用
 */
public class SwitchDemo2 {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    /*
        switch表达式类型只能是byte、short、int、char，
        JDK5开始支持枚举，JDK7开始支持String,
        不支持double、float、long。
     */
    public static void test1() {
        /*double a = 0.1 + 0.2;
        System.out.println(a); // 0.30000000000000004
        switch (a) {
            case 0.3:
                System.out.println("10.5");
                break;
            case 10.8:
                System.out.println("10");
                break;
            default:
                System.out.println("default");
        }*/
    }

    /*
        case给出的值不允许重复，且只能是字面量，不能是变量
     */
    public static void test2() {
        int a = 10;
        int b = 15;
        switch (a) {
            case 10:
                System.out.println("10");
                break;
            /*case 10:
                System.out.println("10");
                break;*/
            case 15:
                System.out.println("15");
                break;
            /*case b:
                System.out.println("15");
                break;*/
            default:
                System.out.println("default");
        }
    }

    /*
        正常使用switch的时候，不要忘记写break，否则会出现穿透现象
        穿透性的作用：相同程序的case块，可以通过穿透性进行合并，从而减少重复代码的书写
     */
    public static void test3() {
        String week = "周二";
        switch (week) {
            case "周一":
                System.out.println("埋头苦干，解决bug");
                break;
            case "周二":
            case "周三":
            case "周四":
                System.out.println("请求大牛程序员帮忙");
                break;
            case "周五":
                System.out.println("自己整理代码");
                break;
            case "周六":
            case "周日":
                System.out.println("打游戏");
                break;
            default:
                System.out.println("星期信息有误！");
        }
    }
}
