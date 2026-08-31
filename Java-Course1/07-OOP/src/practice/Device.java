package practice;

public class Device implements Switch {
    private String name;
    private boolean on; // false 默认是关闭

    public Device() {
    }

    public Device(String name, boolean on) {
        this.name = name;
        this.on = on;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", on=" + on +
                '}';
    }

    @Override
    public void press() {
        // 控制当前设备开和关
        on = !on;
    }
}
