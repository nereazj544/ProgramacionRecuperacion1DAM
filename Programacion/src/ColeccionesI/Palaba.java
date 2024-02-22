package ColeccionesI;

import java.util.ArrayList;
import java.util.List;

public class Palaba {
    List<String> palabraList;

    public Palaba(){
        palabraList = new ArrayList<>();
    }
    
    public Palaba(String texto){
        palabraList = new ArrayList<>();
        Agregar(texto);
    }

    public void Agregar(String palabra) {
        palabraList.add(palabra);
    }

    public void Agregars(String texto){
        String[] palabrasArray = texto.split(" ");
        for (String palabra : palabrasArray) {
            palabraList.add(palabra);
        }
    }

    public boolean Contiene(String palabra){
        return palabraList.contains(palabra);
    }

    public List<String> ObtenerLong(int lng){
        List<String> lngPalabras = new ArrayList<>();
        for (String palabra : palabraList) {
            if (palabra.length() == lng) {
                lngPalabras.add(palabra);
            }
        }
        return lngPalabras;
    }

    public void Borrar(String palabra){
        palabraList.remove(palabra);
    }

}
