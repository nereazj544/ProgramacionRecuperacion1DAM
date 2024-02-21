package ClaseyObjetos.HerenciayPolimorfios;

import java.util.*;

public abstract class Publicaciones implements Comparable<Publicaciones> {

    int codigo;
    String titulo;
    int año;

    // !CONSTRUCTOR
    public Publicaciones(int codigo, String titulo, int año) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.año = año;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    // !toString
    @Override
    public String toString() {
        return "Publicaciones [codigo= " + codigo + ", titulo= " + titulo + ", año= " + año + "]";
    }

    public abstract int orden();

    // !hashCode
    @Override
    public int hashCode() {
        return Objects.hash(año, codigo, titulo); // !Fijarse en que lo ponga con ObjectS
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Publicaciones other = (Publicaciones) obj;
        return año == other.año && codigo == other.codigo && Objects.equals(titulo, other.titulo);
    }

    @Override
    public int compareTo(Publicaciones o) {
        int Tipo = getClass().getCanonicalName().compareTo(o.getClass().getCanonicalName());
        if (Tipo == 0) {
            int Año = año - o.año;
            if (Año == 0) {
                if (titulo.equals(o.titulo)) {
                    return codigo - o.codigo;
                }
                return titulo.compareTo(o.titulo);
            }
            return Año;
        }
        return Tipo;
    }

}