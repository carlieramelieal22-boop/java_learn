import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class logosena {
    public static void main(String[] args) {
        // 1. Crear el marco principal (JFrame)
        JFrame frame = new JFrame("Logo SENA");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 2. Crear el panel (JPanel)
        JPanel panel = new JPanel();

        // 3. Crear un componente y agregarlo al panel
        JButton boton = new JButton("Haz clic aquí");
        panel.add(boton);

        // 4. Agregar el panel al marco
        frame.add(panel);

        // 5. Hacer visible la ventana
        frame.setVisible(true);
    }
}