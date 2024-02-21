package swing.Luna;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.util.Timer;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class M_Luna extends JFrame {
    // Version de UID
    private static final long serialVersionUID = 1L;

    // Objeto Luna
    private Luna luna = new Luna();

    private Timer timer = new Timer(20, (e) -> luna.siguiente());
    JButton playButton;

    M_Luna(String[] args) {
        // Configuracion que siempre esta.
        super("Fases lunares");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setBackground(Color.DARK_GRAY);

        JPanel panel = new JPanel(new FlowLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        panel.setOpaque(false);

        // Imagenes
        JButton anterior = new JButton(
                new ImageIcon(getClass().getResource("/swing/Luna/recurosos_luna/anterior.png")));

        anterior.addActionListener((e) -> luna.siguiente());

        panel.add(anterior);

        playButton = new JButton("Play");
        playButton.addActionListener(this::FasesLunar);

        panel.add(playButton);

        add(panel, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);

    }

    public void FasesLunar(ActionEvent e) {
        if (!timer.isRunning()) {
            playButton.setText("parar");
            timer.start();
        } else {
            playButton.setText("play");
            timer.stop();
        }
    }

    public static void main(final String[] args) {
        SwingUtilities.invokeLater(() -> new M_Luna(args).setVisible(true));

    }
}
