package Calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculadora extends JFrame implements ActionListener {

    JTextField cmpNum1, cmpNum2, cmpSumar, cmpRestar, cmpMult, cmpDiv;
    JButton btnCalcular, btnRevertir, btnRestaurar;

    public Calculadora() {
        this("Calculadora", 10, 10, 300, 350);
    }

    public Calculadora(String titulo, int x, int y, int w, int h) {
        super(titulo);
        this.getContentPane().setLayout(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setBounds(x, y, w, h);
        this.setVisible(true);

        JLabel lblNum1 = new JLabel("Num1");
        lblNum1.setBounds(20, 20, 80, 20);
        this.getContentPane().add(lblNum1);
        cmpNum1 = new JTextField();
        cmpNum1.setBounds(100, 20, 150, 20);
        this.getContentPane().add(cmpNum1);
        JLabel lblNum2 = new JLabel("Num2");
        lblNum2.setBounds(20, 50, 80, 20);
        this.getContentPane().add(lblNum2);
        cmpNum2 = new JTextField();
        cmpNum2.setBounds(100, 50, 150, 20);
        this.getContentPane().add(cmpNum2);

        btnRevertir = new JButton("Cancel");
        btnRevertir.setBounds(20, 80, 80, 30);
        this.getContentPane().add(btnRevertir);
        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(120, 80, 100, 30);
        this.getContentPane().add(btnCalcular);
        btnRestaurar = new JButton("CE");
        btnRestaurar.setBounds(100, 250, 100, 30);
        this.getContentPane().add(btnRestaurar);

        JLabel lblSumar = new JLabel("Sumar");
        lblSumar.setBounds(20, 130, 80, 20);
        this.getContentPane().add(lblSumar);
        cmpSumar = new JTextField();
        cmpSumar.setBounds(100, 130, 150, 20);
        this.getContentPane().add(cmpSumar);
        JLabel lblRestar = new JLabel("Restar");
        lblRestar.setBounds(20, 160, 80, 20);
        this.getContentPane().add(lblRestar);
        cmpRestar = new JTextField();
        cmpRestar.setBounds(100, 160, 150, 20);
        this.getContentPane().add(cmpRestar);
        JLabel lblMult = new JLabel("Multiplicar");
        lblMult.setBounds(20, 190, 80, 20);
        this.getContentPane().add(lblMult);
        cmpMult = new JTextField();
        cmpMult.setBounds(100, 190, 150, 20);
        this.getContentPane().add(cmpMult);
        JLabel lblDiv = new JLabel("Dividir");
        lblDiv.setBounds(20, 220, 80, 20);
        this.getContentPane().add(lblDiv);
        cmpDiv = new JTextField();
        cmpDiv.setBounds(100, 220, 150, 20);
        this.getContentPane().add(cmpDiv);

        btnRevertir.addActionListener(this);
        btnCalcular.addActionListener(this);
        btnRestaurar.addActionListener(this);

        paintComponents(getGraphics());

    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == btnCalcular) {
            Double num1, num2, sumar, restar, multiplicar, dividir;
            num1 = Double.parseDouble(cmpNum1.getText());
            num2 = Double.parseDouble(cmpNum2.getText());
            sumar = num1 + num2;
            restar = num1 - num2;
            multiplicar = num1 * num2;
            dividir = num1 / num2;
            cmpSumar.setText(String.valueOf(sumar));
            cmpRestar.setText(String.valueOf(restar));
            cmpMult.setText(String.valueOf(multiplicar));
            cmpDiv.setText(String.valueOf(dividir));
        }
        if (event.getSource() == btnRevertir) {
            Double numero1 = Double.parseDouble(cmpNum1.getText());
            Double numero2 = Double.parseDouble(cmpNum2.getText());
            if (numero1 < numero2) {
                cmpNum1.setText(String.valueOf(numero2));
                cmpNum2.setText(String.valueOf(numero1));
            }
        }
        if (event.getSource() == btnRestaurar) {
            cmpNum1.setText("");
            cmpNum2.setText("");
            cmpSumar.setText("");
            cmpRestar.setText("");
            cmpMult.setText("");
            cmpDiv.setText("");
        }
    }

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

    }

}
