package practice;

/**
 * 开发验证码
 */
public class Captcha {
    public static void main(String[] args) {
        String code = getCode(6);
        System.out.println(code);
    }

    // 返回指定位数的验证码，每位只能是数字或者大写字母或者小写字母
    public static String getCode(int n) {
        String code = "";
        for (int i = 0; i < n; i++) {
            // 随机一个 0 或者 1 或者 2 表示当前位置随机的字符类型
            int type = (int) (Math.random() * 3);
            switch (type) {
                case 0:
                    // 如果当前位置是数字，则随机生成一个数字0-9，然后拼接
                    int num = (int) (Math.random() * 10);
                    code += num;
                    break;
                case 1:
                    // 如果当前位置是大写字母，则随机生成一个字母A-Z，然后拼接
                    int num1 = (int) (Math.random() * 26);
                    char ch = (char) ('A' + num1);
                    code += ch;
                    break;
                case 2:
                    // 如果当前位置是小写字母，则随机生成一个字母a-z，然后拼接
                    int num2 = (int) (Math.random() * 26);
                    char ch1 = (char) (97 + num2);
                    code += ch1;
                    break;
            }
        }
        return code;
    }
}
