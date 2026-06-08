import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class DespliegaImagen extends JFrame {

    //declaración de la imagen (variable imagen)
Image miImagen;
    
public DespliegaImagen() {
    setTitle("Despliega Imagen SENA");
    setSize (475, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);

    miImagen = Toolkit.getDefaultToolkit().getImage("logoSena.png");

    JPanel panelDibujo = new JPanel(){
        @Override
        protected void paintComponent (Graphics g) {
            super.paintComponent(g);
            if (miImagen != null) {
                    g.drawImage(miImagen, 0, 0, this);
            }
        }
    };

    add(panelDibujo);

}

public static void main (String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            DespliegaImagen ventana = new DespliegaImagen();
            ventana.setVisible(true);
        });
    }

}


