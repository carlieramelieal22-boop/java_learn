import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class ImageJFrame extends JFrame {

    //1. Dedlarar la variable como ImageIcon

    ImageIcon miIcono;

    public ImageJFrame() {
        setTitle("Icono SENA");
        setSize(475, 410);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        miIcono = new ImageIcon("logoSena.png");

        JPanel panelDibujo = new JPanel() {
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                if (miIcono != null) {
                    miIcono.paintIcon(this, g, 0, 0);
                }
            }
        };

        add(panelDibujo);

    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            Icono ventana = new Icono();
            ventana .setVisible(true);
        });
    }
}
