package ClaseyObjetos.EJEMPLO;

import java.util.ArrayList;
import java.util.List;

public class MainPersona {
    public static void main(String[] args) {
        List<Persona> list = new ArrayList<>(); //!Esto representa la lista donde se va a guardar las cosas con lista
        
        Persona persona = new Persona(2, "Neo", 12); //!una manera un poco "más alargada"
        
        //!Para añadir personas con el metodo ".add"
        list.add(new Persona(19, "neo", 19)); //! añadido dentro del "add" (sin llamar haber creado una variable de persona)
        list.add(persona); //! aqui ya pilla directamente la variable de persona


        //!Recorrido por indice
        System.out.println("----FOR----");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Persona: " + list.get(i).getNombre());
        }

        //!Por cada persona
        System.out.println("----FOREACH----");
        for (Persona person : list) {
            System.out.println("Persona: " + person.getNombre());
        }
    }
}
