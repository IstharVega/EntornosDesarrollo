import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Programm extends JFrame {
    private static JTextField txtDisplay;
    private JButton btnAdd, btnSubtract, btnMultiply, btnDivide;
    public static final int ADDITION = 1;
    public static final int SUBTRACTION = 2;
    public static final int MULTIPLICATION = 3;
    public static final int DIVISION = 4;

    public void Calculator() {
        initComponents();
    }

    private void initComponents() {
        setLayout(new GridLayout(5, 5));
        setSize(300, 300);

        txtDisplay = new JTextField();
        btnAdd = new JButton("+");
        btnSubtract = new JButton("-");
        btnMultiply = new JButton("*");
        btnDivide = new JButton("/");

        add(txtDisplay);
        add(btnAdd);
        add(btnSubtract);
        add(btnMultiply);
        add(btnDivide);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame("JFrame");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(495, 495);
        frame.setLayout(new GridBagLayout());

        JLabel element_num1 = new JLabel("Numero 1");
        GridBagConstraints constraints_element_num1 = new GridBagConstraints();
        constraints_element_num1.gridx = 1;
        constraints_element_num1.gridy = 1;
        constraints_element_num1.gridwidth = 1;
        constraints_element_num1.gridheight = 1;
        constraints_element_num1.fill = GridBagConstraints.HORIZONTAL;
        frame.add(element_num1, constraints_element_num1);

        JTextField element_1699703840239 = new JTextField(20);
        GridBagConstraints constraints_element_1699703840239 = new GridBagConstraints();
        constraints_element_1699703840239.gridx = 5;
        constraints_element_1699703840239.gridy = 1;
        constraints_element_1699703840239.gridwidth = 2;
        constraints_element_1699703840239.gridheight = 1;
        constraints_element_1699703840239.fill = GridBagConstraints.HORIZONTAL;
        frame.add(element_1699703840239, constraints_element_1699703840239);

        JLabel element_num2 = new JLabel("Numero 2");
        GridBagConstraints constraints_element_num2 = new GridBagConstraints();
        constraints_element_num2.gridx = 1;
        constraints_element_num2.gridy = 2;
        constraints_element_num2.gridwidth = 2;
        constraints_element_num2.gridheight = 1;
        constraints_element_num2.fill = GridBagConstraints.HORIZONTAL;
        frame.add(element_num2, constraints_element_num2);

        JTextField element_1699703842280 = new JTextField(20);
        GridBagConstraints constraints_element_1699703842280 = new GridBagConstraints();
        constraints_element_1699703842280.gridx = 5;
        constraints_element_1699703842280.gridy = 2;
        constraints_element_1699703842280.gridwidth = 2;
        constraints_element_1699703842280.gridheight = 1;
        constraints_element_1699703842280.fill = GridBagConstraints.HORIZONTAL;
        frame.add(element_1699703842280, constraints_element_1699703842280);

        JButton btnAdd = new JButton("+");
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Retrieve the numbers from the display
                double num1 = Double.parseDouble(txtDisplay.getText());
                txtDisplay.setText("");
                double num2 = Double.parseDouble(txtDisplay.getText());

                // Perform the addition and update the display
                double result = num1 + num2;
                txtDisplay.setText(Double.toString(result));
            }
        });

        JButton btnSubtract = new JButton("-");
        btnSubtract.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Retrieve the numbers from the display
                double num1 = Double.parseDouble(txtDisplay.getText());
                txtDisplay.setText("");
                double num2 = Double.parseDouble(txtDisplay.getText());

                // Perform the subtraction and update the display
                double result = num1 - num2;
                txtDisplay.setText(Double.toString(result));
            }
        });

        JButton btnMultiply = new JButton("*");
        btnMultiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Retrieve the numbers from the display
                double num1 = Double.parseDouble(txtDisplay.getText());
                txtDisplay.setText("");
                double num2 = Double.parseDouble(txtDisplay.getText());
        
                // Perform the multiplication and update the display
                double result = num1 * num2;
                txtDisplay.setText(Double.toString(result));
            }
        });

        JButton btnDivide = new JButton("/");
btnDivide.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        // Retrieve the numbers from the display
        double num1 = Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        double num2 = Double.parseDouble(txtDisplay.getText());

        // Perform the division and update the display
        double result = num1 / num2;
        txtDisplay.setText(Double.toString(result));
    }
});

        JLabel element_1699704028728 = new JLabel("Resultado");
        GridBagConstraints constraints_element_1699704028728 = new GridBagConstraints();
        constraints_element_1699704028728.gridx = 3;
        constraints_element_1699704028728.gridy = 9;
        constraints_element_1699704028728.gridwidth = 1;
        constraints_element_1699704028728.gridheight = 1;
        constraints_element_1699704028728.fill = GridBagConstraints.HORIZONTAL;
        frame.add(element_1699704028728, constraints_element_1699704028728);

        JTextField element_resultado = new JTextField(20);
        GridBagConstraints constraints_element_resultado = new GridBagConstraints();
        constraints_element_resultado.gridx = 5;
        constraints_element_resultado.gridy = 9;
        constraints_element_resultado.gridwidth = 2;
        constraints_element_resultado.gridheight = 1;
        constraints_element_resultado.fill = GridBagConstraints.HORIZONTAL;
        frame.add(element_resultado, constraints_element_resultado);

        frame.setVisible(true);
    }
}
