import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.text.StringContent;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SonidoRplay extends JFrame {

    public ReproducirSonido() {
        //1. Configuración básica de la ventana de escritorio
        setTitle("Reproductor de Sonido SENA");
        setSize(300 , 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Agregamos un texto simple a la ventana
        add(new JLabel("Reproduciendo sonido...", SwingConstants.CENTER));

        //2.Llamada al método para reproducir el audio
        reproducirAudio("ding.wav");
    }
    private void reproducirAudio(String rutaArchivo) {
        try {
            //Convertimos la ruta del archivo de texto a un objeto File
            File archivoSonido = new File(rutaArchivo);

            if(archivoSonido.exists()) {
                //Crear la ruta del archivo de texto a un objeto File
            }
        }
    }
    
}
