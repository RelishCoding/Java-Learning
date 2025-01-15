package branch;

/**
 * 练习：自动驾驶汽车过红绿灯
 */
public class IfDemo2 {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        // 假设现在通过摄像头获取到了三种灯的状态信息
        boolean red = true;
        boolean yellow = false;
        boolean green = false;

        if (red) {
            System.out.println("红灯亮，停止");
        } else if (yellow) {
            System.out.println("黄灯亮，准备");
        } else if (green) {
            System.out.println("绿灯亮，开始");
        } else {
            System.out.println("灯泡故障，停止");
        }
    }
}
