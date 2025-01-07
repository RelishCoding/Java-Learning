package operator;

/**
 * 掌握逻辑运算符的使用
 */
public class OperatorDemo6 {
    public static void main(String[] args) {
        System.out.println(isMatch(175, 70, '女')); // true
        System.out.println(isMatch(175, 70, '男')); // false

        System.out.println(isMatch2(180, 10000)); // true
        System.out.println(isMatch2(175, 1000000)); // true
        System.out.println(isMatch2(170, 100000)); // false

        isMatch3(true);

        System.out.println("--------------");
        isMatch4();

        System.out.println("---------------");
        print();
    }

    // 需求：判断某个人的条件是否满足择偶要求，如果满足返回true.否则是false
    // 条件是：身高高于170，体重在60-80之间，且性别为女
    public static boolean isMatch(int height, int weight, char sex) {
        // & 必须前后条件都是true结果才是true,只要有一个是false，结果一定是false
        boolean result = height > 170 & weight >= 60 & weight <= 80 & sex == '女';
        return result;
    }

    // 需求：找一个男朋友，要求是要么身高高于180，要么收入高于30万
    public static boolean isMatch2(int height, int income) {
        // | 只要前后条件有一个为true,结果一定是true,必须都是false结果才是false
        boolean result = height >= 180 | income > 300000;
        return result;
    }

    // ！ 非，你真我假，你假我真
    public static void isMatch3(boolean flag) {
        System.out.println(!flag);
    }

    // ^ 异或，相同条件结果为false，条件不同为true
    public static void isMatch4() {
        System.out.println(false ^ false); // false
        System.out.println(true ^ true); // false
        System.out.println(true ^ false); // true
        System.out.println(false ^ true); // true
    }

    // &&与&、||与|的区别
    public static void print() {
        int a = 111;
        int b = 2;
        // && 发现左边条件为false右边直接不执行
        System.out.println(a > 1000 && ++b > 1); // false
        System.out.println(b); // 2
        // & 即便发现左边条件为false右边依然执行
        System.out.println(a > 1000 & ++b > 1); // false
        System.out.println(b); // 3

        int i = 10;
        int j = 20;
        // || 发现左边条件为true右边直接不执行
        System.out.println(i > 6 || ++j > 1); // true
        System.out.println(j); // 20
        // & 即便发现左边条件为true右边依然执行
        System.out.println(i > 6 | ++j > 1); // true
        System.out.println(j); // 21
    }
}
