import javax.swing.*;

public class TextFieldExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("TextField Example");
        JTextField textFieldOne, textFieldTwo;
        textFieldOne = new JTextField("Welcome to my Git Profile!");
        textFieldOne.setBounds(50, 100, 200, 30);
        textFieldTwo = new JTextField("I'm interested in Coding!.");
        textFieldTwo.setBounds(50, 150, 200, 30);
        f.add(textFieldOne);
        f.add(textFieldTwo);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
