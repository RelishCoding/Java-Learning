package practice;

public class SilverCard extends Card {
    public SilverCard(String card, String name, String phone, double money) {
        super(card, name, phone, money);
    }

    @Override
    public void consume(double money) {
        double balance = getMoney();
        System.out.println("您的当前余额为：" + balance);

        System.out.println("您本次银卡消费：" + money);
        double discount = money * 0.9;
        System.out.println("优惠后的价格：" + discount);

        if (balance < discount) {
            System.out.println("您的当前余额不足！请先充值！");
            return;
        }

        // 更新银卡的账户余额
        setMoney(balance - discount);
        System.out.println("本次消费完成，您的银卡余额变更为：" + getMoney());
    }
}
