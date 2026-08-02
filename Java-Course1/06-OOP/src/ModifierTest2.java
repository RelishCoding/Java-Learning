import extend.modifier.Father;

/**
 * 认识四种权限修饰符的修饰范围
 */
public class ModifierTest2 {
    public static void main(String[] args) {
        Father father = new Father();
        // father.privateMethod(); // error
        // father.method(); // error
        // father.protectedMethod(); // error
        father.publicMethod();
    }
}
