package ClaseyObjetos.HerenciayPolimorfios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class Libro extends Prestable {
	
	String autores
;
	
	public Libro(int codigo, String titulo, int año) {
		super(codigo, titulo, año);
	}
	
	public Libro(int codigo, String titulo, int año, String autores) {
		super(codigo, titulo, año);
		this.autores = autores;
	}
	
		
	public String getAutores() {
		return autores;
	}
	
	@Override
	public String toString() {
		return "Libro [" + super.toString() + ", " + autores + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(autores);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autores, other.autores);
	}
	
	@Override
	public int orden() {
		return 0;
	}
	
	@Override
	public int compareTo(Publicacion o) {
		int resultado = super.compareTo(o);
		if (resultado == 0)
			return autores.compareTo(((Libro) o).autores);
		return resultado;
	}
}
