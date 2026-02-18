package staticfield;

/**
 * 目标：了解静态变量的应用
 */
public class UserTest {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new User();
        }
        System.out.println(User.count); // 5
    }
}
