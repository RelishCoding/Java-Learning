package innerclass;

/**
 * 搞清楚匿名内部类的使用形式（语法）：通常可以做为一个对象参数传输给方法使用
 */
public class InnerClassDemo4 {
    public static void main(String[] args) {
        // 需求：学生、老师都要参加游泳比赛
        Swim s1 = new Student();
        start(s1);
        System.out.println("-------------------");

        Swim s2 = new Teacher();
        start(s2);
        System.out.println("----------------------");

        Swim s3 = new Swim() {
            @Override
            public void swimming() {
                System.out.println("Student swimming");
            }
        };
        start(s3);
        System.out.println("-------------------");

        Swim s4 = new Swim() {
            @Override
            public void swimming() {
                System.out.println("Teacher swimming");
            }
        };
        start(s4);
        System.out.println("------------------");

        start(new Swim() {
            @Override
            public void swimming() {
                System.out.println("Swimming");
            }
        });
    }

    private static void start(Swim swim) {
        System.out.println("start...");
        swim.swimming();
        System.out.println("end...");
    }
}

class Teacher implements Swim {
    @Override
    public void swimming() {
        System.out.println("Teacher swimming");
    }
}

class Student implements Swim {
    @Override
    public void swimming() {
        System.out.println("Student swimming");
    }
}

interface Swim {
    void swimming();
}
