package ClaseyObjetos;

import java.util.ArrayList;
import java.util.Collection;

public class MainLibro {
    public static void main(String[] args) {
        
        Autor autor = new Autor("Neo", "hafksld@gmail.com", "no especificado");
        
        Collection<Autor> autors = new ArrayList<>();

        autors.add(autor);

        Libro libro = new Libro("Cobarde", autors, 12, 5);

        System.out.println(libro);

        //!Actualiza el pecio + el stock
        libro.setPrecio(13.99f);
        libro.setStock(20);

        System.out.println(libro);
        
    }
    
}
