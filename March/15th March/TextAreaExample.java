import javax.swing.*;;

public class TextAreaExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("Text Area Example");
        JTextArea textArea = new JTextArea("Welcome to my GitHub Profile!");
        textArea.setBounds(40, 50, 300, 200);
        f.add(textArea);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}