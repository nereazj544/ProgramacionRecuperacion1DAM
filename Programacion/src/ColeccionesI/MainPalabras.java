package ColeccionesI;

import java.util.List;
import java.util.Scanner;

public class MainPalabras {
    public static void main(String[] args) {
        Palabras palabras = new Palabras();
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("Selecciona una opcion:\n");
            System.out.println("1. Agregar palabra.\n" +
            "2. Comprobar si esa palabra esta repetida\n"+
            "3. Obtener la longitud de las palabras\n"+
            "4. salir\n");
            System.out.println("Escribe la opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();
        
            switch (opcion) {
                case 1:
                    System.out.println("Mete palabras: ");
                    String palabra = sc.nextLine();
                    palabras.Ap(palabra);
                    break;
                case 2:
                System.out.println("Comprobacion de la palabra: ");
                String pCom = sc.nextLine();
                boolean conPa = palabras.ConPa(pCom);
                System.out.println("¿Contiene la palabra: " + pCom + "?" + conPa);
                    break;
                case 3:
                System.out.println("Longitud: ");
                int longi = sc.nextInt();
                List<String> paLong = palabras.LongPa(longi);
                System.out.println("Palabras de longitud: " + longi + ": " + paLong);
                    break;
                case 4:
                System.out.println("Adios");
                    break;
                default:
                System.out.println("no valio pon otra cosa");
                break;
            }
        } while (opcion !=4);





        /*
         !IGNORAR
         * System.out.println("Introducce palabras (para finalizar ponga 'fin'): ");
         * String palabra = sc.nextLine();
         * while (!palabra.equals("fin")) {
         * palabras.Ap(palabra);
         * palabra = sc.nextLine();
         * System.out.println("Palabras agregadas. \n");
         * }
         * 
         * System.out.
         * println("\nMete una palabra para comprar si esa palabra esta repetida: ");
         * 
         * String palabraCom = sc.nextLine();
         * 
         * boolean ConPa = palabras.ConPa(palabraCom);
         * System.out.println("¿esta su palabra: " + palabraCom + "?" + ConPa);
         * 
         * System.out.println("Ingrese una cantiada: ");
         */

    }
}
