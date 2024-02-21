package Examenes.Nuevo1V;


public class ejercicio1 {
    //Metodo estatico

    public static String Cadenas (String palabras){

        String Pb = "";
        Pb += palabras.charAt(0);
        for (int i = 0; i < palabras.length() - 1; i++) {
            Pb = "";
        }
        Pb += palabras.charAt(palabras.length() -1);        

        return Pb;

    }
    
}