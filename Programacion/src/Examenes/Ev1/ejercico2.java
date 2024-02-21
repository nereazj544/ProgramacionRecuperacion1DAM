package Examenes.Ev1;

import java.util.Scanner;

public class ejercico2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Intruduce palabras: (para finalizar exit)");
        boolean exit = false;

        do {
            String palabra = sc.nextLine();
            //Metodo de salir bien :)
            if ("exit".equalsIgnoreCase(palabra)) {
                exit=true;
            }
            System.out.println("Palabra: " + palabra);
            String[] Palabras = palabra.split("");

            for (String Palabra : Palabras) {
                String p = ejercico1.Caracteres(Palabra);
                System.out.println("Transformacion --> " + p);
            }
        } while (!exit);

        System.err.println("Adioooooos :)");

        sc.close();
    }

}
