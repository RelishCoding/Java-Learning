package extend.modifier;

/**
 * 认识四种权限修饰符的修饰范围
 */
public class ModifierTest {
    public static void main(String[] args) {
        Father father = new Father();
        // father.privateMethod(); // error
        father.method();
        father.protectedMethod();
        father.publicMethod();
    }
}
