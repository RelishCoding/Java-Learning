package staticmethod;

// 静态方法设计工具类
public class VerifyCodeUtil {
    // 工具类没有创建对象的必要性，所以建议私有化构造器
    private VerifyCodeUtil() {

    }

    public static String getCode(int n) {
        String code = "";

        for (int i = 0; i < n; i++) {
            // 随机一个0或者1或者2表示当前位置随机的字符类型
            int type = (int) (Math.random() * 3); // [0,1) * 3 => 0 1 2
            switch (type) {
                case 0:
                    int num = (int) (Math.random() * 10);
                    code += num;
                    break;
                case 1:
                    int num1 = (int) (Math.random() * 26); // [0,25]
                    char ch = (char) (65 + num1); // 得到大写字母的随机编号，转成大写字母
                    code += ch;
                    break;
                case 2:
                    int num2 = (int) (Math.random() * 26); // [0,25]
                    char ch1 = (char) (97 + num2);
                    code += ch1;
                    break;
            }
        }

        return code;
    }
}
