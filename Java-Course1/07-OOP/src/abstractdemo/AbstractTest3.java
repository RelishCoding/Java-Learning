package abstractdemo;

/**
 * 理解抽象类的使用场景之二：模板方法设计模式
 */
public class AbstractTest3 {
    public static void main(String[] args) {
        // 学生和老师都要一篇作文，第一段是一样的
        // 第二段不一样，老师和学生各写各的
        // 第三段是一样的

        // 解决办法：抽取出一个父类，父类中抽取一个模板方法给子类使用
        Student s = new Student();
        s.write();

        Teacher t = new Teacher();
        t.write();
    }
}
