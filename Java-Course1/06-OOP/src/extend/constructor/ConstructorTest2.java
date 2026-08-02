package extend.constructor;

/**
 * 子类构造器调用父类构造器的应用场景
 */
public class ConstructorTest2 {
    public static void main(String[] args) {
        Teacher t = new Teacher("dlei", "Java、大数据、微服务", '男');
        System.out.println(t.getName());
        System.out.println(t.getSex());
        System.out.println(t.getSkill());
    }
}

class People {
    private String name;
    private char sex;

    public People() {
    }

    public People(String name, char sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}

class Teacher extends People {
    private String skill;

    public Teacher() {

    }

    public Teacher(String name, String skill, char sex) {
        // 把子类继承自父类的数据也完成初始化赋值
        super(name, sex);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
