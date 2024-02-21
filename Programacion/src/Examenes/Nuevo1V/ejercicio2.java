package Examenes.Nuevo1V;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una palabra - finalizar exit");
        boolean exit = false;
        
        do {
            String linea = sc.nextLine();

            //PALABRA QUE INGORA PARA QUE SE OCURRA LA CONDICION DEL WHILE.
            if ("exit".equalsIgnoreCase(linea)) {
                exit = true;
            }

            String [] Linea = linea.split("");

            for (String lineas : Linea) {
                String l = ejercicio1.Cadenas(lineas); //si se pone "linea" solo sale *+la ultima letra
                System.out.println("TRASFORME PAL CUERPO: " + l);
            }
            
        } while (!exit);
        System.out.println("Adios");
        sc.close();
    }
}
