package swing;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class swing1 implements Runnable {
    //Programa basico
    public void run() {
        JFrame frame = new JFrame("MyApp");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container contentPane = frame.getContentPane();
        contentPane.add(new JButton("Pulsa aquí"), BorderLayout.NORTH);
        contentPane.add(new JTextField(), BorderLayout.CENTER);
        
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new swing1());
    }
}
