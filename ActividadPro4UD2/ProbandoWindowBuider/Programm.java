package ProbandoWindowBuider;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;

public class Programm {
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

		JLabel element_1699640491969 = new JLabel("Hola Mundo");
        GridBagConstraints constraints_element_1699640491969 = new GridBagConstraints();
        constraints_element_1699640491969.gridx = 5;
        constraints_element_1699640491969.gridy = 4;
        constraints_element_1699640491969.gridwidth = 1;
        constraints_element_1699640491969.gridheight = 1;
        constraints_element_1699640491969.fill = GridBagConstraints.HORIZONTAL;
        frame.add(element_1699640491969, constraints_element_1699640491969);

		JButton element_1699640493791 = new JButton("Cerrar");
        GridBagConstraints constraints_element_1699640493791 = new GridBagConstraints();
        constraints_element_1699640493791.gridx = 5;
        constraints_element_1699640493791.gridy = 5;
        constraints_element_1699640493791.gridwidth = 2;
        constraints_element_1699640493791.gridheight = 1;
        constraints_element_1699640493791.fill = GridBagConstraints.HORIZONTAL;
        frame.add(element_1699640493791, constraints_element_1699640493791);
        element_1699640493791.addActionListener(new ActionListener(){
            @Override
        public void actionPerformed(java.awt.event.ActionEvent evt){
                frame.setVisible(false);
        }});

        frame.setVisible(true);
    }
}
