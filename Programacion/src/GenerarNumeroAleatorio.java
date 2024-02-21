import java.util.List;
import java.util.Random;

public class GenerarNumeroAleatorio {
    private static List<String> paises = List.of("Argentina", "Bolivia", "Brasil", "Chile", "Colombia", "Costa Rica", "Cuba", "Ecuador", "El Salvador", "Guatemala", "Honduras", "México", "Nicaragua", "Panamá", "Paraguay", "Perú", "República Dominicana", "Uruguay", "Venezuela");
    // private static List<String> generos = List.of("F", "M", "M", "M", "F", "F", "M", "F", "M", "F", "M");

    public static void main(String[] args) {

        Random random = new Random();

        int numeroAleatorio = random.nextInt(101) + 1;
        int pais = random.nextInt(paises.size());
        String paissString = paises.get(pais);

        System.out.println("El número aleatorio es: " + numeroAleatorio);
        System.out.println("El país elegido es: " + paissString);
        
    }
}
