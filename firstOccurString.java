import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Myframe extends JFrame implements ActionListener {

    JLabel label1, label2, label3, label4, label5;
    JTextField t1, t2;
    JButton submit;
    JTextArea screen;

    Myframe() {
        setTitle("Assingment 3");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);

        label1 = new JLabel("Enter the sentence: ");
        label1.setBounds(20, 50, 200, 20);
        c.add(label1);

        t1 = new JTextField();
        t1.setBounds(140, 50, 200, 20);
        c.add(t1);

        label2 = new JLabel("Enter the letter: ");
        label2.setBounds(20, 100, 200, 20);
        c.add(label2);

        t2 = new JTextField();
        t2.setBounds(140, 100, 200, 20);
        c.add(t2);

        submit = new JButton("Submit");
        submit.setBounds(150, 200, 100, 20);
        c.add(submit);

        submit.addActionListener(this);

        screen = new JTextArea();
        screen.setBounds(350, 50, 300, 300);
        c.add(screen);
        c.setBackground(Color.YELLOW);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String sentence = t1.getText();
        String letter = t2.getText();
        screen.setText(firstOccur(sentence, letter));

    }

    public String firstOccur(String t1, String t2) {
        String firstOccrStr = "";
        int n = t1.length();
        for (int i = 0; i < n; i++) {
            if (t1.charAt(i) == t2.charAt(0)) {
                firstOccrStr = t1.substring(i + 1, n);
                break;
            } else {
                firstOccrStr = "The letter does not exist in the sentence.";
            }
        }
        return firstOccrStr;
    }

}

class RegistrationForm {
    public static void main(String[] args) {

        Myframe frame = new Myframe();

    }
}
