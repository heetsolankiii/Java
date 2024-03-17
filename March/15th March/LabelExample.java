import javax.swing.*;

public class LabelExample {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JLabel labelOne, labelTwo;
        labelOne = new JLabel("First Label");
        labelOne.setBounds(50, 50, 100, 30);
        labelTwo = new JLabel("Second Label");
        labelTwo.setBounds(50, 100, 100, 30);
        f.add(labelOne);
        f.add(labelTwo);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
