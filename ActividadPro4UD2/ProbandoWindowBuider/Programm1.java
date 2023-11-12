package ProbandoWindowBuider;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Programm1 {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame("JFrame");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(495,495);
        frame.setLayout(new GridBagLayout());

		JTextField element_1699642739721 = new JTextField(20);
        GridBagConstraints constraints_element_1699642739721 = new GridBagConstraints();
        constraints_element_1699642739721.gridx = 5;
        constraints_element_1699642739721.gridy = 3;
        constraints_element_1699642739721.gridwidth = 2;
        constraints_element_1699642739721.gridheight = 1;
        constraints_element_1699642739721.fill = GridBagConstraints.HORIZONTAL;
        frame.add(element_1699642739721, constraints_element_1699642739721);

		JButton element_1699642741889 = new JButton("Aceptar");
        GridBagConstraints constraints_element_1699642741889 = new GridBagConstraints();
        constraints_element_1699642741889.gridx = 6;
        constraints_element_1699642741889.gridy = 4;
        constraints_element_1699642741889.gridwidth = 2;
        constraints_element_1699642741889.gridheight = 1;
        constraints_element_1699642741889.fill = GridBagConstraints.HORIZONTAL;
        frame.add(element_1699642741889, constraints_element_1699642741889);

		JLabel element_1699642743959 = new JLabel("");
        GridBagConstraints constraints_element_1699642743959 = new GridBagConstraints();
        constraints_element_1699642743959.gridx = 6;
        constraints_element_1699642743959.gridy = 5;
        constraints_element_1699642743959.gridwidth = 1;
        constraints_element_1699642743959.gridheight = 1;
        constraints_element_1699642743959.fill = GridBagConstraints.HORIZONTAL;
        frame.add(element_1699642743959, constraints_element_1699642743959);

        element_1699642741889.addActionListener(new ActionListener() {
        
            @Override
        public void actionPerformed(java.awt.event.ActionEvent evt){
            String nombre = element_1699642739721.getText();
            element_1699642743959.setText("¡Hola, "+ nombre +"!");
        }
        });

        frame.setVisible(true);
    }
    }

