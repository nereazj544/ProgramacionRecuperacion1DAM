package ClaseyObjetos;

import java.util.Collection;

public class Libro {
    
    String titulo;
    Collection<Autor> autors;
    float precio;
    int stock;

    public Libro(String titulo, Collection<Autor> autors, float precio) {
        this.titulo = titulo;
        this.autors = autors;
        this.precio = precio;
        this.stock = 0;
    }
    public Libro(String titulo, Collection<Autor> autors, float precio, int stock) {
        this.titulo = titulo;
        this.autors = autors;
        this.precio = precio;
        this.stock = stock;
    }


    @Override
    public String toString() {

        StringBuilder autoresBuilder = new StringBuilder();
        for (Autor autor : autors) {
            autoresBuilder.append(autor.getNombre()).append(", ");
        }
        autoresBuilder.delete(autoresBuilder.length() - 2, autoresBuilder.length());

        return "Titulo: " + titulo + ", (autor/a/es: " + autoresBuilder.toString() + "), " + precio + "€ - " + stock + " unidades en stock";


        // return "Libro [titulo=" + titulo + ", autors=" + autors + ", precio=" + precio + ", stock=" + stock + "]";
    }


    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Collection<Autor> getAutors() {
        return autors;
    }
    public void setAutors(Collection<Autor> autors) {
        this.autors = autors;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    

}
