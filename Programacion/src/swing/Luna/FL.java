package swing.Luna;

import java.awt.Image;

import javax.swing.ImageIcon;

public class FL {
    private String nombre;
    private ImageIcon imagen;

    public FL(String nombre){
        this.nombre = nombre;
        imagen = new ImageIcon(getClass().getResource(String.format("/swing/Luna/recurosos_luna/%s.png", nombre)));
    }

    public String getNombre(){
        return nombre;
    }

    public ImageIcon getImageIcon(){
        return imagen;
    }
}
