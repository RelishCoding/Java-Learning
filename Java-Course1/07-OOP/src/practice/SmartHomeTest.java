package practice;

import java.util.Scanner;

/**
 * 目标：面向对象编程实现智能家居控制系统。
 * 角色：设备（吊灯，电视机，洗衣机，落地窗，....）
 * 具备的功能：开和关
 * 谁控制他们：智能控制系统（单例对象），控制调用设备的开和关
 */
public class SmartHomeTest {
    public static void main(String[] args) {
        // 1、定义设备类：创建设备对象代表家里的设备

        // 2、准备这些设备对象，放到数组中，代表整个家庭的设备
        Device[] devices = new Device[4];
        devices[0] = new Television("小米电视");
        devices[1] = new WashingMachine("美的洗衣机");
        devices[2] = new Lamp("欧灯");
        devices[3] = new AirConditioner("美的空调");

        // 3、为每个设备制定一个开个关的功能。定义一个接口，让Device类实现开关功能

        // 4、创建智能控制系统对象，控制设备开和关
        // SmartHomeControl smartHomeControl = new SmartHomeControl();
        SmartHomeControl smartHomeControl = SmartHomeControl.getSmartHomeControl();

        // 5、提示用户操作，a、展示全部设备的当前情况。b、让用户选择哪一个操作
        while (true) {
            // 打印全部设备的开和关的现状
            smartHomeControl.printAllDevices(devices);
            System.out.println("请您选择要控制的设备：");
            Scanner sc = new Scanner(System.in);
            String command = sc.next();
            switch (command) {
                case "1":
                    smartHomeControl.control(devices[0]);
                    break;
                case "2":
                    smartHomeControl.control(devices[1]);
                    break;
                case "3":
                    smartHomeControl.control(devices[2]);
                    break;
                case "4":
                    smartHomeControl.control(devices[3]);
                    break;
                case "exit":
                    System.out.println("退出控制系统");
                    return;
                default:
                    System.out.println("输入有误，请重新输入");
            }
        }
    }
}
