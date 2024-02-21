package ClaseyObjetos;

import java.time.LocalDate;

public class Animal{
    String nombre;
    LocalDate fecha;
    
    public Animal(String nombre, LocalDate fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public Animal(String nombre){
        this.nombre=nombre;
        fecha = LocalDate.now();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }


    @Override
    public String toString() {
        return "Animal [nombre=" + nombre + ", Edad=" + calcularEdad() + "]";
    }
    private int calcularEdad() {
        LocalDate fechaactual = LocalDate.now();
        int edad = fechaactual.getYear() - fecha.getYear();
        if (fechaactual.getMonthValue() < fecha.getMonthValue() || (fechaactual.getMonthValue() == fecha.getMonthValue() && fechaactual.getDayOfMonth() < fecha.getDayOfMonth())) {
            edad--;
        }
        return edad;
    }
    // public static void main(String[] args) {
    //     Animal animal = new Animal("Perro", LocalDate.of(2018, 5, 10));
    //    Animal animal2 = new Animal("leon", LocalDate.of(2000, 5, 12));

    //     System.out.println(animal);
    //     System.out.println(animal2);
    // }
}