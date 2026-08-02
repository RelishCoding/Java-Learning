package practice;

public class GoldCard extends Card {
    public GoldCard(String card, String name, String phone, double money) {
        super(card, name, phone, money);
    }

    @Override
    public void consume(double money) {
        double balance = getMoney();
        System.out.println("您的当前余额为：" + balance);

        System.out.println("您本次金卡消费：" + money);
        double discount = money * 0.8;
        System.out.println("优惠后的价格：" + discount);

        if (balance < discount) {
            System.out.println("您的当前余额不足！请先充值！");
            return;
        }

        // 更新金卡的账户余额
        setMoney(balance - discount);
        System.out.println("本次消费完成，您的金卡余额变更为：" + getMoney());

        // 判断消费如果大于200，调用金卡独有的功能：打印洗车票
        if (discount >= 200) {
            printTicket();
        } else {
            System.out.println("您本次消费不满200元，不能免费洗车！");
        }
    }

    // 打印洗车票
    public void printTicket() {
        System.out.println("您本次消费大于200元，请打印洗车票。");
    }
}
