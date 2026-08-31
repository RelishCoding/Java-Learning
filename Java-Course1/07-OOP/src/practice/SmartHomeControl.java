package practice;

// 智能控制系统类
public class SmartHomeControl {
    private static final SmartHomeControl smartHomeControl = new SmartHomeControl();

    private SmartHomeControl() {

    }

    public static SmartHomeControl getSmartHomeControl() {
        return smartHomeControl;
    }

    // 多态
    public void control(Device device) {
        System.out.println(device.getName() + "状态目前是：" + (device.isOn() ? "开着" : "关闭"));
        System.out.println("开始您的操作。。。。。");
        device.press();
        System.out.println(device.getName() + "状态已经是：" + (device.isOn() ? "开着" : "关闭！"));
    }

    public void printAllDevices(Device[] devices) {
        for (int i = 0; i < devices.length; i++) {
            Device device = devices[i];
            System.out.println((i + 1) + "," + device.getName() + "状态目前是：" + (device.isOn() ? "开着" : "关闭！"));
        }
    }
}
