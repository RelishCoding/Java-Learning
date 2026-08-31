package interfacedemo;

/**
 * 搞清楚接口JDK 8新增的三种方法，并理解其好处
 */
public class InterfaceTest4 {
    public static void main(String[] args) {
        Interface3 interface3 = new Interface3Impl();
        interface3.go();
        // interface3.run(); // 报错
        // interface3.show(); // 报错
        Interface3.show();
    }
}

class Interface3Impl implements Interface3 {

}
