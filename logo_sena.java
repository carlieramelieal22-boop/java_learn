public class Main {
    Image miImage;
    getDocumentBase()
    miImagen = getImage(getDocumentBase(), "logoSena.png")

    g.drawImage (miImagen, 20, 30, this);

    import java.awt.*;
    import java.applet.*;

    public class DespliegaImagen extends Applet {
        Image miImage
        public void init(){
            miImage = getImage(getDocumentBase(), "logoSena.png");
        }
        public void paint (Graphics g){
            g.drawImage (miImage, 0, 0, this);
        }
    }
}

import java.awt.*;
import java.applet.*;
public class EscalarImagen extends Applet{
        Image miImage;
        public void init () {
            miImagen = getImage(getDocumentBase(), "logoSena.png");
        }
        public void paint (Graphics g){
            g.drawImage (miImage, 0, 0, 100, 100, this);
        }
}

//iconos

imageIcon miIcono;

miIcono = new ImageIcon ("logoSena.png")
miIcono.paintIcon (this, g, 0, 0);
import java.awt.*;
import java.applet.*;
import javax.swing.*;
public class Icono extends JApplet{
    ImageIcon miIcono;
    public void init () {
            miIcono = new ImageIcon ("logoSena.png") ;     
    }
    public void paint (Graphics g){
            miIcono.paintIcon(this, g, 0, 0,);
    }
}

