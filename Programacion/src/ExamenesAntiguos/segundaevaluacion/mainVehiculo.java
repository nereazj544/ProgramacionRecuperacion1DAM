package ExamenesAntiguos.segundaevaluacion;

import java.util.ArrayList;
import java.util.List;

public class mainVehiculo {
    public static void main(String[] args) {
    List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Coche("1234 ABC", 5));
        // Añade otros vehículos...

        int dias = 7;  // Por ejemplo, alquiler de 7 días
        for (Vehiculo vehiculo : vehiculos) {
            double precio = vehiculo.getPrecioAlquiler(dias);
            System.out.println("El precio de alquiler del " + vehiculo + " es " + precio + " euros.");
        }
    }
}
