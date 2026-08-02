package practice;

import java.util.Scanner;

/**
 * 案例：加油站支付小程序
 * 1.创建卡片类，以便创建金卡或者银卡对象，封装车主的数据
 * 2.定义一个卡片父类：Card，定义金卡和银卡的共同属性和方法
 * 3.定义一个金卡类，继承Card类：金卡必须重写消费方法（8折优惠），独有功能打印洗车票
 * 4.定义一个银卡类，继承Card类：银卡必须重写消费方法（9折优惠）
 */
public class CardTest {
    public static void main(String[] args) {
        // 办一张金卡：创建金卡对象。交给一个独立的业务（支付机）来完成：存款，消费
        GoldCard goldCard = new GoldCard("鄂A860MM", "dlei", "123456789", 1000);
        goldCard.deposit(500);
        pay(goldCard);

        // 办一张银卡：创建银卡对象。交给一个独立的业务（支付机）来完成：存款，消费
        SilverCard silverCard = new SilverCard("粤A88888", "zhangsan", "17834208905", 2000);
        pay(silverCard);
    }

    // 支付机：用一个方法来刷卡，可能接收金卡，也可能接收银卡
    public static void pay(Card card) {
        System.out.println("请刷卡，请输入您本次消费的金额：");
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();
        card.consume(money);
    }
}
