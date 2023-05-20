import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstForm extends JFrame{
    private static final long serialVersionUID = 1L;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPanel contentPane;
    public FirstForm() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 350, 220);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        setContentPane(contentPane);

        JLabel label1 = new JLabel("ОПІР");
        textField1 = new JTextField();

        JLabel label2 = new JLabel("НАПРУГА");
        textField2 = new JTextField();

        JLabel label3 = new JLabel("СИЛА СТРУМУ");
        textField3 = new JTextField();


        label1.setBounds(40, 30, 80, 20);
        label2.setBounds(40, 60, 80, 20);
        label3.setBounds(40, 90, 80, 20);


        textField1.setBounds(150, 30, 150, 20);
        textField2.setBounds(150, 60, 150, 20);
        textField3.setBounds(150, 90, 150, 20);

        textField3.setEditable(false);

        contentPane.add(label1);
        contentPane.add(textField1);
        contentPane.add(label2);
        contentPane.add(textField2);
        contentPane.add(label3);
        contentPane.add(textField3);


        JButton btnCalculate = new JButton("ОБЧИСЛИТИ");
        btnCalculate.setBounds(150, 120, 150, 30);
        contentPane.add(btnCalculate);

        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double r = Double.parseDouble(textField1.getText());
                double u = Double.parseDouble(textField2.getText());
                double i=u/r;
                textField3.setText(Double.toString(i));
            }
        });
        setVisible(true);
    }
}