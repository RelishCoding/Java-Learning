package abstractdemo;

public class Teacher extends Person {
    /*public void write() {
        System.out.println("第一段");
        System.out.println("老师写的第二段");
        System.out.println("第三段");
    }*/

    @Override
    public void writeMain() {
        System.out.println("老师写的第二段");
    }
}
