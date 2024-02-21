package ColeccionesI;

import java.util.ArrayList;
import java.util.List;

/**
 * Ej1
 */
public class Palabras {
    List<String> palabras = new ArrayList<>();

    public Palabras() {
        palabras = new ArrayList<>();
    }

    public Palabras(String texto) {
        palabras = new ArrayList<>();
        Ap(texto);
    }

    // !AGREGAR PALABRAS
    public void Ap(String palabra) {
        if(!palabras.contains(palabra)){
            palabras.add(palabra);
        }
    }

    public void Aps(String texto){
        String[] pArray = texto.split(" ");
        for (String palabra : pArray) {
            Ap(palabra);
        }
    }

    //!CONTENIDO DE LAS PALABRAS
    public boolean ConPa(String palabra){
        return palabras.contains(palabra);
    }

    //! Longitud 

    public List<String> LongPa(int Longitud){
        List<String> palabrasLong = new ArrayList<>();
        for (String palabra : palabrasLong) {
            if (palabra.length() == Longitud) {
                palabrasLong.add(palabra);
            }
        }
        return palabrasLong;
    }

}