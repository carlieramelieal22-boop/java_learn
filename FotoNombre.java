import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class FotoNombre extends JPanel {

private BufferedImage imagen;
private String nombre = "Amelie Carlier";

public FotoNombre(String rutaImagen) {
try {
imagen = ImageIO.read(new File(rutaImagen));
} catch (Exception e) {
System.err.println("No se pudo cargar la imagen: " + rutaImagen);
}
}

@Override
protected void paintComponent(Graphics g) {
super.paintComponent(g);
Graphics2D g2d = (Graphics2D) g;

// Suavizado de texto
g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

int ancho = getWidth();
int alto = getHeight();

// Dibujar imagen escalada al tamaño del panel
if (imagen != null) {
g2d.drawImage(imagen, 0, 0, ancho, alto, this);
} else {
g2d.setColor(Color.LIGHT_GRAY);
g2d.fillRect(0, 0, ancho, alto);
}

// Fuente grande y negrita
Font fuente = new Font("Arial", Font.BOLD, 40);
g2d.setFont(fuente);

FontMetrics fm = g2d.getFontMetrics();
int xTexto = (ancho - fm.stringWidth(nombre)) / 2;
int yTexto = (alto + fm.getAscent()) / 2;

// Sombra para legibilidad
g2d.setColor(Color.BLACK);
g2d.drawString(nombre, xTexto + 2, yTexto + 2);

// Nombre en rojo al centro
g2d.setColor(Color.RED);
g2d.drawString(nombre, xTexto, yTexto);
}

public static void main(String[] args) {
// Cambia esta ruta por la foto que quieras mostrar
String rutaFoto = "C:/Users/WinterOS/Pictures/jnaOj8l4.PNG";

JFrame ventana = new JFrame("Mi Foto con Nombre");
ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
ventana.setSize(600, 500);
ventana.setLocationRelativeTo(null);

FotoNombre panel = new FotoNombre(rutaFoto);
ventana.add(panel);

ventana.setVisible(true);
}
}