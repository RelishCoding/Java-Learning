package innerclass;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 搞清楚几个匿名内部类的使用场景
 */
public class InnerClassDemo5 {
    public static void main(String[] args) {
        // 需求：创建一个登录窗口，窗口上只有一个登录按钮
        JFrame window = new JFrame("登录窗口");
        window.setSize(300, 200);
        window.setLocationRelativeTo(null); // 居中显示
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JButton btn1 = new JButton("登录");
        btn1.addActionListener(new LoginClickListener());
        panel.add(btn1);

        JButton btn2 = new JButton("注册");
        // Java要求必须给这个按钮添加一个点击事件监听器对象，这样就可以监听用户的点击操作，就可以做出反应
        // 开发中不是我们要主动去写匿名内部类，而是用别人的功能的时候，别人可以让我们写一个匿名内部类，我们才会写
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("用户点击了注册按钮");
            }
        });
        // btn2.addActionListener(e -> System.out.println("注册成功"));
        panel.add(btn2);

        window.add(panel);
        window.setVisible(true);
    }
}

class LoginClickListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("用户点击了登录按钮");
    }
}
